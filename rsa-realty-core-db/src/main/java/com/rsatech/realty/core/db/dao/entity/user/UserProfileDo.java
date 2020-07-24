package com.rsatech.realty.core.db.dao.entity.user;

import com.rsatech.realty.core.db.dao.entity.common.RealtyBaseDo;

public class UserProfileDo extends RealtyBaseDo {

    protected String firstName;
    protected String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}