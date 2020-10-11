package com.rsatech.realty.core.shared.service.property;

import com.rsatech.realty.core.shared.dto.property.common.PostPropertyDto;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import com.rsatech.realty.core.shared.dto.property.template.BuildingTemplateDto;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;
import com.rsatech.realty.core.shared.service.common.RealtyService;

import java.util.List;

public interface PropertyCacheService extends RealtyService {

    public List<PostPropertyDto> findAllPostProperties(PropertyFilter filter);
    public void syncAllPostProperties(PropertyFilter filter);

}
