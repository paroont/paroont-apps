package com.rsatech.realty.core.db.service.impl.property;

import com.rsatech.realty.core.db.dao.dao.property.BuildingTemplateDao;
import com.rsatech.realty.core.db.dao.dao.property.PostPropertyDao;
import com.rsatech.realty.core.db.dao.entity.property.post.PostPropertyDo;
import com.rsatech.realty.core.db.service.impl.common.RealtyDbServiceImpl;
import com.rsatech.realty.core.db.service.service.property.PropertyDbService;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import com.rsatech.realty.core.shared.dto.property.rent.RentPropertyDto;
import com.rsatech.realty.core.shared.dto.property.sell.SellPropertyDto;
import com.rsatech.realty.core.shared.dto.property.template.BuildingTemplateDto;
import com.rsatech.realty.core.shared.enumeration.property.PropertyTransactionTypeEnum;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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
        filter.setTransactionTypeId(PropertyTransactionTypeEnum.RENT.getKey());
        List<RentPropertyDto> dtos = PropertyObjectMapper.INSTANCE.toRentDtos(postPropertyDao.findAll(filter));
        logger.info("End - findAllRentProperties.");
        return dtos;
    }

    public RentPropertyDto findRentPropertyById(long id) {
        logger.info("Begin - findRentPropertyById. PROPERTY_ID:{}", id);
        PropertyFilter filter = new PropertyFilter();
        filter.setPropertyId(id);
        RentPropertyDto dto = findAllRentProperties(filter).stream().filter(Objects::nonNull).findFirst().orElse(null);
        logger.info("End - findRentPropertyById. PROPERTY_ID:{}", id);
        return dto;
    }


    public long saveRentProperty(RentPropertyDto dto, PropertyActionDto action) {
        Long propertyId = dto.getPropertyId();
        logger.info("Begin - saveRentProperty. PROPERTY_ID:{}", propertyId);
        PostPropertyDo data = PropertyObjectMapper.INSTANCE.toRentDo(dto);
        data.setTransactionTypeId(PropertyTransactionTypeEnum.RENT.getKey());
        propertyId = savePostPropertyDo(data, action);
        logger.info("End - saveRentProperty. PROPERTY_ID:{}", propertyId);
        return propertyId;
    }

    public List<SellPropertyDto> findAllSellProperties(PropertyFilter filter) {
        logger.info("Begin - findAllSellProperties.");
        filter.setTransactionTypeId(PropertyTransactionTypeEnum.SELL.getKey());
        List<SellPropertyDto> dtos = PropertyObjectMapper.INSTANCE.toSellDtos(postPropertyDao.findAll(filter));
        logger.info("End - findAllSellProperties.");
        return dtos;
    }

    public SellPropertyDto findSellPropertyById(long id) {
        logger.info("Begin - findSellPropertyById. PROPERTY_ID:{}", id);
        PropertyFilter filter = new PropertyFilter();
        filter.setPropertyId(id);
        SellPropertyDto dto = findAllSellProperties(filter).stream().filter(Objects::nonNull).findFirst().orElse(null);
        logger.info("End - findSellPropertyById. PROPERTY_ID:{}", id);
        return dto;
    }

    public long saveSellProperty(SellPropertyDto dto, PropertyActionDto action) {
        Long propertyId = dto.getPropertyId();
        logger.info("Begin - saveSellProperty. PROPERTY_ID:{}", propertyId);
        PostPropertyDo data = PropertyObjectMapper.INSTANCE.toSellDo(dto);
        data.setTransactionTypeId(PropertyTransactionTypeEnum.SELL.getKey());
        propertyId = savePostPropertyDo(data, action);
        logger.info("End - saveSellProperty. PROPERTY_ID:{}", propertyId);
        return propertyId;
    }

    private Long savePostPropertyDo(PostPropertyDo data, PropertyActionDto action) {
        action.setActionTs(new Timestamp(new Date().getTime()));
        return postPropertyDao.save(data, action);
    }
}
