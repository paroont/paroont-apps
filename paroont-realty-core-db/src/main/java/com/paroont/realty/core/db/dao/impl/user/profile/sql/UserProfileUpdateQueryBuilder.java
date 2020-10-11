package com.paroont.realty.core.db.dao.impl.user.profile.sql;

import com.paroont.core.db.dao.entity.common.CoreAuditDo;
import com.paroont.core.db.dao.impl.user.profile.sql.company.CompanyProfileBaseUpdateQueryBuilder;
import com.paroont.core.shared.dto.common.CoreActionBaseDto;
import com.paroont.realty.core.db.constant.common.RealtyDbConst;
import com.paroont.realty.core.db.dao.entity.user.UserProfileDo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserProfileUpdateQueryBuilder extends CompanyProfileBaseUpdateQueryBuilder<UserProfileDo, CoreAuditDo, CoreActionBaseDto> implements RealtyDbConst {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileUpdateQueryBuilder.class);


    public UserProfileUpdateQueryBuilder() {

    }


    protected void buildUpdateQuery() {
        super.buildUpdateQuery();

        buildStringUpdateQuery(data.getReraId(), oldData.getReraId(), DB_REALTY_COMMON_COLUMN_RERA_ID);
    }


}
