package com.rsatech.realty.core.db.dao.user;

import com.rsatech.realty.core.db.dao.common.RealtyDao;
import com.rsatech.realty.core.db.dao.entity.common.RealtyAuditDo;
import com.rsatech.realty.core.db.dao.entity.common.RealtyDo;
import com.rsatech.realty.core.db.dao.entity.user.UserProfileAuditDo;
import com.rsatech.realty.core.db.dao.entity.user.UserProfileDo;
import com.rsatech.realty.core.db.dao.impl.common.RealtyDaoImpl;
import com.rsatech.realty.core.shared.dto.common.RealtyActionDto;
import com.rsatech.realty.core.shared.filter.common.RealtyFilter;
import com.rsatech.realty.core.shared.filter.user.UserProfileFilter;


public interface UserProfileDao extends RealtyDao<UserProfileDo, Long, UserProfileFilter, UserProfileAuditDo, RealtyActionDto> {

    }