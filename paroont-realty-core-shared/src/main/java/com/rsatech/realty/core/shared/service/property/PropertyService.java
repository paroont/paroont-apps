package com.rsatech.realty.core.shared.service.property;

import com.rsatech.realty.core.shared.dto.property.common.PostPropertyDto;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import com.rsatech.realty.core.shared.dto.property.template.BuildingTemplateDto;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;
import com.rsatech.realty.core.shared.service.common.RealtyService;

import java.util.List;

public interface PropertyService extends RealtyService {
    public List<BuildingTemplateDto> findAllBuildingTemplates(PropertyFilter filter);

    public BuildingTemplateDto findBuildingTemplateById(long id);


    public List<PostPropertyDto> findAllPostProperties(PropertyFilter filter);

    public PostPropertyDto findPostPropertyById(long id);

    public long savePostProperty(PostPropertyDto dto, PropertyActionDto action);


}
