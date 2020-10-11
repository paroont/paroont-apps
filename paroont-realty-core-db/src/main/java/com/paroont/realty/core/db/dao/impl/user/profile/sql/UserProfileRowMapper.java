package com.paroont.realty.core.db.dao.impl.user.profile.sql;

import com.paroont.core.db.dao.impl.user.profile.sql.company.CompanyProfileBaseRowMapper;
import com.paroont.realty.core.db.constant.common.RealtyDbCommonColumnConst;
import com.paroont.realty.core.db.dao.entity.user.UserProfileDo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserProfileRowMapper extends CompanyProfileBaseRowMapper<UserProfileDo> {
    @Override
    protected UserProfileDo createData() {
        return new UserProfileDo();
    }

    @Override
    protected void mapData(UserProfileDo data, ResultSet rs, int rowNum) throws SQLException {
        super.mapData(data, rs, rowNum);

        data.setReraId(rs.getString(RealtyDbCommonColumnConst.DB_REALTY_COMMON_COLUMN_RERA_ID));
    }
}
