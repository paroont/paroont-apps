package com.paroont.realty.core.db.dao.impl.user.profile.sql;

import com.paroont.core.db.dao.entity.common.CoreAuditDo;
import com.paroont.core.db.dao.impl.user.profile.sql.company.CompanyProfileBaseInsertQueryBuilder;
import com.paroont.realty.core.db.constant.common.RealtyDbCommonColumnConst;
import com.paroont.realty.core.db.constant.user.UserProfileDbConst;
import com.paroont.realty.core.db.dao.entity.user.UserProfileDo;
import com.paroont.realty.core.shared.dto.user.UserActionDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserProfileInsertQueryBuilder extends CompanyProfileBaseInsertQueryBuilder<UserProfileDo, CoreAuditDo, UserActionDto> {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileInsertQueryBuilder.class);


    public UserProfileInsertQueryBuilder() {

    }

    @Override
    protected void buildInsertQuery() {
        super.buildInsertQuery();
        queryParams.addValue(RealtyDbCommonColumnConst.DB_REALTY_COMMON_COLUMN_RERA_ID, data.getReraId());

    }


    protected void buildInsertClause() {
        query.append(UserProfileDbConst.DB_REALTY_USER_PROFILE_INSERT);
    }

}
