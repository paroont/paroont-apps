package com.rsatech.realty.core.db.dao.impl.user.profile.sql;

import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.impl.user.profile.sql.company.CompanyProfileBaseUpdateQueryBuilder;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import com.rsatech.realty.core.db.constant.common.RealtyDbConst;
import com.rsatech.realty.core.db.dao.entity.user.UserProfileDo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserProfileUpdateQueryBuilder extends CompanyProfileBaseUpdateQueryBuilder<UserProfileDo, CoreAuditDo, CoreActionBaseDto> implements RealtyDbConst {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileUpdateQueryBuilder.class);


    public UserProfileUpdateQueryBuilder() {

    }


    protected void buildUpdateQuery() {
        super.buildUpdateQuery();

        buildStringUpdateQuery(data.getReraId(), oldData.getReraId(), DB_REALTY_USER_PROFILE_COLUMN_RERA_ID);
    }


}
