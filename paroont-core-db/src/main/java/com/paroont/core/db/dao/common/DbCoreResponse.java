package com.paroont.core.db.dao.common;

import com.paroont.core.db.constant.common.CoreDbConst;

import java.util.HashMap;
import java.util.Map;


public class DbCoreResponse implements CoreDbConst {

    protected Map<String, Object> resMap = new HashMap<>();

    public DbCoreResponse() {
        addStatus(true);
    }

    public Object response(String key) {
        return resMap.get(key);
    }

    public void addResponse(String key, Object response) {
        resMap.put(key, response);
    }

    public boolean status() {
        return (Boolean) response(DB_RESPONSE_STATUS);
    }

    public void addStatus(boolean status) {
        addResponse(DB_RESPONSE_STATUS, status);
    }


    public long generatedId() {
        return (Long) response(DB_RESPONSE_GENERATED_ID);
    }

    public void addGeneratedId(long id) {
        addResponse(DB_RESPONSE_GENERATED_ID, id);
    }

    public int dmlCount() {
        return (Integer) response(DB_RESPONSE_DML_COUNT);
    }

    public void addDmlCount(int dmlCount) {
        addResponse(DB_RESPONSE_DML_COUNT, dmlCount);
    }



    public Map<String, Object> getResMap() {
        return resMap;
    }

    public void setResMap(Map<String, Object> resMap) {
        this.resMap = resMap;
    }
}
