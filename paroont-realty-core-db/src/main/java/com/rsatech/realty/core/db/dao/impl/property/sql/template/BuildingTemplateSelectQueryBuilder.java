package com.rsatech.realty.core.db.dao.impl.property.sql.template;

import com.rsatech.realty.core.db.constant.common.RealtyDbConst;
import com.rsatech.realty.core.db.dao.impl.property.sql.common.PropertyBaseSelectQueryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuildingTemplateSelectQueryBuilder extends PropertyBaseSelectQueryBuilder implements RealtyDbConst {
    private static final Logger logger = LoggerFactory.getLogger(BuildingTemplateSelectQueryBuilder.class);


    public BuildingTemplateSelectQueryBuilder() {

    }


    @Override
    protected void buildSelectQuery() {
        query.append(DB_REALTY_BUILDING_TEMPLATE_SELECT);
    }


}
