package com.rsatech.realty.core.db.dao.impl.user.profile.sql;

import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.impl.common.sql.DbQueryUtil;
import com.rsatech.core.db.dao.impl.user.profile.sql.common.UserProfileBaseUpdateQueryBuilder;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import com.rsatech.realty.core.db.constant.common.RealtyDbConst;
import com.rsatech.realty.core.db.dao.entity.user.UserProfileDo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class UserProfileUpdateQueryBuilder extends UserProfileBaseUpdateQueryBuilder<UserProfileDo, CoreAuditDo, CoreActionBaseDto> implements RealtyDbConst {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileUpdateQueryBuilder.class);


    public UserProfileUpdateQueryBuilder() {

    }


    protected void buildUpdateQuery() {
        super.buildUpdateQuery();

        String reraId = Optional.ofNullable(data.getReraId()).orElse("");
        String oldReraId = Optional.ofNullable(oldData.getReraId()).orElse("");
        if (!reraId.equals(oldReraId)) {
            updateFound = true;
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_REALTY_USER_PROFILE_COLUMN_RERA_ID));
            queryParams.addValue(DB_REALTY_USER_PROFILE_COLUMN_RERA_ID, reraId);
            auditQueryParams.addValue(DB_REALTY_USER_PROFILE_COLUMN_RERA_ID, reraId);
        }
    }





}
