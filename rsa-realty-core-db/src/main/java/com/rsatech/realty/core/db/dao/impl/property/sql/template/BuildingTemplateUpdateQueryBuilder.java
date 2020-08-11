package com.rsatech.realty.core.db.dao.impl.property.sql.template;

import com.rsatech.core.db.dao.impl.common.sql.DbQueryUtil;
import com.rsatech.realty.core.db.dao.entity.property.template.BuildingTemplateAuditDo;
import com.rsatech.realty.core.db.dao.entity.property.template.BuildingTemplateDo;
import com.rsatech.realty.core.db.dao.impl.property.sql.common.PropertyBaseUpdateQueryBuilder;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuildingTemplateUpdateQueryBuilder extends PropertyBaseUpdateQueryBuilder<BuildingTemplateDo, BuildingTemplateAuditDo, PropertyActionDto> {
    private static final Logger logger = LoggerFactory.getLogger(BuildingTemplateUpdateQueryBuilder.class);


    public BuildingTemplateUpdateQueryBuilder() {

    }

    protected void buildUpdateClause() {
        query.append("UPDATE BUILDING_TEMPLATE SET UPDATED_BY = :UPDATED_BY, UPDATED_TS = :UPDATED_TS ");
    }

    @Override
    protected void buildWhereQuery() {
        super.buildWhereQuery();
        if (data.getTemplateId() > 0) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_TEMPLATE_ID));
            queryParams.addValue(DB_COMMON_COLUMN_TEMPLATE_ID, data.getTemplateId());
        } else {
            includeNotMatchingClause();
        }
    }

}
