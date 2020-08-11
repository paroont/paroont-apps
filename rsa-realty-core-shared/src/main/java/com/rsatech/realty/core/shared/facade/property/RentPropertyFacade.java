package com.rsatech.realty.core.shared.facade.property;

import com.rsatech.core.shared.dto.common.CoreResponse;
import com.rsatech.realty.core.shared.constant.common.RealtyConst;
import com.rsatech.realty.core.shared.constant.common.RealtyResponseConst;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import com.rsatech.realty.core.shared.dto.property.rent.RentPropertyDto;
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
public class RentPropertyFacade implements RealtyConst {

    private static final Logger logger = LoggerFactory.getLogger(RentPropertyFacade.class);

    @Autowired
    private PropertyService propertyService;

    public CoreResponse findAllRentProperties() {
        logger.info("Begin - findAllRentProperties.");
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            PropertyFilter filter = new PropertyFilter();
            List<RentPropertyDto> dtos = propertyService.findAllRentProperties(filter);
            response.addData(dtos);
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while searching rent properties.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - findAllRentProperties.");
        return response;
    }

    public CoreResponse saveRentProperty(RentPropertyDto dto, PropertyActionDto actionDto) {
        logger.info("Begin - saveRentProperty.");
        CoreResponse response = new CoreResponse();
        String msg = "";
        long propertyId = 0;
        try {
            propertyId = propertyService.saveRentProperty(dto, actionDto);
            response.addResponse(RealtyResponseConst.RESPONSE_REALTY_PROPERTY_ID, propertyId);
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while saving rent property.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - saveRentProperty. PROPERTY_ID:{}", propertyId);
        return response;
    }
}
