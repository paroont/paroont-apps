package com.paroont.core.db.dao.impl.common.sql;

import com.paroont.core.db.dao.entity.common.CoreAuditDo;
import com.paroont.core.db.dao.entity.common.CoreDo;
import com.paroont.core.shared.dto.common.CoreActionBaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CoreBatchInsertQueryBuilder<D extends CoreDo, AD extends CoreAuditDo, AN extends CoreActionBaseDto> extends CoreDmlQueryBuilder<D, AD, AN> {
    private static final Logger logger = LoggerFactory.getLogger(CoreBatchInsertQueryBuilder.class);

    protected D data;

    public String build() {
        buildInsertQuery();
        addCreatedByParams();
        addUpdatedByParams();
        logSqlAndParams();
        logAuditSqlAndParams();
        return query.toString();
    }

    protected abstract void buildInsertQuery();





    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

}
