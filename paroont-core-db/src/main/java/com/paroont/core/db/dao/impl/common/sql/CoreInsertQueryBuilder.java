package com.paroont.core.db.dao.impl.common.sql;

import com.paroont.core.db.constant.common.CoreDbCommonColumnConst;
import com.paroont.core.db.dao.entity.common.CoreAuditDo;
import com.paroont.core.db.dao.entity.common.CoreBaseDo;
import com.paroont.core.shared.dto.common.CoreActionBaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CoreInsertQueryBuilder<D extends CoreBaseDo, AD extends CoreAuditDo, AN extends CoreActionBaseDto> extends CoreDmlQueryBuilder<D, AD, AN> {
    private static final Logger logger = LoggerFactory.getLogger(CoreInsertQueryBuilder.class);

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

    protected  void buildStatusInsertQuery() {
        queryParams.addValue(CoreDbCommonColumnConst.DB_COMMON_COLUMN_STATUS_ID, data.getStatusId());
        queryParams.addValue(CoreDbCommonColumnConst.DB_COMMON_COLUMN_STATUS_TITLE, data.getStatusTitle());
    }

}
