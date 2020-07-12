package com.rsatech.core.shared.dto.common;

import java.util.HashMap;
import java.util.Map;

public class CoreResponse implements CoreDto {

    protected Map<String, Object> resMap = new HashMap<>();

    public CoreResponse() {
        addStatus(true);
    }

    public Object response(String key) {
        return resMap.get(key);
    }

    public void addResponse(String key, Object response) {
        resMap.put(key, response);
    }

    public boolean status() {
        return (boolean) response(RESPONSE_STATUS);
    }

    public void addStatus(boolean status) {
        addResponse(RESPONSE_STATUS, status);
    }


    public String message() {
        return (String) response(RESPONSE_MESSAGE);
    }

    public void addMessage(String message) {
        addResponse(RESPONSE_MESSAGE, message);
    }

    public Object data() {
        return response(RESPONSE_DATA);
    }

    public void addData(String data) {
        addResponse(RESPONSE_DATA, data);
    }
}
