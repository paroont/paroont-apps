package com.rsatech.core.db.dao.impl.common.sql;

import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.entity.common.CoreDo;
import com.rsatech.core.db.enumeration.common.SqlTypeEnum;
import com.rsatech.core.db.exception.common.CoreDbException;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import com.rsatech.core.shared.filter.common.CoreFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.util.ArrayList;
import java.util.List;

public abstract class CoreInsertQueryBuilderold<D extends CoreDo, F extends CoreFilter, AD extends CoreAuditDo, AN extends CoreActionBaseDto> implements CoreQueryBuilder {
    private static final Logger logger = LoggerFactory.getLogger(CoreInsertQueryBuilderold.class);

    protected StringBuilder query = new StringBuilder();
    protected StringBuilder auditQuery = new StringBuilder();

    protected List<QueryData<D>> datas = new ArrayList<>();
    protected F filter;
    protected List<AD> audits = new ArrayList<>();
    protected AN action;


    protected SqlParameterSource sqlParams = new MapSqlParameterSource();
    protected SqlParameterSource auditSqlParams = new MapSqlParameterSource();

    public void build(SqlTypeEnum sqlType) {
        switch (sqlType) {
            case SELECT:
                buildSelectQuery();
                buildWhereQuery();
                break;
            case INSERT:
                buildInsertQuery();
                break;
            case UPDATE:
                buildUpdateQuery();
                buildWhereQuery();
                break;
            case DELETE:
                buildDeleteQuery();
                buildWhereQuery();
                break;
            default:
                logger.error("Invalid sqlType=[{}]", sqlType);
                throw new CoreDbException("Invalid sqlType");
        }
    }

    public void buildSelectQuery() {

    }

    public void buildInsertQuery() {

    }

    public void buildUpdateQuery() {

    }

    public void buildDeleteQuery() {

    }

    public void buildWhereQuery() {

    }




}
