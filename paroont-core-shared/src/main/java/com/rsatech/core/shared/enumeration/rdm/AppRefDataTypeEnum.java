package com.rsatech.core.shared.enumeration.rdm;

import com.rsatech.core.shared.exception.common.CoreEnumException;

import java.util.LinkedHashMap;
import java.util.Map;

public enum AppRefDataTypeEnum {

    COMMON_STATUS("COMMON_STATUS", "Status"),//
    CONTACT_TYPE("CONTACT_TYPE", "Contact Type"),//
    QA("QA", "QA"),//
    UAT("UAT", "UAT"),//
    PRE_PROD("PRE_PROD", "Pre Prod"),//
    PROD("PROD", "Prod");

    private final String  key;
    private final String title;

    private static Map<String,String> keyMap;

    private AppRefDataTypeEnum(String key, String title) {
        this.key = key;
        this.title = title;
    }

    public static AppRefDataTypeEnum byKey(String key) {
        if (COMMON_STATUS.key.equalsIgnoreCase(key)) {
            return COMMON_STATUS;
        } else if (CONTACT_TYPE.key.equalsIgnoreCase(key)) {
            return CONTACT_TYPE;
        } else if (QA.key.equalsIgnoreCase(key)) {
            return QA;
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
            keyMap.put(COMMON_STATUS.key, COMMON_STATUS.title);
            keyMap.put(CONTACT_TYPE.key, CONTACT_TYPE.title);
            keyMap.put(QA.key, QA.title);
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
