package com.rsatech.realty.core.db.service.impl.rdm;

import com.rsatech.core.db.service.rdm.AppRefDataDbService;
import com.rsatech.realty.core.db.service.impl.common.RealtyDbServiceImpl;
import com.rsatech.realty.core.db.service.service.rdm.RealtyRefDataDbService;
import com.rsatech.realty.core.shared.enumeration.rdm.RealtyRefDataTypeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RealtyRefDataDbServiceImpl extends RealtyDbServiceImpl implements RealtyRefDataDbService {
    private static final Logger logger = LoggerFactory.getLogger(RealtyRefDataDbServiceImpl.class);

    @Autowired
    private AppRefDataDbService refDataDbService;

    public Map<String, String> findAllPropertyType() {
        return refDataDbService.findAllKeyValueByType(RealtyRefDataTypeEnum.PROPERTY_TYPE.getKey());
    }

    public String findPropertyTypeValue(String key) {
        return refDataDbService.findValueByTypeAndKey(RealtyRefDataTypeEnum.PROPERTY_TYPE.getKey(), key);
    }

    public Map<String, String> findAllPropertyTypeGroup() {
        return refDataDbService.findAllKeyValueByType(RealtyRefDataTypeEnum.PROPERTY_TYPE_GROUP.getKey());
    }


    public String findPropertyTypeGroupValue(String key) {
        return refDataDbService.findValueByTypeAndKey(RealtyRefDataTypeEnum.PROPERTY_TYPE_GROUP.getKey(), key);
    }

    public Map<String, String> findAllPropertyFurnishing() {
        return refDataDbService.findAllKeyValueByType(RealtyRefDataTypeEnum.PROPERTY_FURNISH_TYPE.getKey());
    }


    public String findPropertyFurnishingValue(String key) {
        return refDataDbService.findValueByTypeAndKey(RealtyRefDataTypeEnum.PROPERTY_FURNISH_TYPE.getKey(), key);
    }

}
