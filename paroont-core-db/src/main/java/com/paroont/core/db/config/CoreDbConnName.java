package com.paroont.core.db.config;

import com.paroont.core.db.constant.common.CoreDbConst;
import com.paroont.core.shared.enumeration.common.CoreEnvEnum;

import java.util.HashMap;
import java.util.Map;

public class CoreDbConnName implements CoreDbConst {

    private String dbConnName = DB_CONN_NAME_DEFAULT;

    private CoreEnvEnum coreEnv;


    private Map<String,CoreDbConnProperties> connProperties = new HashMap<>();
    private String defaultConnName;

    public CoreDbConnName()
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
