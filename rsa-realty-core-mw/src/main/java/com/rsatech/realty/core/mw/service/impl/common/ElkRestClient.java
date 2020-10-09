package com.rsatech.realty.core.mw.service.impl.common;

import com.rsatech.realty.core.mw.service.impl.property.PropertyCacheServiceHelper;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ElkRestClient {

    private static final Logger logger = LoggerFactory.getLogger(PropertyCacheServiceHelper.class);
    private RestHighLevelClient client;


    public RestHighLevelClient getClient() {
        return client;
    }

    @PostConstruct
    public void init() {
         client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost", 9200, "http"),
                        new HttpHost("localhost", 9201, "http")));
        logger.info("created rest client.");
    }
}
