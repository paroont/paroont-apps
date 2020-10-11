package com.paroont.realty.core.shared.facade.property;

import com.paroont.core.shared.dto.common.CoreResponse;
import com.paroont.realty.core.shared.dto.property.common.PostPropertyDto;
import com.paroont.realty.core.shared.filter.property.PropertyFilter;
import com.paroont.realty.core.shared.service.property.PropertyCacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PropertyCacheFacade {

    private static final Logger logger = LoggerFactory.getLogger(PropertyCacheFacade.class);

    @Autowired
    private PropertyCacheService propertyCacheService;

    public CoreResponse findAllPostProperties(PropertyFilter filter) {
        logger.info("Begin - findAllProperties. - Cache");
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            List<PostPropertyDto> dtos = propertyCacheService.findAllPostProperties(filter);
            response.addData(dtos);
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while searching properties from cache.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - findAllPostProperties. - Cache");
        return response;
    }

    public CoreResponse syncAllPostProperties(PropertyFilter filter) {
        logger.info("Begin - syncAllPostProperties. - Cache");
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
             propertyCacheService.syncAllPostProperties(filter);

        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while syncing properties for cache.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - syncAllPostProperties. - Cache");
        return response;
    }
}
