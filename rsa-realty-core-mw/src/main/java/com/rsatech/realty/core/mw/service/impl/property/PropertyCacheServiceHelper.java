package com.rsatech.realty.core.mw.service.impl.property;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rsatech.realty.core.mw.constant.common.RealtyMwConstant;
import com.rsatech.realty.core.mw.service.impl.common.ElkRestClient;
import com.rsatech.realty.core.shared.dto.property.common.PostPropertyDto;
import com.rsatech.realty.core.shared.exception.property.PropertySearchException;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
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

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PropertyCacheServiceHelper implements RealtyMwConstant {

    private static final Logger logger = LoggerFactory.getLogger(PropertyCacheServiceHelper.class);

    @Autowired
    private ElkRestClient elkRestClient;

    public  List<PostPropertyDto> findAllPostProperties(PropertyFilter filter) {
        logger.info("Begin - findAllPostProperties - ELK.");
        String msg = "";
        List<PostPropertyDto> dtos = new ArrayList<>();
        try {
            ObjectMapper objMapper = new ObjectMapper();
            objMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            SearchRequest req = new SearchRequest(ELK_INDEX_POST_PROPERTY);
            SearchSourceBuilder srcBuilder = new SearchSourceBuilder();
            srcBuilder.query(QueryBuilders.matchAllQuery());
            req.source(srcBuilder);
            SearchResponse res = elkRestClient.getClient().search(req, RequestOptions.DEFAULT);
            SearchHits hits = res.getHits();
            for (SearchHit hit : hits) {
                dtos.add(objMapper.readValue(hit.getSourceAsString(), PostPropertyDto.class));
            }
        } catch (Exception e) {
            msg = "Error occurred while searching properties from ELK. " + e.getMessage();
            logger.error(msg, e);
            throw new PropertySearchException(msg, e);
        }
        logger.info("End - findAllPostProperties - ELK.");
        return dtos;
    }
}
