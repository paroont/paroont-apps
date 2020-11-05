package com.paroont.realty.core.shared.facade.property;

import com.paroont.core.shared.dto.common.CorePaginationDto;
import com.paroont.core.shared.dto.common.CoreResponse;
import com.paroont.realty.core.shared.constant.common.RealtyResponseConst;
import com.paroont.realty.core.shared.constant.common.RealtyConst;
import com.paroont.realty.core.shared.dto.property.common.PostPropertyDto;
import com.paroont.realty.core.shared.dto.property.common.PropertyActionDto;
import com.paroont.realty.core.shared.filter.property.PropertyFilter;
import com.paroont.realty.core.shared.service.property.PropertyService;
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
        return findAllPostProperties(new PropertyFilter());
    }
    public CoreResponse findAllPostProperties(PropertyFilter filter) {
        logger.info("Begin - findAllProperties.");
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            CorePaginationDto<PostPropertyDto> paginationDto = new CorePaginationDto<>();
            paginationDto.setData(propertyService.findAllPostProperties(filter));
            paginationDto.setTotalRecords(paginationDto.getData().size());
            response.updateTotalRecords(paginationDto.getTotalRecords());
            response.addData(paginationDto.getData());
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
            msg = "Property saved.";
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
