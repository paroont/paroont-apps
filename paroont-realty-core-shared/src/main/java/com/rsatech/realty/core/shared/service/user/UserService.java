package com.rsatech.realty.core.shared.service.user;

import com.rsatech.realty.core.shared.dto.common.RealtyActionDto;
import com.rsatech.realty.core.shared.dto.user.UserActionDto;
import com.rsatech.realty.core.shared.dto.user.UserProfileDto;
import com.rsatech.realty.core.shared.filter.user.UserProfileFilter;
import com.rsatech.realty.core.shared.service.common.RealtyService;

import java.util.List;

public interface UserService extends RealtyService {
    public List<UserProfileDto>  findAllUserProfiles(UserProfileFilter filter);
    public UserProfileDto findUserProfileById(long id);
    public long saveUserProfile(UserProfileDto dto, UserActionDto action);
}
