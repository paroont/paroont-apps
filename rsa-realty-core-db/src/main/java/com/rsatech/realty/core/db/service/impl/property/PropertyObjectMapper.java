package com.rsatech.realty.core.db.service.impl.property;

import com.rsatech.realty.core.db.dao.entity.property.post.PostPropertyDo;
import com.rsatech.realty.core.db.dao.entity.property.template.BuildingTemplateDo;
import com.rsatech.realty.core.shared.dto.property.common.PostPropertyDto;
import com.rsatech.realty.core.shared.dto.property.template.BuildingTemplateDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PropertyObjectMapper {
    PropertyObjectMapper INSTANCE = Mappers.getMapper(PropertyObjectMapper.class);

    BuildingTemplateDto toTemplateDto(BuildingTemplateDo data);

    BuildingTemplateDo toTemplateDo(BuildingTemplateDto dto);

    List<BuildingTemplateDto> toTemplateDtos(List<BuildingTemplateDo> data);

    List<BuildingTemplateDo> toTemplateDos(List<BuildingTemplateDto> dto);




    PostPropertyDto toPostPropertyDto(PostPropertyDo data);

    PostPropertyDo toPostPropertyDo(PostPropertyDto dto);

    List<PostPropertyDto> toPostPropertyDtos(List<PostPropertyDo> data);

    List<PostPropertyDo> toPostPropertyDos(List<PostPropertyDto> dto);


}
