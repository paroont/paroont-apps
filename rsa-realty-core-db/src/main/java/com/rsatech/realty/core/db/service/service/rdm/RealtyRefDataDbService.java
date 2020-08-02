package com.rsatech.realty.core.db.service.service.rdm;

import com.rsatech.core.db.service.common.CoreDbService;

import java.util.Map;

public interface RealtyRefDataDbService extends CoreDbService {
    public Map<String, String> findAllPropertyType();

    public String findPropertyTypeValue(String key);

    public Map<String, String> findAllPropertyTypeGroup();


    public String findPropertyTypeGroupValue(String key);

    public Map<String, String> findAllPropertyFurnishing();

    public String findPropertyFurnishingValue(String key);
}
