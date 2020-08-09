package com.rsatech.realty.core.db.service.impl.property;

import com.rsatech.realty.core.db.dao.entity.property.post.PostPropertyDo;
import com.rsatech.realty.core.db.dao.entity.property.template.BuildingTemplateDo;
import com.rsatech.realty.core.shared.dto.property.rent.RentPropertyDto;
import com.rsatech.realty.core.shared.dto.property.sell.SellPropertyDto;
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


    RentPropertyDto toRentDto(PostPropertyDo data);

    PostPropertyDo toRentDo(RentPropertyDto dto);

    List<RentPropertyDto> toRentDtos(List<PostPropertyDo> data);

    List<PostPropertyDo> toRentDos(List<RentPropertyDto> dto);


    SellPropertyDto toSellDto(PostPropertyDo data);

    PostPropertyDo toSellDo(SellPropertyDto dto);

    List<SellPropertyDto> toSellDtos(List<PostPropertyDo> data);

    List<PostPropertyDo> toSellDos(List<SellPropertyDto> dto);
}
