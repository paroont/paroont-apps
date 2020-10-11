package com.rsatech.core.db.dao.impl.rdm.sql;

import com.rsatech.core.db.dao.entity.rdm.AppRefDataDo;
import com.rsatech.core.db.dao.impl.common.sql.CoreRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AppRefDataRowMapper extends CoreRowMapper<AppRefDataDo> {


    @Override
    protected AppRefDataDo createData() {
        return new AppRefDataDo();
    }

    protected void mapData(AppRefDataDo data, ResultSet rs, int rowNum) throws SQLException {
        data.setDataId(rs.getLong(DB_RDM_APP_REF_DATA_COLUMN_DATA_ID));
        data.setType(rs.getString(DB_RDM_APP_REF_DATA_COLUMN_DATA_TYPE));
        data.setKey(rs.getString(DB_RDM_APP_REF_DATA_COLUMN_DATA_KEY));
        data.setValue(rs.getString(DB_RDM_APP_REF_DATA_COLUMN_DATA_VALUE));

        data.setGroupName(rs.getString(DB_COMMON_COLUMN_GROUP_NAME));
        data.setSubGroupName(rs.getString(DB_COMMON_COLUMN_SUB_GROUP_NAME));

        data.setAppName(rs.getString(DB_COMMON_COLUMN_APP_NAME));
        data.setModuleName(rs.getString(DB_COMMON_COLUMN_MODULE_NAME));

        mapCreatedData(data, rs);
        mapUpdatedData(data, rs);
        mapStatusData(data, rs);
    }
}
