package com.rsatech.realty.web.mw.controller;

import com.rsatech.core.shared.dto.common.CoreResponse;
import com.rsatech.core.shared.enumeration.rdm.AppRefDataTypeEnum;
import com.rsatech.core.shared.facade.rdm.AppRefDataFacade;
import com.rsatech.realty.core.shared.enumeration.rdm.RealtyRefDataTypeEnum;
import com.rsatech.realty.core.shared.service.common.RealtyAllService;
import com.rsatech.realty.web.mw.constant.common.WebMwConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;


@RestController
public class RefDataController implements WebMwConst {
    private static final Logger logger = LoggerFactory.getLogger(RefDataController.class);

    @Autowired
    RealtyAllService realtyAllService;
    @Autowired
    private AppRefDataFacade appRefDataFacade;

    // All App ref data
    @GetMapping(URL_REALTY_RDM_APP_REF_DATA)
    public Map<String, Object> findAllAppRefData() {
        return appRefDataFacade.findAllAppRefData().getResMap();
    }

    // Common Ref Data
    @GetMapping(URL_REALTY_RDM_COMMON_CONTACT_TYPE)
    public Map<String, Object> findAllContactTypes() {
        return findAppRefDataKeyValues(AppRefDataTypeEnum.CONTACT_TYPE);
    }

    @GetMapping(URL_REALTY_RDM_COMMON_STATUS_TYPE)
    public Map<String, Object> findAllCommonStatus() {
        return findAppRefDataKeyValues(AppRefDataTypeEnum.COMMON_STATUS);
    }

    //Realty Ref Data

    @GetMapping(URL_REALTY_RDM_PROPERTY_TYPE)
    public Map<String, Object> findAllPropertyTypes() {
        return findRealtyRefDataKeyValues(RealtyRefDataTypeEnum.PROPERTY_TYPE);
    }

    @GetMapping(URL_REALTY_RDM_PROPERTY_TYPE_GROUP)
    public Map<String, Object> findAllPropertyTypeGroups() {
        return findRealtyRefDataKeyValues(RealtyRefDataTypeEnum.PROPERTY_TYPE_GROUP);
    }

    @GetMapping(URL_REALTY_RDM_PROPERTY_FURNISH_TYPE)
    public Map<String, Object> findAllPropertyFurnishTypes() {
        return findRealtyRefDataKeyValues(RealtyRefDataTypeEnum.PROPERTY_FURNISH_TYPE);
    }


    public Map<String, Object> findAppRefDataKeyValues(AppRefDataTypeEnum refDataType) {
        logger.info("Begin - findAppRefDataKeyValues, Type:[{}]", refDataType.getKey());
        CoreResponse response = new CoreResponse();
        String msg = "";
        Map<String, String> keyValues = new LinkedHashMap<>();
        try {
            switch (refDataType) {
                case COMMON_STATUS:
                    keyValues = realtyAllService.getAppRefDataService().findAllCommonStatus();
                    break;
                case CONTACT_TYPE:
                    keyValues = realtyAllService.getAppRefDataService().findAllContactType();
                    break;
                default:
                    logger.error("App reference data is not defined for Type:[{}]", refDataType.getKey());
            }
            response.addData(keyValues);
            if (null == keyValues || keyValues.isEmpty()) {
                response.addStatus(false);
                msg = String.format("App ref data:[%s] doesn't exist.", refDataType.getTitle());
            }
        } catch (Exception e) {
            response.addStatus(false);
            msg = String.format("Error occurred while getting app reference data for:[%s]", refDataType.getTitle());
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - findAppRefDataKeyValues, Type:[{}]", refDataType.getKey());
        return response.getResMap();
    }

    public Map<String, Object> findRealtyRefDataKeyValues(RealtyRefDataTypeEnum refDataType) {
        logger.info("Begin - findRealtyRefDataKeyValues, Type:[{}]", refDataType.getKey());
        CoreResponse response = new CoreResponse();
        String msg = "";
        Map<String, String> keyValues = new LinkedHashMap<>();
        try {
            switch (refDataType) {
                case PROPERTY_TYPE:
                    keyValues = realtyAllService.getRealtyRefDataService().findAllPropertyType();
                    break;
                case PROPERTY_TYPE_GROUP:
                    keyValues = realtyAllService.getRealtyRefDataService().findAllPropertyTypeGroup();
                    break;
                case PROPERTY_FURNISH_TYPE:
                    keyValues = realtyAllService.getRealtyRefDataService().findAllPropertyFurnishing();
                    break;
                default:
                    logger.error("Realty reference data is not defined for Type:[{}]", refDataType.getKey());
            }
            response.addData(keyValues);
            if (null == keyValues || keyValues.isEmpty()) {
                response.addStatus(false);
                msg = String.format("Realty ref data:[%s] doesn't exist.", refDataType.getTitle());
            }
        } catch (Exception e) {
            response.addStatus(false);
            msg = String.format("Error occurred while getting realty reference data for:[%s]", refDataType.getTitle());
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - findRealtyRefDataKeyValues, Type:[{}]", refDataType.getKey());
        return response.getResMap();
    }
}
