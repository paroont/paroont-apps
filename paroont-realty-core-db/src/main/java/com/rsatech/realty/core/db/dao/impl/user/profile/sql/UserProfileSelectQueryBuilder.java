package com.rsatech.realty.core.db.dao.impl.user.profile.sql;

import com.rsatech.core.db.dao.impl.user.profile.sql.company.CompanyProfileSelectQueryBuilder;
import com.rsatech.realty.core.db.constant.common.RealtyDbConst;
import com.rsatech.realty.core.shared.filter.user.UserProfileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserProfileSelectQueryBuilder extends CompanyProfileSelectQueryBuilder<UserProfileFilter> implements RealtyDbConst {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileSelectQueryBuilder.class);


    public UserProfileSelectQueryBuilder() {

    }


    @Override
    protected void buildSelectQuery() {
        query.append(DB_REALTY_USER_PROFILE_SELECT);
    }


}
