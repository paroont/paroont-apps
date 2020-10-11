package com.rsatech.realty.core.shared.dto.user;

import com.rsatech.core.shared.dto.user.CompanyProfileDto;
import com.rsatech.realty.core.shared.dto.common.RealtyDto;

public class UserProfileDto extends CompanyProfileDto implements RealtyDto {

    protected String reraId;

    public String getReraId() {
        return reraId;
    }

    public void setReraId(String reraId) {
        this.reraId = reraId;
    }
}
