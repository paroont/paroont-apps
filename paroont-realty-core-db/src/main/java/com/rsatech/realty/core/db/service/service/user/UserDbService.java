package com.rsatech.realty.core.db.service.service.user;

import com.rsatech.realty.core.db.service.service.common.RealtyDbService;
import com.rsatech.realty.core.shared.dto.common.RealtyActionDto;
import com.rsatech.realty.core.shared.dto.user.UserActionDto;
import com.rsatech.realty.core.shared.dto.user.UserProfileDto;
import com.rsatech.realty.core.shared.filter.user.UserProfileFilter;

import java.util.List;

public interface UserDbService extends RealtyDbService {
    public List<UserProfileDto> findAllUserProfiles(UserProfileFilter filter);
    public UserProfileDto findUserProfileById(long id);
    public long saveUserProfile(UserProfileDto dto, UserActionDto action);
}
