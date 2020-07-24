package com.rsatech.realty.core.db.dao.impl.user.sql;

import com.rsatech.realty.core.db.constant.common.RealtyDbConst;
import com.rsatech.realty.core.db.dao.entity.user.UserProfileDo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserProfileRowMapper implements RowMapper<UserProfileDo>, RealtyDbConst {
    @Override
    public UserProfileDo mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserProfileDo data = new UserProfileDo();
        data.setFirstName(rs.getString(DB_COMMON_COLUMN_FIRST_NAME));
        data.setLastName(rs.getString(DB_COMMON_COLUMN_LAST_NAME));
        return data;
    }
}
