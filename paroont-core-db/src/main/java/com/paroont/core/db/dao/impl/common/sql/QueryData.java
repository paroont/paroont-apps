package com.paroont.core.db.dao.impl.common.sql;

public class QueryData<D> {
    public final D data;
    public final D oldData;
    public QueryData(D data, D oldData) {
        this.data = data;
        this.oldData = oldData;
    }
}