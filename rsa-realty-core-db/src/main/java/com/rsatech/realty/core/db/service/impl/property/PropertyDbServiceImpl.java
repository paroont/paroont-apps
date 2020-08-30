package com.rsatech.realty.core.db.service.impl.property;

import com.rsatech.realty.core.db.dao.dao.property.BuildingTemplateDao;
import com.rsatech.realty.core.db.dao.dao.property.PostPropertyDao;
import com.rsatech.realty.core.db.dao.entity.property.post.PostPropertyDo;
import com.rsatech.realty.core.db.service.impl.common.RealtyDbServiceImpl;
import com.rsatech.realty.core.db.service.service.property.PropertyDbService;
import com.rsatech.realty.core.shared.dto.property.common.PostPropertyDto;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
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

    public List<PostPropertyDto> findAllPostProperties(PropertyFilter filter) {
        logger.info("Begin - findAllPostProperties.");
        List<PostPropertyDto> dtos = PropertyObjectMapper.INSTANCE.toPostPropertyDtos(postPropertyDao.findAll(filter));
        logger.info("End - findAllPostProperties.");
        return dtos;
    }

    public PostPropertyDto findPostPropertyById(long id) {
        logger.info("Begin - findPostPropertyById. PROPERTY_ID:{}", id);
        PropertyFilter filter = new PropertyFilter();
        filter.setPropertyId(id);
        PostPropertyDto dto = findAllPostProperties(filter).stream().filter(Objects::nonNull).findFirst().orElse(null);
        logger.info("End - findPostPropertyById. PROPERTY_ID:{}", id);
        return dto;
    }


    public long savePostProperty(PostPropertyDto dto, PropertyActionDto action) {
        Long propertyId = dto.getPropertyId();
        logger.info("Begin - savePostProperty. PROPERTY_ID:{}", propertyId);
        PostPropertyDo data = PropertyObjectMapper.INSTANCE.toPostPropertyDo(dto);
        propertyId = savePostPropertyDo(data, action);
        logger.info("End - savePostProperty. PROPERTY_ID:{}", propertyId);
        return propertyId;
    }

    private Long savePostPropertyDo(PostPropertyDo data, PropertyActionDto action) {
        action.setActionTs(new Timestamp(new Date().getTime()));
        return postPropertyDao.save(data, action);
    }
}
