package com.rsatech.realty.core.db.dao.dao.user;

import com.rsatech.realty.core.db.dao.dao.common.RealtyDao;
import com.rsatech.realty.core.db.dao.entity.user.UserProfileAuditDo;
import com.rsatech.realty.core.db.dao.entity.user.UserProfileDo;
import com.rsatech.realty.core.shared.dto.common.RealtyActionDto;
import com.rsatech.realty.core.shared.dto.user.UserActionDto;
import com.rsatech.realty.core.shared.filter.user.UserProfileFilter;


public interface UserProfileDao extends RealtyDao<UserProfileDo, Long, UserProfileFilter, UserProfileAuditDo, UserActionDto> {

    }