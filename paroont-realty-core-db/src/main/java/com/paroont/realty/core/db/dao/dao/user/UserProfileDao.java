package com.paroont.realty.core.db.dao.dao.user;

import com.paroont.realty.core.db.dao.dao.common.RealtyDao;
import com.paroont.realty.core.db.dao.entity.user.UserProfileAuditDo;
import com.paroont.realty.core.db.dao.entity.user.UserProfileDo;
import com.paroont.realty.core.shared.dto.user.UserActionDto;
import com.paroont.realty.core.shared.filter.user.UserProfileFilter;


public interface UserProfileDao extends RealtyDao<UserProfileDo, Long, UserProfileFilter, UserProfileAuditDo, UserActionDto> {

    }