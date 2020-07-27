package com.rsatech.core.db.dao.impl.common.sql;

import com.rsatech.core.db.constant.common.CoreDbConst;
import com.rsatech.core.db.dao.entity.user.UserProfileBaseDo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class CoreRowMapper<T extends UserProfileBaseDo> implements RowMapper<T>, CoreDbConst {


    protected void mapCreatedData(T data, ResultSet rs) throws SQLException {
        data.setCreatedBy(rs.getString(DB_COMMON_COLUMN_CREATED_BY));
        data.setCreatedTs(rs.getTimestamp(DB_COMMON_COLUMN_CREATED_TS));
    }

    protected void mapUpdatedData(T data, ResultSet rs) throws SQLException {
        data.setUpdatedBy(rs.getString(DB_COMMON_COLUMN_UPDATED_BY));
        data.setUpdatedTs(rs.getTimestamp(DB_COMMON_COLUMN_UPDATED_TS));
    }

    public T mapRow(ResultSet rs, int rowNum) throws SQLException {
       T data = createData();
        mapData(data, rs, rowNum);
        return data;
    }

    protected abstract T createData();
    protected abstract void mapData(T data, ResultSet rs, int rowNum) throws SQLException;

}
