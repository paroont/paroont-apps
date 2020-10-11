package com.paroont.core.db.dao.impl.user.profile.sql.company;

import com.paroont.core.db.dao.entity.common.CoreAuditDo;
import com.paroont.core.db.dao.entity.user.CompanyProfileDo;
import com.paroont.core.db.dao.impl.user.profile.sql.common.UserProfileBaseUpdateQueryBuilder;
import com.paroont.core.shared.dto.common.CoreActionBaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CompanyProfileBaseUpdateQueryBuilder<D extends CompanyProfileDo, AD extends CoreAuditDo, AN extends CoreActionBaseDto> extends UserProfileBaseUpdateQueryBuilder<D, AD, AN> {
    private static final Logger logger = LoggerFactory.getLogger(CompanyProfileBaseUpdateQueryBuilder.class);


    public CompanyProfileBaseUpdateQueryBuilder() {

    }


    protected void buildUpdateQuery() {
        super.buildUpdateQuery();

        buildStringUpdateQuery(data.getCompanyName(), oldData.getCompanyName(), DB_COMMON_COLUMN_COMPANY_NAME);
        buildStringUpdateQuery(data.getCompanyOverview(), oldData.getCompanyOverview(), DB_COMMON_COLUMN_COMPANY_OVERVIEW);
        buildStringUpdateQuery(data.getCompanyWebUrl(), oldData.getCompanyWebUrl(), DB_COMMON_COLUMN_COMPANY_WEB_URL);
    }


}
