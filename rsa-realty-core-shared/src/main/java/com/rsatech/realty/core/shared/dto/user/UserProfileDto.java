package com.rsatech.realty.core.shared.dto.user;

import com.rsatech.realty.core.shared.dto.common.RealtyBaseDto;

public class UserProfileDto extends RealtyBaseDto {
    protected String firstName;
    protected String lastName;

    public UserProfileDto()
    {

    }

    public UserProfileDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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
