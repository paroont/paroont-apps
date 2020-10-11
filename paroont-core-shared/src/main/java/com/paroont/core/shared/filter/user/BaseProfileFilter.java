package com.paroont.core.shared.filter.user;

import com.paroont.core.shared.filter.common.CoreBaseFilter;

public class BaseProfileFilter extends CoreBaseFilter {

    protected String mobileNo;
    protected String mobileCountryCode;

    protected String emailId;

    protected int profileTypeId;

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMobileCountryCode() {
        return mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getProfileTypeId() {
        return profileTypeId;
    }

    public void setProfileTypeId(int profileTypeId) {
        this.profileTypeId = profileTypeId;
    }
}
