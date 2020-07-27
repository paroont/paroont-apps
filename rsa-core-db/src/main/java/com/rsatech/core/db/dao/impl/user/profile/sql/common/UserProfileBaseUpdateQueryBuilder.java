package com.rsatech.core.db.dao.impl.user.profile.sql.common;

import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.entity.user.UserProfileBaseDo;
import com.rsatech.core.db.dao.impl.common.sql.CoreUpdateQueryBuilder;
import com.rsatech.core.db.dao.impl.common.sql.DbQueryUtil;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public abstract class UserProfileBaseUpdateQueryBuilder<D extends UserProfileBaseDo, AD extends CoreAuditDo, AN extends CoreActionBaseDto> extends CoreUpdateQueryBuilder<D, AD, AN> {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileBaseUpdateQueryBuilder.class);

    protected String profileTableName  ="USER_PROFILE";
    public UserProfileBaseUpdateQueryBuilder() {

    }


    protected void buildUpdateQuery() {
        query.append("UPDATE ");
        query.append(profileTableName);
        query.append(" SET UPDATED_BY = :UPDATED_BY, UPDATED_TS = :UPDATED_TS ");

        String firstName = Optional.ofNullable(data.getFirstName()).orElse("");
        String oldFirstName = Optional.ofNullable(oldData.getFirstName()).orElse("");
        if (!firstName.equals(oldFirstName)) {
            updateFound = true;
            query.append(DbQueryUtil.createUpdateNamedParam(DB_COMMON_COLUMN_FIRST_NAME));
            queryParams.addValue(DB_COMMON_COLUMN_FIRST_NAME, firstName);
            auditQueryParams.addValue(DB_COMMON_COLUMN_FIRST_NAME, firstName);
        }

        String lastName = Optional.ofNullable(data.getLastName()).orElse("");
        String oldLastName = Optional.ofNullable(oldData.getLastName()).orElse("");
        if (!lastName.equals(oldLastName)) {
            updateFound = true;
            query.append(DbQueryUtil.createUpdateNamedParam(DB_COMMON_COLUMN_LAST_NAME));
            queryParams.addValue(DB_COMMON_COLUMN_LAST_NAME, lastName);
            auditQueryParams.addValue(DB_COMMON_COLUMN_LAST_NAME, lastName);
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
