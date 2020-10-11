package com.paroont.core.db.dao.impl.user.profile.sql.company;

import com.paroont.core.db.dao.entity.user.CompanyProfileDo;

public class CompanyProfileRowMapper extends CompanyProfileBaseRowMapper<CompanyProfileDo> {
    @Override
    protected CompanyProfileDo createData() {
        return new CompanyProfileDo();
    }
}
