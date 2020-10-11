package com.paroont.realty.core.mw.service.impl.common;

import com.paroont.realty.core.mw.service.impl.property.PropertyCacheServiceHelper;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ElkRestClient {

    private static final Logger logger = LoggerFactory.getLogger(PropertyCacheServiceHelper.class);


    public RestHighLevelClient makeClient() {
        return new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost", 9200, "http"),
                        new HttpHost("localhost", 9201, "http")));
    }

    public void closeClient(RestHighLevelClient client) {
        if (null != client) {
            try {
                client.close();
            } catch (Exception e) {
                logger.error("Error while closing client: Msg: {}", e.getMessage(), e);
            }
        }
    }
}
