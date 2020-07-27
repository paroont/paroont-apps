package com.rsatech.core.db.dao.impl.common.sql;

import com.rsatech.core.db.constant.common.CoreDbConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public abstract class CoreBaseQueryBuilder implements CoreQueryBuilder, CoreDbConst {
    private static final Logger logger = LoggerFactory.getLogger(CoreBaseQueryBuilder.class);

    protected StringBuilder query = new StringBuilder();
    protected MapSqlParameterSource queryParams = new MapSqlParameterSource();



    public abstract String build();

    public String takeSql(){
        return query.toString();
    }


    public  void logSqlAndParams(){
        logger.info("SQL:[{}]",query.toString());
        logger.info("SQL_PARAMS:[{}]",queryParams.getValues());
    }


    public MapSqlParameterSource getQueryParams() {
        return queryParams;
    }
}
