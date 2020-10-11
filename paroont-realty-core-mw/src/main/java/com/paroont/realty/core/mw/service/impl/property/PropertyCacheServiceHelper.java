package com.paroont.realty.core.mw.service.impl.property;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paroont.realty.core.mw.constant.common.RealtyMwConstant;
import com.paroont.realty.core.mw.service.impl.common.ElkRestClient;
import com.paroont.realty.core.shared.dto.property.common.PostPropertyDto;
import com.paroont.realty.core.shared.exception.property.PropertySearchException;
import com.paroont.realty.core.shared.filter.property.PropertyFilter;
import org.elasticsearch.action.bulk.BulkItemResponse;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PropertyCacheServiceHelper implements RealtyMwConstant {

    private static final Logger logger = LoggerFactory.getLogger(PropertyCacheServiceHelper.class);

    @Autowired
    private ElkRestClient elkRestClient;

    public List<PostPropertyDto> findAllPostProperties(PropertyFilter filter) {
        logger.info("Begin - findAllPostProperties - ELK.");
        String msg = "";
        List<PostPropertyDto> dtos = new ArrayList<>();
        RestHighLevelClient client = null;
        try {
            ObjectMapper objMapper = new ObjectMapper();
            client = elkRestClient.makeClient();
            objMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            SearchRequest req = new SearchRequest(ELK_INDEX_POST_PROPERTY);
            SearchSourceBuilder srcBuilder = new SearchSourceBuilder();
            srcBuilder.query(QueryBuilders.matchAllQuery());
            req.source(srcBuilder);
            SearchResponse res = client.search(req, RequestOptions.DEFAULT);
            SearchHits hits = res.getHits();
            for (SearchHit hit : hits) {
                dtos.add(objMapper.readValue(hit.getSourceAsString(), PostPropertyDto.class));
            }
        } catch (Exception e) {
            msg = "Error occurred while searching properties from ELK. " + e.getMessage();
            logger.error(msg, e);
            throw new PropertySearchException(msg, e);
        }
        finally {
            elkRestClient.closeClient(client);
        }
        logger.info("End - findAllPostProperties - ELK.");
        return dtos;
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
                    bulkReq.add(new IndexRequest(ELK_INDEX_POST_PROPERTY).id(String.valueOf(dto.getPropertyId())).source(json, XContentType.JSON));
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
        }
        finally {
            elkRestClient.closeClient(client);
        }
        logger.info("End - syncAllPostProperties - ELK.");
    }
}
