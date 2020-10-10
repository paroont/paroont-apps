package com.rsatech.realty.core.mw.service.impl.property;

import com.rsatech.realty.core.mw.service.impl.common.RealtyServiceImpl;
import com.rsatech.realty.core.shared.dto.property.common.PostPropertyDto;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;
import com.rsatech.realty.core.shared.service.property.PropertyCacheService;
import com.rsatech.realty.core.shared.service.property.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyCacheServiceImpl extends RealtyServiceImpl implements PropertyCacheService {

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private PropertyCacheServiceHelper cacheServiceHelper;


    public List<PostPropertyDto> findAllPostProperties(PropertyFilter filter) {
        return cacheServiceHelper.findAllPostProperties(filter);
    }

    public void syncAllPostProperties(PropertyFilter filter) {
        cacheServiceHelper.syncAllPostProperties(propertyService.findAllPostProperties(filter));
    }
}
