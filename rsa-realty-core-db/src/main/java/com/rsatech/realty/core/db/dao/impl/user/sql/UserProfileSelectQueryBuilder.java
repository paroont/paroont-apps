package com.rsatech.realty.core.db.dao.impl.user.sql;

import com.rsatech.core.db.dao.impl.common.sql.CoreSelectQueryBuilder;
import com.rsatech.core.db.dao.impl.common.sql.DbQueryUtil;
import com.rsatech.core.shared.filter.user.UserFilter;
import com.rsatech.realty.core.db.constant.common.RealtyDbConst;
import com.rsatech.realty.core.shared.filter.user.UserProfileFilter;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserProfileSelectQueryBuilder extends CoreSelectQueryBuilder<UserProfileFilter> implements RealtyDbConst {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileSelectQueryBuilder.class);


    public UserProfileSelectQueryBuilder() {

    }

    @Override
    protected void buildSelectQuery() {
        query.append(DB_REALTY_USER_PROFILE_SELECT);
    }

    @Override
    protected void buildWhereQuery() {
        if (filter.getUserId() > 0) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_USER_ID));
            queryParams.addValue(DB_COMMON_COLUMN_USER_ID, filter.getUserId());
        }
        if (StringUtils.isNotBlank(filter.getLoginId())) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_LOGIN_ID));
            queryParams.addValue(DB_COMMON_COLUMN_LOGIN_ID, filter.getLoginId());
        }

        if (filter.getStatusId() > 0) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_STATUS_ID));
            queryParams.addValue(DB_COMMON_COLUMN_STATUS_ID, filter.getStatusId());
        }
    }

    @Override
    protected void buildOrderByQuery() {
        includeOrderByClause();
        query.append(DB_COMMON_COLUMN_UPDATED_TS + " DESC ");
    }
}
