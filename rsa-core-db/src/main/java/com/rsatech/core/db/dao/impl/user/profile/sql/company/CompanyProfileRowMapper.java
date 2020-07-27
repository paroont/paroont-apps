package com.rsatech.core.db.dao.impl.user.profile.sql.company;

import com.rsatech.core.db.dao.entity.user.CompanyProfileDo;

public class CompanyProfileRowMapper extends BaseCompanyProfileRowMapper<CompanyProfileDo> {
    @Override
    protected CompanyProfileDo createData() {
        return new CompanyProfileDo();
    }
}
