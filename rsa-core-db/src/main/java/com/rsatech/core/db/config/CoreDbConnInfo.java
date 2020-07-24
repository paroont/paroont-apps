package com.rsatech.core.db.config;

import java.util.HashMap;
import java.util.Map;

public class CoreDbConnInfo {

    private Map<String,CoreDbConnProperties> connProperties = new HashMap<>();
    private String defaultConnName;

    public CoreDbConnInfo()
    {

    }
    public Map<String, CoreDbConnProperties> getConnProperties() {
        return connProperties;
    }

    public void setConnProperties(Map<String, CoreDbConnProperties> connProperties) {
        this.connProperties = connProperties;
    }

    public String getDefaultConnName() {
        return defaultConnName;
    }

    public void setDefaultConnName(String defaultConnName) {
        this.defaultConnName = defaultConnName;
    }
}
