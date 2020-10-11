package com.rsatech.realty.core.shared.enumeration.rdm;

import com.rsatech.core.shared.exception.common.CoreEnumException;

import java.util.LinkedHashMap;
import java.util.Map;

public enum RealtyRefDataTypeEnum {

    PROPERTY_TYPE("PROPERTY_TYPE", "Property Type"),//
    PROPERTY_TYPE_GROUP("PROPERTY_TYPE_GROUP", "Property Group Type"),//
    PROPERTY_FURNISH_TYPE("PROPERTY_FURNISH_TYPE", "Property Furnish"),//
    UAT("UAT", "UAT"),//
    PRE_PROD("PRE_PROD", "Pre Prod"),//
    PROD("PROD", "Prod");

    private final String  key;
    private final String title;

    private static Map<String,String> keyMap;

    private RealtyRefDataTypeEnum(String key, String title) {
        this.key = key;
        this.title = title;
    }

    public static RealtyRefDataTypeEnum byKey(String key) {
        if (PROPERTY_TYPE.key.equalsIgnoreCase(key)) {
            return PROPERTY_TYPE;
        } else if (PROPERTY_TYPE_GROUP.key.equalsIgnoreCase(key)) {
            return PROPERTY_TYPE_GROUP;
        } else if (PROPERTY_FURNISH_TYPE.key.equalsIgnoreCase(key)) {
            return PROPERTY_FURNISH_TYPE;
        } else if (UAT.key.equalsIgnoreCase(key)) {
            return UAT;
        }else if (PRE_PROD.key.equalsIgnoreCase(key)) {
            return PRE_PROD;
        }else if (PROD.key.equalsIgnoreCase(key)) {
            return PROD;
        } else {
            throw new CoreEnumException("Id or Key is Invalid.");
        }
    }

    public static Map<String, String> keyMap(){
        if(null == keyMap){
            keyMap = new LinkedHashMap<>();
            keyMap.put(PROPERTY_TYPE.key, PROPERTY_TYPE.title);
            keyMap.put(PROPERTY_TYPE_GROUP.key, PROPERTY_TYPE_GROUP.title);
            keyMap.put(PROPERTY_FURNISH_TYPE.key, PROPERTY_FURNISH_TYPE.title);
            keyMap.put(UAT.key, UAT.title);
            keyMap.put(PRE_PROD.key, PRE_PROD.title);
            keyMap.put(PROD.key, PROD.title);
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
