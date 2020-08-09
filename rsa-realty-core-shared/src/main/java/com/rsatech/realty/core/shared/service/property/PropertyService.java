package com.rsatech.realty.core.shared.service.property;

import com.rsatech.realty.core.shared.dto.property.rent.RentPropertyDto;
import com.rsatech.realty.core.shared.dto.property.sell.SellPropertyDto;
import com.rsatech.realty.core.shared.dto.property.template.BuildingTemplateDto;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;
import com.rsatech.realty.core.shared.service.common.RealtyService;

import java.util.List;

public interface PropertyService extends RealtyService {
    public List<BuildingTemplateDto> findAllBuildingTemplates(PropertyFilter filter);

    public BuildingTemplateDto findBuildingTemplateById(long id);


    public List<RentPropertyDto> findAllRentProperties(PropertyFilter filter);

    public RentPropertyDto findRentPropertyById(long id);


    public List<SellPropertyDto> findAllSellProperties(PropertyFilter filter);

    public SellPropertyDto findSellPropertyById(long id);
}
