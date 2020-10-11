package com.paroont.core.db.enumeration.common;

import com.paroont.core.shared.exception.common.CoreEnumException;

import java.util.LinkedHashMap;
import java.util.Map;

public enum LogicalOperatorEnum {

    AND("AND", "And"),//
    OR("OR", "Or"),//
    NOT("NOT", "Not"),//
    IN("IN", "In");

    private final String  key;
    private final String title;

    private static Map<String,String> keyMap;

    private LogicalOperatorEnum(String key, String title) {
        this.key = key;
        this.title = title;
    }

    public static LogicalOperatorEnum byKey(String key) {
        if (AND.key.equalsIgnoreCase(key)) {
            return AND;
        } else if (OR.key.equalsIgnoreCase(key)) {
            return OR;
        } else if (NOT.key.equalsIgnoreCase(key)) {
            return NOT;
        } else if (IN.key.equalsIgnoreCase(key)) {
            return IN;
        } else {
            throw new CoreEnumException("Id or Key is Invalid.");
        }
    }

    public static Map<String, String> getKeyMap(){
        if(null == keyMap){
            keyMap = new LinkedHashMap<>();
            keyMap.put(AND.key, AND.title);
            keyMap.put(OR.key, OR.title);
            keyMap.put(NOT.key, NOT.title);
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
