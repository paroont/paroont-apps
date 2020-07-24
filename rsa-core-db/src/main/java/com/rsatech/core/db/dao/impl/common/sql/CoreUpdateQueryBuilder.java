package com.rsatech.core.db.dao.impl.common.sql;

import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.entity.common.CoreDo;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CoreUpdateQueryBuilder<D extends CoreDo, AD extends CoreAuditDo, AN extends CoreActionBaseDto> extends CoreDmlQueryBuilder<D, AD, AN> {
    private static final Logger logger = LoggerFactory.getLogger(CoreUpdateQueryBuilder.class);

    protected D data;
    protected D oldData;
    protected boolean updateFound = false;

    public String build() {
        buildUpdateQuery();
        addUpdatedByParams();
        buildWhereQuery();
        logSqlAndParams();
        logAuditSqlAndParams();
        return query.toString();
    }

    protected abstract void buildUpdateQuery();


    protected abstract void buildWhereQuery();



    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public D getOldData() {
        return oldData;
    }

    public void setOldData(D oldData) {
        this.oldData = oldData;
    }

    public boolean isUpdateFound() {
        return updateFound;
    }
}
