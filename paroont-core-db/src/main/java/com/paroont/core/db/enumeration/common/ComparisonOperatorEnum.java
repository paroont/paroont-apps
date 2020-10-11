package com.paroont.core.db.enumeration.common;

import com.paroont.core.shared.exception.common.CoreEnumException;

import java.util.LinkedHashMap;
import java.util.Map;

public enum ComparisonOperatorEnum {

    EQUAL_TO("=", "Equal to"),//
    NOT_EQUAL_TO("!=", "Not equal To"),//
    LESS_THAN("<", "Less than"),//
    GREATER_THAN(">", "Greater than");

    private final String  key;
    private final String title;

    private static Map<String,String> keyMap;

    private ComparisonOperatorEnum(String key, String title) {
        this.key = key;
        this.title = title;
    }

    public static ComparisonOperatorEnum byKey(String key) {
        if (EQUAL_TO.key.equalsIgnoreCase(key)) {
            return EQUAL_TO;
        } else if (NOT_EQUAL_TO.key.equalsIgnoreCase(key)) {
            return NOT_EQUAL_TO;
        } else if (LESS_THAN.key.equalsIgnoreCase(key)) {
            return LESS_THAN;
        } else if (GREATER_THAN.key.equalsIgnoreCase(key)) {
            return GREATER_THAN;
        } else {
            throw new CoreEnumException("Id or Key is Invalid.");
        }
    }

    public static Map<String, String> getKeyMap(){
        if(null == keyMap){
            keyMap = new LinkedHashMap<>();
            keyMap.put(EQUAL_TO.key, EQUAL_TO.title);
            keyMap.put(NOT_EQUAL_TO.key, NOT_EQUAL_TO.title);
            keyMap.put(LESS_THAN.key, LESS_THAN.title);
            keyMap.put(GREATER_THAN.key, GREATER_THAN.title);
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
