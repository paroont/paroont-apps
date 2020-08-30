package com.rsatech.realty.core.shared.facade.property;

import com.rsatech.core.shared.dto.common.CoreResponse;
import com.rsatech.realty.core.shared.constant.common.RealtyConst;
import com.rsatech.realty.core.shared.constant.common.RealtyResponseConst;
import com.rsatech.realty.core.shared.dto.property.common.PostPropertyDto;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
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
public class PropertyFacade implements RealtyConst {

    private static final Logger logger = LoggerFactory.getLogger(PropertyFacade.class);

    @Autowired
    private PropertyService propertyService;

    public CoreResponse findAllPostProperties() {
        logger.info("Begin - findAllProperties.");
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            PropertyFilter filter = new PropertyFilter();
            List<PostPropertyDto> dtos = propertyService.findAllPostProperties(filter);
            response.addData(dtos);
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while searching properties.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - findAllPostProperties.");
        return response;
    }

    public CoreResponse findPostPropertyById(long propertyId){
        logger.info("Begin - findPostPropertyById. PROPERTY_ID:{}", propertyId);
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            PostPropertyDto dto = propertyService.findPostPropertyById(propertyId);
            response.addData(dto);
            if(dto == null)
            {
                response.addStatus(false);
                msg ="sell property doesn't exist for PROPERTY_ID:" + propertyId;
            }

        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while searching property for PROPERTY_ID:" + propertyId;
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - findPostPropertyById. PROPERTY_ID:{}", propertyId);
        return response;
    }

    public CoreResponse savePostProperty(PostPropertyDto dto, PropertyActionDto actionDto) {
        logger.info("Begin - savePostProperty.");
        CoreResponse response = new CoreResponse();
        String msg = "";
        long propertyId = 0;
        try {
            propertyId = propertyService.savePostProperty(dto, actionDto);
            response.addResponse(RealtyResponseConst.RESPONSE_REALTY_PROPERTY_ID, propertyId);
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while saving property.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - savePostProperty. PROPERTY_ID:{}", propertyId);
        return response;
    }
}
