package com.paroont.core.db.dao.impl.user.profile.sql.common;

import com.paroont.core.db.constant.common.CoreDbCommonColumnConst;
import com.paroont.core.db.constant.common.CoreDbConst;
import com.paroont.core.db.dao.impl.common.sql.CoreSelectQueryBuilder;
import com.paroont.core.db.dao.impl.common.sql.DbQueryUtil;
import com.paroont.core.shared.filter.user.BaseProfileFilter;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class UserProfileBaseSelectQueryBuilder<F extends BaseProfileFilter> extends CoreSelectQueryBuilder<F> implements CoreDbConst {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileBaseSelectQueryBuilder.class);


    public UserProfileBaseSelectQueryBuilder() {

    }



    @Override
    protected void buildWhereQuery() {
        if (filter.getUserProfileId() > 0) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_PROFILE_ID));
            queryParams.addValue(DB_COMMON_COLUMN_PROFILE_ID, filter.getUserProfileId());
        }


        if (StringUtils.isNotBlank(filter.getUserId()) ) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_USER_ID));
            queryParams.addValue(DB_COMMON_COLUMN_USER_ID, filter.getUserId());
        }

        if (filter.getStatusId() > 0) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_STATUS_ID));
            queryParams.addValue(DB_COMMON_COLUMN_STATUS_ID, filter.getStatusId());
        }

        if (filter.getProfileTypeId() > 0) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_USER_PROFILE_COLUMN_PROFILE_TYPE_ID));
            queryParams.addValue(DB_COMMON_USER_PROFILE_COLUMN_PROFILE_TYPE_ID, filter.getProfileTypeId());
        }

        if (StringUtils.isNotBlank(filter.getMobileNo()) ) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_MOBILE_NO));
            queryParams.addValue(DB_COMMON_COLUMN_MOBILE_NO, filter.getMobileNo());
        }

        if ( StringUtils.isNotBlank(filter.getMobileCountryCode()) ) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_MOBILE_COUNTRY_CODE));
            queryParams.addValue(DB_COMMON_COLUMN_MOBILE_COUNTRY_CODE, filter.getMobileCountryCode());
        }

        if (StringUtils.isNotBlank(filter.getEmailId()) ) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_EMAIL_ID));
            queryParams.addValue(DB_COMMON_COLUMN_EMAIL_ID, filter.getEmailId());
        }


    }

    @Override
    protected void buildOrderByQuery() {
        includeOrderByClause();
        query.append(DB_COMMON_COLUMN_UPDATED_TS + " DESC ");
    }
}
