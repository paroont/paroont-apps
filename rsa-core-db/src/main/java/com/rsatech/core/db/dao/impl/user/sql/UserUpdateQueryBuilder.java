package com.rsatech.core.db.dao.impl.user.sql;

import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.entity.user.UserDo;
import com.rsatech.core.db.dao.impl.common.sql.CoreUpdateQueryBuilder;
import com.rsatech.core.db.dao.impl.common.sql.DbQueryUtil;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class UserUpdateQueryBuilder extends CoreUpdateQueryBuilder<UserDo, CoreAuditDo, CoreActionBaseDto> {
    private static final Logger logger = LoggerFactory.getLogger(UserUpdateQueryBuilder.class);


    public UserUpdateQueryBuilder() {

    }


    protected void buildUpdateQuery() {
        query.append("UPDATE USER_PROFILE SET UPDATED_BY = :UPDATED_BY, UPDATED_TS = :UPDATED_TS ");


        String firstName = Optional.ofNullable(data.getFirstName()).orElse("");
        String oldFirstName = Optional.ofNullable(oldData.getFirstName()).orElse("");
        if (!firstName.equals(oldFirstName)) {
            updateFound = true;
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_FIRST_NAME));
            queryParams.addValue(DB_COMMON_COLUMN_FIRST_NAME, firstName);
            auditQueryParams.addValue(DB_COMMON_COLUMN_FIRST_NAME, firstName);
        }

    }



    @Override
    protected void buildWhereQuery() {
        includeWhereClause();
        if (data.getUserId() > 0) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_USER_ID));
            queryParams.addValue(DB_COMMON_COLUMN_USER_ID, data.getUserId());
        }else {
            includeNotMatchingClause();
        }
    }


}
