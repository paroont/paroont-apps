package com.rsatech.realty.core.db.dao.impl.property.sql.post;

import com.rsatech.realty.core.db.constant.common.RealtyDbConst;
import com.rsatech.realty.core.db.dao.impl.property.sql.common.PropertyBaseSelectQueryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostPropertySelectQueryBuilder extends PropertyBaseSelectQueryBuilder implements RealtyDbConst {
    private static final Logger logger = LoggerFactory.getLogger(PostPropertySelectQueryBuilder.class);


    public PostPropertySelectQueryBuilder() {

    }


    @Override
    protected void buildSelectQuery() {
        query.append(DB_REALTY_POST_PROPERTY_SELECT);
    }


}
