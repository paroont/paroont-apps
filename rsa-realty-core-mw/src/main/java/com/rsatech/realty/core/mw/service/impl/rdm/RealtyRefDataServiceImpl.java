package com.rsatech.realty.core.mw.service.impl.rdm;

import com.rsatech.realty.core.db.service.service.rdm.RealtyRefDataDbService;
import com.rsatech.realty.core.mw.service.impl.common.RealtyServiceImpl;
import com.rsatech.realty.core.shared.service.rdm.RealtyRefDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RealtyRefDataServiceImpl extends RealtyServiceImpl implements RealtyRefDataService {

    @Autowired
    private RealtyRefDataDbService refDataDbService;

    public Map<String, String> findAllPropertyType() {
        return refDataDbService.findAllPropertyType();
    }

    public String findPropertyTypeValue(String key) {
        return refDataDbService.findPropertyTypeValue(key);
    }

    public Map<String, String> findAllPropertyTypeGroup() {
        return refDataDbService.findAllPropertyTypeGroup();
    }


    public String findPropertyTypeGroupValue(String key) {
        return refDataDbService.findPropertyTypeGroupValue(key);
    }

    public Map<String, String> findAllPropertyFurnishing() {
        return refDataDbService.findAllPropertyFurnishing();
    }

    public String findPropertyFurnishingValue(String key) {
        return refDataDbService.findPropertyFurnishingValue(key);
    }

}
