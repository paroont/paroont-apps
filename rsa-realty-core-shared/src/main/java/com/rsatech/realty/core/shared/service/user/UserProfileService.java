package com.rsatech.realty.core.shared.service.user;

import com.rsatech.realty.core.shared.dto.user.UserProfileDto;
import com.rsatech.realty.core.shared.filter.user.UserProfileFilter;
import com.rsatech.realty.core.shared.service.common.RealtyService;

import java.util.List;

public interface UserProfileService extends RealtyService {
    public List<UserProfileDto> findAllUserProfiles(UserProfileFilter filter);
}
