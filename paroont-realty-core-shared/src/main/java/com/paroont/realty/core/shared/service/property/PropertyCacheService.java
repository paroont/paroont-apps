package com.paroont.realty.core.shared.service.property;

import com.paroont.core.shared.dto.common.CorePaginationDto;
import com.paroont.realty.core.shared.dto.property.common.PostPropertyDto;
import com.paroont.realty.core.shared.filter.property.PropertyFilter;
import com.paroont.realty.core.shared.service.common.RealtyService;

import java.util.List;

public interface PropertyCacheService extends RealtyService {

    public CorePaginationDto<PostPropertyDto> findAllPostProperties(PropertyFilter filter);
    public void syncAllPostProperties(PropertyFilter filter);

}
