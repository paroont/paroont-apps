package com.paroont.realty.core.db.service.impl.user;

import com.paroont.realty.core.db.dao.entity.user.UserProfileDo;
import com.paroont.realty.core.shared.dto.user.UserProfileDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserProfileMapper {
    UserProfileMapper INSTANCE = Mappers.getMapper(UserProfileMapper.class);
    UserProfileDto toDto(UserProfileDo data);
    UserProfileDo toDo(UserProfileDto dto);
    List<UserProfileDto> toDtos(List<UserProfileDo> datas);
    List<UserProfileDo> toDos(List<UserProfileDto> dtos);
}
