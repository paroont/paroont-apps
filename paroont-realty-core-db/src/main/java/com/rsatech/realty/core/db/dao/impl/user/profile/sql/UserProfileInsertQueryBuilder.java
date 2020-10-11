package com.rsatech.realty.core.db.dao.impl.user.profile.sql;

import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.impl.user.profile.sql.company.CompanyProfileBaseInsertQueryBuilder;
import com.rsatech.realty.core.db.dao.entity.user.UserProfileDo;
import com.rsatech.realty.core.shared.dto.user.UserActionDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.rsatech.realty.core.db.constant.common.RealtyDbCommonColumnConst.DB_REALTY_COMMON_COLUMN_RERA_ID;
import static com.rsatech.realty.core.db.constant.user.UserProfileDbConst.DB_REALTY_USER_PROFILE_INSERT;

public class UserProfileInsertQueryBuilder extends CompanyProfileBaseInsertQueryBuilder<UserProfileDo, CoreAuditDo, UserActionDto> {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileInsertQueryBuilder.class);


    public UserProfileInsertQueryBuilder() {

    }

    @Override
    protected void buildInsertQuery() {
        super.buildInsertQuery();
        queryParams.addValue(DB_REALTY_COMMON_COLUMN_RERA_ID, data.getReraId());

    }


    protected void buildInsertClause() {
        query.append(DB_REALTY_USER_PROFILE_INSERT);
    }

}
