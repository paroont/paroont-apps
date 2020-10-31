package com.paroont.realty.web.mw.controller;

import com.paroont.realty.core.shared.dto.property.common.PostPropertyDto;
import com.paroont.realty.core.shared.dto.property.common.PropertyActionDto;
import com.paroont.realty.core.shared.facade.property.PropertyCacheFacade;
import com.paroont.realty.core.shared.facade.property.PropertyFacade;
import com.paroont.realty.core.shared.filter.property.PropertyFilter;
import com.paroont.realty.web.mw.constant.common.WebMwConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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

        if (allParams.containsKey(URL_REALTY_PROPERTY_PARAM_POSTED_BY_IDS)) {
            filter.setPostedByIds(Arrays.asList(allParams.get(URL_REALTY_PROPERTY_PARAM_POSTED_BY_IDS).trim().split(",")));
        }

        return propertyFacade.findAllPostProperties(filter).getResMap();
    }

    @GetMapping(URL_REALTY_PROPERTY_ID)
    public Map<String, Object> findPostPropertyById(@PathVariable(URL_REALTY_PROPERTY_PARAM_PROPERTY_ID) long propertyId) {
        return propertyFacade.findPostPropertyById(propertyId).getResMap();
    }

    @PostMapping(URL_REALTY_PROPERTY)
    public Map<String, Object> addPostProperty(@RequestBody PostPropertyDto dto,  @RequestHeader(value = URL_COMMON_PARAM_HEADER_PAROONT_UID, defaultValue = "0") String uid) {
        dto.setPropertyId(0);
        return propertyFacade.savePostProperty(dto, createPropertyActionDto(uid)).getResMap();
    }


    @PutMapping(URL_REALTY_PROPERTY_ID)
    public Map<String, Object> updatePostProperty(@RequestBody PostPropertyDto dto, @PathVariable(URL_REALTY_PROPERTY_PARAM_PROPERTY_ID) long propertyId, @RequestHeader(value = URL_COMMON_PARAM_HEADER_PAROONT_UID, defaultValue = "0") String uid) {
        dto.setPropertyId(propertyId);
        return propertyFacade.savePostProperty(dto, createPropertyActionDto(uid)).getResMap();
    }


    private PropertyActionDto createPropertyActionDto(String userId) {
        PropertyActionDto actionDto = new PropertyActionDto();
        actionDto.setUserId(userId);
        return actionDto;
    }


    @GetMapping(URL_REALTY_CACHE_PROPERTY)
    public Map<String, Object> findAllPostPropertiesFromCache(@RequestParam Map<String, String> allParams) {
        logger.info("findAllPostPropertiesFromCache:: allParams={}", allParams);
        PropertyFilter filter = new PropertyFilter();
        if (allParams.containsKey(URL_COMMON_PARAM_SEARCH_QUERY)) {
            filter.setSearchQuery(allParams.get(URL_COMMON_PARAM_SEARCH_QUERY));
        }
        if (allParams.containsKey(URL_COMMON_PARAM_PAGE_NO)) {
            filter.setPageNo(Integer.parseInt(allParams.get(URL_COMMON_PARAM_PAGE_NO)));
        }
        if (allParams.containsKey(URL_COMMON_PARAM_PAGE_SIZE)) {
            filter.setPageSize(Integer.parseInt(allParams.get(URL_COMMON_PARAM_PAGE_SIZE)));
        }
        return propertyCacheFacade.findAllPostProperties(filter).getResMap();
    }

    @GetMapping(URL_REALTY_CACHE_PROPERTY_SYNC)
    public Map<String, Object> syncAllPostPropertiesForCache() {
        PropertyFilter filter = new PropertyFilter();
        filter.setPropertyId(186);
        return propertyCacheFacade.syncAllPostProperties(filter).getResMap();
    }

}
