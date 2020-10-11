package com.paroont.core.db.config;

import java.util.HashMap;
import java.util.Map;

public class CoreDbConnProperties {

    private String driverClassName;
    private String url;

    private Map<String,String> additionalProperties = new HashMap<>();

    public Map<String, String> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, String> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
