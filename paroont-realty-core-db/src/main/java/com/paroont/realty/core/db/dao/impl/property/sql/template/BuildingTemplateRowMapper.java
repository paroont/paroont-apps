package com.paroont.realty.core.db.dao.impl.property.sql.template;

import com.paroont.realty.core.db.dao.entity.property.template.BuildingTemplateDo;
import com.paroont.realty.core.db.dao.impl.property.sql.common.PropertyBaseRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BuildingTemplateRowMapper extends PropertyBaseRowMapper<BuildingTemplateDo> {
    @Override
    protected BuildingTemplateDo createData() {
        return new BuildingTemplateDo();
    }

    @Override
    protected void mapData(BuildingTemplateDo data, ResultSet rs, int rowNum) throws SQLException {
        super.mapData(data, rs, rowNum);
    }
}
