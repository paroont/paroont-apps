package com.rsatech.realty.core.mw.service.impl.property;

import com.rsatech.realty.core.db.service.service.property.PropertyDbService;
import com.rsatech.realty.core.db.service.service.user.UserDbService;
import com.rsatech.realty.core.mw.service.impl.common.RealtyServiceImpl;
import com.rsatech.realty.core.shared.dto.property.rent.RentPropertyDto;
import com.rsatech.realty.core.shared.dto.property.sell.SellPropertyDto;
import com.rsatech.realty.core.shared.dto.property.template.BuildingTemplateDto;
import com.rsatech.realty.core.shared.dto.user.UserActionDto;
import com.rsatech.realty.core.shared.dto.user.UserProfileDto;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;
import com.rsatech.realty.core.shared.filter.user.UserProfileFilter;
import com.rsatech.realty.core.shared.service.property.PropertyService;
import com.rsatech.realty.core.shared.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl extends RealtyServiceImpl implements PropertyService {

    @Autowired
   private PropertyDbService propertyDbService;

    public List<BuildingTemplateDto> findAllBuildingTemplates(PropertyFilter filter){
        return propertyDbService.findAllBuildingTemplates(filter);
    }

    public BuildingTemplateDto findBuildingTemplateById(long id){
        return propertyDbService.findBuildingTemplateById(id);
    }


    public List<RentPropertyDto> findAllRentProperties(PropertyFilter filter){
        return propertyDbService.findAllRentProperties(filter);
    }

    public RentPropertyDto findRentPropertyById(long id){
        return propertyDbService.findRentPropertyById(id);
    }


    public List<SellPropertyDto> findAllSellProperties(PropertyFilter filter)
    {
        return propertyDbService.findAllSellProperties(filter);
    }

    public SellPropertyDto findSellPropertyById(long id)
    {
        return propertyDbService.findSellPropertyById(id);
    }



}
