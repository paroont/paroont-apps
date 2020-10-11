package com.rsatech.core.db.dao.impl.user.profile.sql.company;

import com.rsatech.core.db.constant.common.CoreDbConst;
import com.rsatech.core.db.dao.impl.user.profile.sql.common.UserProfileBaseSelectQueryBuilder;
import com.rsatech.core.shared.filter.user.CompanyProfileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public  class CompanyProfileSelectQueryBuilder<F extends CompanyProfileFilter> extends UserProfileBaseSelectQueryBuilder<F> implements CoreDbConst {
    private static final Logger logger = LoggerFactory.getLogger(CompanyProfileSelectQueryBuilder.class);


    public CompanyProfileSelectQueryBuilder() {

    }


    @Override
    protected void buildSelectQuery() {
        query.append(DB_COMMON_COMPANY_PROFILE_SELECT);
    }
}
