package com.paroont.realty.core.shared.service.user;

import com.paroont.realty.core.shared.service.common.RealtyService;
import com.paroont.realty.core.shared.dto.user.UserActionDto;
import com.paroont.realty.core.shared.dto.user.UserProfileDto;
import com.paroont.realty.core.shared.filter.user.UserProfileFilter;

import java.util.List;

public interface UserService extends RealtyService {
    public List<UserProfileDto>  findAllUserProfiles(UserProfileFilter filter);
    public UserProfileDto findUserProfileById(long id);
    public long saveUserProfile(UserProfileDto dto, UserActionDto action);
}
