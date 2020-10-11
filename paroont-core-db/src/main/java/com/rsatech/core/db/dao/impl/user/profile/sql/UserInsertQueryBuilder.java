package com.rsatech.core.db.dao.impl.user.profile.sql;

import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.entity.user.UserProfileBaseDo;
import com.rsatech.core.db.dao.impl.common.sql.CoreInsertQueryBuilder;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserInsertQueryBuilder extends CoreInsertQueryBuilder<UserProfileBaseDo, CoreAuditDo, CoreActionBaseDto> {
    private static final Logger logger = LoggerFactory.getLogger(UserInsertQueryBuilder.class);


    public UserInsertQueryBuilder() {

    }

    @Override
    protected void buildInsertQuery() {
        query.append("INSERT INTO USER_PROFILE (USER_ID, UPDATED_BY, UPDATED_TS) VALUES (:USER_ID, :UPDATED_BY, :UPDATED_TS)");
        queryParams.addValue(DB_COMMON_COLUMN_USER_ID, data.getUserId());

    }


}
