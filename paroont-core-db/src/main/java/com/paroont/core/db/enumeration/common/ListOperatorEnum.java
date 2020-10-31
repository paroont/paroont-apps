package com.paroont.core.db.enumeration.common;

import com.paroont.core.shared.exception.common.CoreEnumException;

import java.util.LinkedHashMap;
import java.util.Map;

public enum ListOperatorEnum {

    NOT_IN("NOT IN", "Not In"),//
    IN("IN", "In");

    private final String  key;
    private final String title;

    private static Map<String,String> keyMap;

    private ListOperatorEnum(String key, String title) {
        this.key = key;
        this.title = title;
    }

    public static ListOperatorEnum byKey(String key) {
        if (NOT_IN.key.equalsIgnoreCase(key)) {
            return NOT_IN;
        } else if (IN.key.equalsIgnoreCase(key)) {
            return IN;
        } else {
            throw new CoreEnumException("Id or Key is Invalid.");
        }
    }

    public static Map<String, String> getKeyMap(){
        if(null == keyMap){
            keyMap = new LinkedHashMap<>();
            keyMap.put(NOT_IN.key, NOT_IN.title);
            keyMap.put(IN.key, IN.title);
        }
        return keyMap;
    }

    public String getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }


}
