package com.rsatech.realty.web.mw.controller;

import com.rsatech.realty.core.shared.dto.property.common.PostPropertyDto;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import com.rsatech.realty.core.shared.facade.property.PropertyCacheFacade;
import com.rsatech.realty.core.shared.facade.property.PropertyFacade;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;
import com.rsatech.realty.web.mw.constant.common.WebMwConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class PropertyController implements WebMwConst {
    private static final Logger logger = LoggerFactory.getLogger(PropertyController.class);

    @Autowired
    private PropertyFacade propertyFacade;

    @Autowired
    private PropertyCacheFacade propertyCacheFacade;

    @GetMapping(URL_REALTY_PROPERTY)
    public Map<String, Object> findAllPostProperties(@RequestParam Map<String, String> allParams) {
        logger.info("findAllPostProperties:: allParams={}", allParams);
        PropertyFilter filter = new PropertyFilter();
        if (allParams.containsKey(URL_COMMON_PARAM_SEARCH_QUERY)) {
            filter.setSearchQuery(allParams.get(URL_COMMON_PARAM_SEARCH_QUERY));
        }

        return propertyFacade.findAllPostProperties(filter).getResMap();
    }

    @GetMapping(URL_REALTY_PROPERTY_ID)
    public Map<String, Object> findPostPropertyById(@PathVariable(URL_REALTY_PROPERTY_PARAM_PROPERTY_ID) long propertyId) {
        return propertyFacade.findPostPropertyById(propertyId).getResMap();
    }

    @PostMapping(URL_REALTY_PROPERTY)
    public Map<String, Object> addPostProperty(@RequestBody PostPropertyDto dto) {
        dto.setPropertyId(0);
        return propertyFacade.savePostProperty(dto, createPropertyActionDto()).getResMap();
    }


    @PutMapping(URL_REALTY_PROPERTY_ID)
    public Map<String, Object> updatePostProperty(@RequestBody PostPropertyDto dto, @PathVariable(URL_REALTY_PROPERTY_PARAM_PROPERTY_ID) long propertyId) {
        dto.setPropertyId(propertyId);
        return propertyFacade.savePostProperty(dto, createPropertyActionDto()).getResMap();
    }


    private PropertyActionDto createPropertyActionDto() {
        PropertyActionDto actionDto = new PropertyActionDto();
        actionDto.setLoginId("rahulk");
        return actionDto;
    }


    @GetMapping(URL_REALTY_CACHE_PROPERTY)
    public Map<String, Object> findAllPostPropertiesFromCache(@RequestParam Map<String, String> allParams) {
        logger.info("findAllPostPropertiesFromCache:: allParams={}", allParams);
        PropertyFilter filter = new PropertyFilter();
        if (allParams.containsKey(URL_COMMON_PARAM_SEARCH_QUERY)) {
            filter.setSearchQuery(allParams.get(URL_COMMON_PARAM_SEARCH_QUERY));
        }
        return propertyCacheFacade.findAllPostProperties(filter).getResMap();
    }

}
