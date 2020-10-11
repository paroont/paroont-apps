package com.paroont.core.db.dao.impl.user.profile.sql.company;

import com.paroont.core.db.constant.common.CoreDbConst;
import com.paroont.core.db.constant.profile.CoreProfileDbConst;
import com.paroont.core.db.dao.impl.user.profile.sql.common.UserProfileBaseSelectQueryBuilder;
import com.paroont.core.shared.filter.user.CompanyProfileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public  class CompanyProfileSelectQueryBuilder<F extends CompanyProfileFilter> extends UserProfileBaseSelectQueryBuilder<F> implements CoreDbConst {
    private static final Logger logger = LoggerFactory.getLogger(CompanyProfileSelectQueryBuilder.class);


    public CompanyProfileSelectQueryBuilder() {

    }


    @Override
    protected void buildSelectQuery() {
        query.append(CoreProfileDbConst.DB_COMMON_COMPANY_PROFILE_SELECT);
    }
}
