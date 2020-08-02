package com.rsatech.realty.core.shared.service.rdm;

import com.rsatech.realty.core.shared.service.common.RealtyService;

import java.util.Map;

public interface RealtyRefDataService extends RealtyService {
    public Map<String, String> findAllPropertyType();

    public String findPropertyTypeValue(String key);

    public Map<String, String> findAllPropertyTypeGroup();


    public String findPropertyTypeGroupValue(String key);

    public Map<String, String> findAllPropertyFurnishing();

    public String findPropertyFurnishingValue(String key);
}
