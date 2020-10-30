package com.paroont.realty.core.mw.service.impl.property;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paroont.core.shared.dto.common.CorePaginationDto;
import com.paroont.realty.core.mw.constant.common.RealtyMwConstant;
import com.paroont.realty.core.mw.service.impl.common.ElkRestClient;
import com.paroont.realty.core.shared.dto.property.common.PostPropertyDto;
import com.paroont.realty.core.shared.exception.property.PropertySearchException;
import com.paroont.realty.core.shared.filter.property.PropertyFilter;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.action.bulk.BulkItemResponse;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MultiMatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PropertyCacheServiceHelper implements RealtyMwConstant {

    private static final Logger logger = LoggerFactory.getLogger(PropertyCacheServiceHelper.class);

    private List<String> fullTextFields = new ArrayList<>();
    @Autowired
    private ElkRestClient elkRestClient;

    public CorePaginationDto<PostPropertyDto> findAllPostProperties(PropertyFilter filter) {
        logger.info("Begin - findAllPostProperties - ELK.");
        String msg = "";
        CorePaginationDto<PostPropertyDto> resultDto = new CorePaginationDto<>();

        List<PostPropertyDto> dtos = new ArrayList<>();
        RestHighLevelClient client = null;
        try {
            ObjectMapper objMapper = new ObjectMapper();
            client = elkRestClient.makeClient();
            objMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

            SearchRequest req = new SearchRequest(ELK_POST_PROPERTY_INDEX);
            SearchSourceBuilder srcBuilder = new SearchSourceBuilder();
            BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
            srcBuilder.from(filter.getPageNo()*filter.getPageSize());
            srcBuilder.size(filter.getPageSize());

            String fullTextQuery = filter.getSearchQuery();
            if (StringUtils.isNotBlank(fullTextQuery)) {
                fullTextQuery = fullTextQuery.trim().toLowerCase();
                logger.info("Full_Text_Query: [{}]", fullTextQuery);
                MultiMatchQueryBuilder multiMatchQuery = QueryBuilders.multiMatchQuery(fullTextQuery, fullTextFields.toArray(new String[0]));
                boolQuery.should(multiMatchQuery.fuzziness("6"));
            }
            boolQuery.filter(QueryBuilders.termQuery("statusId", 1));
            srcBuilder.query(boolQuery);
            req.source(srcBuilder);
            logger.info("Search_Request: [{}]", req.toString());
            SearchResponse res = client.search(req, RequestOptions.DEFAULT);
            SearchHits hits = res.getHits();
            resultDto.setTotalRecords(hits.getTotalHits());
            logger.info("Total_No_Of_Result: [{}], No_Of_Result: [{}]", resultDto.getTotalRecords(), hits.getHits().length);
            for (SearchHit hit : hits) {
                dtos.add(objMapper.readValue(hit.getSourceAsString(), PostPropertyDto.class));
            }
        } catch (Exception e) {
            msg = "Error occurred while searching properties from ELK. " + e.getMessage();
            logger.error(msg, e);
            throw new PropertySearchException(msg, e);
        } finally {
            elkRestClient.closeClient(client);
        }
        logger.info("End - findAllPostProperties - ELK.");
        resultDto.setData(dtos);
        return resultDto;
    }


    public void syncAllPostProperties(List<PostPropertyDto> dtos) {
        logger.info("Begin - syncAllPostProperties - ELK.");
        String msg = "";
        RestHighLevelClient client = null;
        try {
            ObjectMapper objMapper = new ObjectMapper();
            client = elkRestClient.makeClient();
            BulkRequest bulkReq = new BulkRequest();
            Optional.ofNullable(dtos).orElse(new ArrayList<>()).forEach(dto -> {
                try {
                    String json = objMapper.writeValueAsString(dto);
                    bulkReq.add(new IndexRequest(ELK_POST_PROPERTY_INDEX).id(String.valueOf(dto.getPropertyId())).source(json, XContentType.JSON));
                } catch (JsonProcessingException e) {
                    String errorMsg = String.format("Error while create bulk sync request for property_Id: [%s], Error_Msg: [%s]", dto.getPropertyId(), e.getMessage());
                    logger.error(errorMsg, e);
                    throw new PropertySearchException(e);
                }
            });
            if (bulkReq.requests().isEmpty()) {
                logger.info("Bulk request is empty - ELK.");
            } else {
                // bulkReq.setRefreshPolicy(WriteRequest.RefreshPolicy.WAIT_UNTIL);
                BulkResponse bulkRes = client.bulk(bulkReq, RequestOptions.DEFAULT);
                List<String> failedMsgs = new ArrayList<>();
                if (bulkRes.hasFailures()) {
                    for (BulkItemResponse bis : bulkRes.getItems()) {
                        if (bis.isFailed()) {
                            msg = String.format("Bulk request failed: Msg: [%s]", bis.getFailure().getMessage());
                            logger.error(msg, bis.getFailure().getCause());
                            failedMsgs.add(msg);
                        }
                    }
                    throw new PropertySearchException("Failed Msg: " + failedMsgs.toString());
                } else {
                    logger.info("Bulk request completed successfully - ELK.");
                }
            }
        } catch (Exception e) {
            msg = "Error occurred while syncing properties to ELK. " + e.getMessage();
            logger.error(msg, e);
            throw new PropertySearchException(msg, e);
        } finally {
            elkRestClient.closeClient(client);
        }
        logger.info("End - syncAllPostProperties - ELK.");
    }

    @PostConstruct
    private void buildFullTextFields() {

        fullTextFields.add(ELK_POST_PROPERTY_FIELD_PROJECT_NAME);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_PROPERTY_TYPE_TITLE);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_PROPERTY_TYPE_GROUP_TITLE);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_BUILDING_NAME);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_BUILDER_NAME);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_TRANSACTION_TYPE_TITLE);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_CONFIGURATION_TITLE);

        fullTextFields.add(ELK_POST_PROPERTY_FIELD_ADDRESS_LINE_1);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_ADDRESS_LINE_2);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_LOCALITY_TITLES);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_CITY_NAME);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_AREA_NAME);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_STATE_NAME);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_LANDMARK_NAME);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_PIN_CODE);

        fullTextFields.add(ELK_POST_PROPERTY_FIELD_AVAILABILITY_TITLE);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_PROPERTY_AGE_TITLE);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_FURNISH_TITLE);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_RERA_ID);

        fullTextFields.add(ELK_POST_PROPERTY_FIELD_POSTED_BY_NAME);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_POSTED_USER_TYPE_TITLE);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_TENANT_TYPE_TITLE);
        fullTextFields.add(ELK_POST_PROPERTY_FIELD_SALE_TYPE_TITLE);
    }
}
