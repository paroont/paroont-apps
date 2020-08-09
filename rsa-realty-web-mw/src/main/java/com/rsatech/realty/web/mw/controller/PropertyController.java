package com.rsatech.realty.web.mw.controller;

import com.rsatech.core.shared.dto.common.CoreResponse;
import com.rsatech.core.shared.enumeration.rdm.AppRefDataTypeEnum;
import com.rsatech.realty.core.shared.dto.property.rent.RentPropertyDto;
import com.rsatech.realty.core.shared.dto.property.sell.SellPropertyDto;
import com.rsatech.realty.core.shared.dto.user.UserActionDto;
import com.rsatech.realty.core.shared.dto.user.UserProfileDto;
import com.rsatech.realty.core.shared.enumeration.rdm.RealtyRefDataTypeEnum;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;
import com.rsatech.realty.core.shared.service.common.RealtyAllService;
import com.rsatech.realty.web.mw.constant.common.WebMwConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@RestController
public class PropertyController implements WebMwConst {
    private static final Logger logger = LoggerFactory.getLogger(PropertyController.class);

    @Autowired
    RealtyAllService realtyAllService;


    @GetMapping(URL_REALTY_PROPERTY_RENT)
    public Map<String, Object> findAllRentProperties() {
        logger.info("Begin - findAllRentProperties.");
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            PropertyFilter filter = new PropertyFilter();
            List<RentPropertyDto> dtos = realtyAllService.getPropertyService().findAllRentProperties(filter);
            response.addData(dtos);
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while searching rent properties.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - findAllRentProperties.");
        return response.getResMap();
    }

    @GetMapping(URL_REALTY_PROPERTY_SELL)
    public Map<String, Object> findAllSellProperties() {
        logger.info("Begin - findAllSellProperties.");
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            PropertyFilter filter = new PropertyFilter();
            List<SellPropertyDto> dtos = realtyAllService.getPropertyService().findAllSellProperties(filter);
            response.addData(dtos);
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while searching sell properties.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - findAllSellProperties.");
        return response.getResMap();
    }

}
