package com.paroont.realty.core.mw.service.impl.property;

import com.paroont.realty.core.db.service.service.property.PropertyDbService;
import com.paroont.realty.core.mw.service.impl.common.RealtyServiceImpl;
import com.paroont.realty.core.shared.dto.property.common.PostPropertyDto;
import com.paroont.realty.core.shared.dto.property.common.PropertyActionDto;
import com.paroont.realty.core.shared.dto.property.template.BuildingTemplateDto;
import com.paroont.realty.core.shared.filter.property.PropertyFilter;
import com.paroont.realty.core.shared.service.property.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl extends RealtyServiceImpl implements PropertyService {

    @Autowired
   private PropertyDbService propertyDbService;
    @Autowired
    private  PropertyCacheServiceHelper cacheHelper;

    public List<BuildingTemplateDto> findAllBuildingTemplates(PropertyFilter filter){
        return propertyDbService.findAllBuildingTemplates(filter);
    }

    public BuildingTemplateDto findBuildingTemplateById(long id){
        return propertyDbService.findBuildingTemplateById(id);
    }

    public List<PostPropertyDto> findAllPostProperties(PropertyFilter filter){
        return propertyDbService.findAllPostProperties(filter);
    }

    public PostPropertyDto findPostPropertyById(long id){
        return propertyDbService.findPostPropertyById(id);
    }


    public long savePostProperty(PostPropertyDto dto, PropertyActionDto actionDto){
        return propertyDbService.savePostProperty(dto, actionDto);
    }
}
