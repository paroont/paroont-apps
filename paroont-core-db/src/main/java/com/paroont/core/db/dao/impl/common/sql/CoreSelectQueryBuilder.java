package com.paroont.core.db.dao.impl.common.sql;

import com.paroont.core.shared.filter.common.CoreFilter;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

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

    protected abstract void buildSelectQuery();


    protected abstract void buildWhereQuery();

    protected abstract void buildOrderByQuery();

    protected void includeOrderByClause() {
        query.append(" ORDER BY ");
    }

    public F getFilter() {
        return filter;
    }

    public void setFilter(F filter) {
        this.filter = filter;
    }


    protected void buildStringSelectQuery(String value, String colName) {
        if (StringUtils.isNotBlank(value)) {
            query.append(DbQueryUtil.createAndEqualNamedParam(colName));
            queryParams.addValue(colName, value);
        }
    }


    protected void buildStringSelectInQuery(List<String> values, String colName) {
        if (null != values && !values.isEmpty()) {
            query.append(DbQueryUtil.createAndInNamedParam(colName));
            queryParams.addValue(colName, values);
        }
    }


    protected void buildNumberSelectQuery(long value, String colName) {
        if (value > -1) {
            query.append(DbQueryUtil.createAndEqualNamedParam(colName));
            queryParams.addValue(colName, value);
        }
    }

    protected void buildDecimalSelectQuery(double value, double oldValue, String colName) {
        if (value > -1) {
            query.append(DbQueryUtil.createAndEqualNamedParam(colName));
            queryParams.addValue(colName, value);
        }
    }


}
