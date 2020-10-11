package com.paroont.core.shared.enumeration.common;

import com.paroont.core.shared.exception.common.CoreEnumException;

import java.util.LinkedHashMap;
import java.util.Map;

public enum CoreEnvEnum {

    LOCAL("LOCAL", "Local"),//
    DEV("DEV", "Dev"),//
    QA("QA", "QA"),//
    UAT("UAT", "UAT"),//
    PRE_PROD("PRE_PROD", "Pre Prod"),//
    PROD("PROD", "Prod");

    private final String  key;
    private final String title;

    private static Map<String,String> keyMap;

    private CoreEnvEnum(String key, String title) {
        this.key = key;
        this.title = title;
    }

    public static CoreEnvEnum byKey(String key) {
        if (LOCAL.key.equalsIgnoreCase(key)) {
            return LOCAL;
        } else if (DEV.key.equalsIgnoreCase(key)) {
            return DEV;
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
            keyMap.put(LOCAL.key, LOCAL.title);
            keyMap.put(DEV.key, DEV.title);
            keyMap.put(QA.key, QA.title);
            keyMap.put(UAT.key, UAT.title);
            keyMap.put(PRE_PROD.key, PRE_PROD.title);
            keyMap.put(PROD.key, PROD.title);
        }
        return keyMap;
    }
}
