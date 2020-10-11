package com.rsatech.core.db.enumeration.common;

import com.rsatech.core.shared.exception.common.CoreEnumException;

import java.util.LinkedHashMap;
import java.util.Map;

public enum SqlTypeEnum {

    SELECT("SELECT", "Select"),//
    INSERT("INSERT", "Insert"),//
    UPDATE("UPDATE", "Update"),//
    DELETE("DELETE", "Delete");

    private final String  key;
    private final String title;

    private static Map<String,String> keyMap;

    private SqlTypeEnum(String key, String title) {
        this.key = key;
        this.title = title;
    }

    public static SqlTypeEnum byKey(String key) {
        if (SELECT.key.equalsIgnoreCase(key)) {
            return SELECT;
        } else if (INSERT.key.equalsIgnoreCase(key)) {
            return INSERT;
        } else if (UPDATE.key.equalsIgnoreCase(key)) {
            return UPDATE;
        } else if (DELETE.key.equalsIgnoreCase(key)) {
            return DELETE;
        } else {
            throw new CoreEnumException("Id or Key is Invalid.");
        }
    }

    public static Map<String, String> keyMap(){
        if(null == keyMap){
            keyMap = new LinkedHashMap<>();
            keyMap.put(SELECT.key, SELECT.title);
            keyMap.put(INSERT.key, INSERT.title);
            keyMap.put(UPDATE.key, UPDATE.title);
            keyMap.put(DELETE.key, DELETE.title);
        }
        return keyMap;
    }
}
