package com.rsatech.realty.core.shared.enumeration.property;

import com.rsatech.core.shared.exception.common.CoreEnumException;

import java.util.LinkedHashMap;
import java.util.Map;

public enum PropertyTransactionTypeEnum {

    SELL(1, "Sell"),//
    RENT(2, "Rent"),//
    PG(3, "PG");

    private final int  key;
    private final String title;

    private static Map<String,String> keyMap;

    private PropertyTransactionTypeEnum(int key, String title) {
        this.key = key;
        this.title = title;
    }

    public static PropertyTransactionTypeEnum byKey(int key) {
        if (SELL.key == key) {
            return SELL;
        } else if (RENT.key ==key) {
            return RENT;
        }else if (PG.key ==key) {
            return PG;
        } else {
            throw new CoreEnumException("Id or Key is Invalid.");
        }
    }

    public static Map<String, String> keyMap(){
        if(null == keyMap){
            keyMap = new LinkedHashMap<>();
            keyMap.put(String.valueOf(SELL.key), SELL.title);
            keyMap.put(String.valueOf(RENT.key), RENT.title);
            keyMap.put(String.valueOf(PG.key), PG.title);
        }
        return keyMap;
    }

    public int getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }
}
