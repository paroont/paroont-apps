package com.rsatech.core.db.dao.impl.common.sql;

import com.rsatech.core.shared.filter.common.CoreFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CoreSelectQueryBuilder<F extends CoreFilter> extends CoreBaseQueryBuilder {
    private static final Logger logger = LoggerFactory.getLogger(CoreSelectQueryBuilder.class);

    protected F filter;



    public String build() {
        buildSelectQuery();
        buildWhereQuery();
        buildOrderByQuery();
        // LIMIT 0, 200
        logSqlAndParams();
        return query.toString();
    }

    protected abstract void buildSelectQuery() ;


    protected abstract void buildWhereQuery() ;

    protected abstract void buildOrderByQuery() ;

    protected void includeOrderByClause(){
        query.append(" ORDER BY ");
    }

    public F getFilter() {
        return filter;
    }

    public void setFilter(F filter) {
        this.filter = filter;
    }
}
