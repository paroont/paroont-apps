package com.rsatech.realty.core.db.dao.impl.property.sql.common;

import com.rsatech.core.db.dao.impl.common.sql.CoreInsertQueryBuilder;
import com.rsatech.realty.core.db.constant.common.RealtyDbConst;
import com.rsatech.realty.core.db.dao.entity.common.RealtyAuditDo;
import com.rsatech.realty.core.db.dao.entity.property.common.PropertyBaseDo;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PropertyBaseInsertQueryBuilder<D extends PropertyBaseDo, AD extends RealtyAuditDo, AN extends PropertyActionDto> extends CoreInsertQueryBuilder<D, AD, AN> implements RealtyDbConst {
    private static final Logger logger = LoggerFactory.getLogger(PropertyBaseInsertQueryBuilder.class);

    public PropertyBaseInsertQueryBuilder() {


    }

    @Override
    protected void buildInsertQuery() {
        buildInsertClause();
    }

    protected abstract void buildInsertClause();


}
