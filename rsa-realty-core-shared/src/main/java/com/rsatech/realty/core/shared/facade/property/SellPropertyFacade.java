package com.rsatech.realty.core.shared.facade.property;

import com.rsatech.core.shared.dto.common.CoreResponse;
import com.rsatech.realty.core.shared.constant.common.RealtyConst;
import com.rsatech.realty.core.shared.constant.common.RealtyResponseConst;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import com.rsatech.realty.core.shared.dto.property.sell.SellPropertyDto;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;
import com.rsatech.realty.core.shared.service.property.PropertyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class SellPropertyFacade implements RealtyConst {

    private static final Logger logger = LoggerFactory.getLogger(SellPropertyFacade.class);

    @Autowired
    private PropertyService propertyService;

    public CoreResponse findAllSellProperties() {
        logger.info("Begin - findAllSellProperties.");
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            PropertyFilter filter = new PropertyFilter();
            List<SellPropertyDto> dtos = propertyService.findAllSellProperties(filter);
            response.addData(dtos);
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while searching sell properties.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - findAllSellProperties.");
        return response;
    }

    public CoreResponse saveSellProperty(SellPropertyDto dto, PropertyActionDto actionDto) {
        logger.info("Begin - saveSellProperty.");
        CoreResponse response = new CoreResponse();
        String msg = "";
        long propertyId = 0;
        try {
            propertyId = propertyService.saveSellProperty(dto, actionDto);
            response.addResponse(RealtyResponseConst.RESPONSE_REALTY_PROPERTY_ID, propertyId);
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while saving sell property.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - saveSellProperty. PROPERTY_ID:{}", propertyId);
        return response;
    }
}
