package com.rsatech.realty.core.db.dao.impl.user.profile.sql;

import com.rsatech.core.db.dao.impl.user.profile.sql.company.BaseCompanyProfileRowMapper;
import com.rsatech.realty.core.db.dao.entity.user.UserProfileDo;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.rsatech.realty.core.db.constant.user.RealtyProfileDbConst.DB_REALTY_USER_PROFILE_COLUMN_RERA_ID;

public class UserProfileRowMapper extends BaseCompanyProfileRowMapper<UserProfileDo> {
    @Override
    protected UserProfileDo createData() {
        return new UserProfileDo();
    }

    @Override
    protected void mapData(UserProfileDo data, ResultSet rs, int rowNum) throws SQLException {
        super.mapData(data, rs, rowNum);

        data.setReraId(rs.getString(DB_REALTY_USER_PROFILE_COLUMN_RERA_ID));
    }
}
