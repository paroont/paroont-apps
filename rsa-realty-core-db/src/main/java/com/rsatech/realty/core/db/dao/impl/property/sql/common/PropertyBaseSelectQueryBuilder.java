package com.rsatech.realty.core.db.dao.impl.property.sql.common;

import com.rsatech.core.db.dao.impl.common.sql.CoreSelectQueryBuilder;
import com.rsatech.realty.core.db.constant.common.RealtyDbConst;
import com.rsatech.realty.core.shared.filter.property.PropertyFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PropertyBaseSelectQueryBuilder extends CoreSelectQueryBuilder<PropertyFilter> implements RealtyDbConst {
    private static final Logger logger = LoggerFactory.getLogger(PropertyBaseSelectQueryBuilder.class);


    public PropertyBaseSelectQueryBuilder() {

    }


    @Override
    protected void buildWhereQuery() {
        buildNumberSelectQuery(filter.getTemplateId(), DB_COMMON_COLUMN_TEMPLATE_ID);
        buildNumberSelectQuery(filter.getPropertyId(), DB_REALTY_PROPERTY_COLUMN_PROPERTY_ID);
    }

    @Override
    protected void buildOrderByQuery() {

    }


}
