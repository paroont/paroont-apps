package com.paroont.realty.core.db.dao.entity.user;

import com.paroont.core.db.dao.entity.user.CompanyProfileDo;
import com.paroont.realty.core.db.dao.entity.common.RealtyDo;

public class UserProfileDo extends CompanyProfileDo implements RealtyDo {

    protected String reraId;

    public String getReraId() {
        return reraId;
    }

    public void setReraId(String reraId) {
        this.reraId = reraId;
    }
}
