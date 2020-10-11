package com.paroont.core.db.dao.impl.user.profile.sql.company;

import com.paroont.core.db.dao.entity.common.CoreAuditDo;
import com.paroont.core.db.dao.entity.user.CompanyProfileDo;
import com.paroont.core.db.dao.impl.user.profile.sql.common.UserProfileBaseInsertQueryBuilder;
import com.paroont.core.shared.dto.common.CoreActionBaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompanyProfileBaseInsertQueryBuilder<D extends CompanyProfileDo, AD extends CoreAuditDo, AN extends CoreActionBaseDto> extends UserProfileBaseInsertQueryBuilder<D, AD, AN> {
    private static final Logger logger = LoggerFactory.getLogger(CompanyProfileBaseInsertQueryBuilder.class);


    public CompanyProfileBaseInsertQueryBuilder() {

    }

    @Override
    protected void buildInsertQuery() {
        super.buildInsertQuery();
        queryParams.addValue(DB_COMMON_COLUMN_COMPANY_NAME, data.getCompanyName());
        queryParams.addValue(DB_COMMON_COLUMN_COMPANY_WEB_URL, data.getCompanyWebUrl());
        queryParams.addValue(DB_COMMON_COLUMN_COMPANY_OVERVIEW, data.getCompanyOverview());
    }


    protected void buildInsertClause() {
        query.append(DB_COMMON_COMPANY_PROFILE_INSERT);
    }

}
