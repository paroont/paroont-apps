package com.paroont.realty.core.db.dao.impl.property.sql.template;

import com.paroont.realty.core.db.dao.entity.property.post.PostPropertyAuditDo;
import com.paroont.realty.core.db.dao.entity.property.post.PostPropertyDo;
import com.paroont.realty.core.db.dao.impl.property.sql.common.PropertyBaseInsertQueryBuilder;
import com.paroont.realty.core.shared.dto.property.common.PropertyActionDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuildingTemplateInsertQueryBuilder extends PropertyBaseInsertQueryBuilder<PostPropertyDo, PostPropertyAuditDo, PropertyActionDto> {
    private static final Logger logger = LoggerFactory.getLogger(BuildingTemplateInsertQueryBuilder.class);


    public BuildingTemplateInsertQueryBuilder() {

    }


    @Override
    protected void buildInsertQuery() {
        super.buildInsertQuery();

    }


    protected void buildInsertClause() {
        query.append(DB_REALTY_BUILDING_TEMPLATE_INSERT);
    }


}
