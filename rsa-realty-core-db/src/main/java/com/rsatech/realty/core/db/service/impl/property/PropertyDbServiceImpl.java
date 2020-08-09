package com.rsatech.realty.core.db.service.impl.property;

import com.rsatech.realty.core.db.dao.dao.property.BuildingTemplateDao;
import com.rsatech.realty.core.db.dao.dao.property.PostPropertyDao;
import com.rsatech.realty.core.db.service.impl.common.RealtyDbServiceImpl;
import com.rsatech.realty.core.db.service.service.property.PropertyDbService;
import com.rsatech.realty.core.shared.dto.property.rent.RentPropertyDto;
import com.rsatech.realty.core.shared.dto.property.sell.SellPropertyDto;
import com.rsatech.realty.core.shared.dto.property.template.BuildingTemplateDto;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyDbServiceImpl extends RealtyDbServiceImpl implements PropertyDbService {
    private static final Logger logger = LoggerFactory.getLogger(PropertyDbServiceImpl.class);

    @Autowired
    private BuildingTemplateDao buildingTemplateDao;
    @Autowired
   private PostPropertyDao postPropertyDao;

    public List<BuildingTemplateDto> findAllBuildingTemplates(PropertyFilter filter) {
        logger.info("Begin - findAllBuildingTemplates.");
        List<BuildingTemplateDto> dtos = PropertyObjectMapper.INSTANCE.toTemplateDtos(buildingTemplateDao.findAll(filter));
        logger.info("End - findAllBuildingTemplates.");
        return dtos;
    }

    public BuildingTemplateDto findBuildingTemplateById(long id) {
        logger.info("Begin - findBuildingTemplateById. TEMPLATE_ID:{}", id);
        BuildingTemplateDto dto = PropertyObjectMapper.INSTANCE.toTemplateDto(buildingTemplateDao.findById(id));
        logger.info("End - findBuildingTemplateById. TEMPLATE_ID:{}", id);
        return dto;
    }


    public List<RentPropertyDto> findAllRentProperties(PropertyFilter filter) {
        logger.info("Begin - findAllRentProperties.");
        List<RentPropertyDto> dtos = PropertyObjectMapper.INSTANCE.toRentDtos(postPropertyDao.findAll(filter));
        logger.info("End - findAllRentProperties.");
        return dtos;
    }

    public RentPropertyDto findRentPropertyById(long id) {
        logger.info("Begin - findRentPropertyById. PROPERTY_ID:{}", id);
        RentPropertyDto dto = PropertyObjectMapper.INSTANCE.toRentDto(postPropertyDao.findById(id));
        logger.info("End - findRentPropertyById. PROPERTY_ID:{}", id);
        return dto;
    }



    public List<SellPropertyDto> findAllSellProperties(PropertyFilter filter) {
        logger.info("Begin - findAllSellProperties.");
        List<SellPropertyDto> dtos = PropertyObjectMapper.INSTANCE.toSellDtos(postPropertyDao.findAll(filter));
        logger.info("End - findAllSellProperties.");
        return dtos;
    }

    public SellPropertyDto findSellPropertyById(long id) {
        logger.info("Begin - findSellPropertyById. PROPERTY_ID:{}", id);
        SellPropertyDto dto = PropertyObjectMapper.INSTANCE.toSellDto(postPropertyDao.findById(id));
        logger.info("End - findSellPropertyById. PROPERTY_ID:{}", id);
        return dto;
    }
}
