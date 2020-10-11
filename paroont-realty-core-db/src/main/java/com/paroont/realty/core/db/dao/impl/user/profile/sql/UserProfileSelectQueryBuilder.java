package com.paroont.realty.core.db.dao.impl.user.profile.sql;

import com.paroont.core.db.dao.impl.user.profile.sql.company.CompanyProfileSelectQueryBuilder;
import com.paroont.realty.core.db.constant.common.RealtyDbConst;
import com.paroont.realty.core.db.constant.user.UserProfileDbConst;
import com.paroont.realty.core.shared.filter.user.UserProfileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserProfileSelectQueryBuilder extends CompanyProfileSelectQueryBuilder<UserProfileFilter> implements RealtyDbConst {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileSelectQueryBuilder.class);


    public UserProfileSelectQueryBuilder() {

    }


    @Override
    protected void buildSelectQuery() {
        query.append(UserProfileDbConst.DB_REALTY_USER_PROFILE_SELECT);
    }


}
