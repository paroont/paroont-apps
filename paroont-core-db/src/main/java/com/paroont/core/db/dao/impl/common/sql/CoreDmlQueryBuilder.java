package com.paroont.core.db.dao.impl.common.sql;

import com.paroont.core.db.dao.entity.common.CoreAuditDo;
import com.paroont.core.db.dao.entity.common.CoreDo;
import com.paroont.core.shared.dto.common.CoreActionBaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public abstract class CoreDmlQueryBuilder<D extends CoreDo, AD extends CoreAuditDo, AN extends CoreActionBaseDto> extends CoreBaseQueryBuilder {
    private static final Logger logger = LoggerFactory.getLogger(CoreDmlQueryBuilder.class);

    protected AN action;
    protected StringBuilder auditQuery = new StringBuilder();
    protected MapSqlParameterSource auditQueryParams = new MapSqlParameterSource();
    protected List<AD> audits = new ArrayList<>();

    protected void addUpdatedByParams() {
        queryParams.addValue(DB_COMMON_COLUMN_UPDATED_BY, action.getUserId());
        queryParams.addValue(DB_COMMON_COLUMN_UPDATED_TS, action.getActionTs(), Types.TIMESTAMP);
    }


    protected void addCreatedByParams() {
        queryParams.addValue(DB_COMMON_COLUMN_CREATED_BY, action.getUserId());
        queryParams.addValue(DB_COMMON_COLUMN_CREATED_TS, action.getActionTs(), Types.TIMESTAMP);
    }
    public  void logAuditSqlAndParams(){
        logger.info("AUDIT_SQL:[{}]",auditQuery.toString());
        logger.info("AUDIT_SQL_PARAMS:[{}]",auditQueryParams.getValues());
    }

    protected void includeWhereClause(){
        query.append(" WHERE 1=1 ");
    }

    protected void includeNotMatchingClause(){
        query.append(" AND ( 1 = 0) ");
    }

    public AN getAction() {
        return action;
    }

    public void setAction(AN action) {
        this.action = action;
    }
}
