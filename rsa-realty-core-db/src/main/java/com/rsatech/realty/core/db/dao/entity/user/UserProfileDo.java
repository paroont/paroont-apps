package com.rsatech.realty.core.db.dao.entity.user;

import com.rsatech.core.db.dao.entity.user.CompanyProfileDo;
import com.rsatech.realty.core.db.dao.entity.common.RealtyDo;

public class UserProfileDo extends CompanyProfileDo implements RealtyDo {

    protected String reraId;

    public String getReraId() {
        return reraId;
    }

    public void setReraId(String reraId) {
        this.reraId = reraId;
    }
}
