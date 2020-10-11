package com.rsatech.core.db.dao.entity.user;

public class CompanyProfileDo extends UserProfileBaseDo {


    protected String companyName;
    protected String companyWebUrl;
    protected String companyOverview;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyWebUrl() {
        return companyWebUrl;
    }

    public void setCompanyWebUrl(String companyWebUrl) {
        this.companyWebUrl = companyWebUrl;
    }

    public String getCompanyOverview() {
        return companyOverview;
    }

    public void setCompanyOverview(String companyOverview) {
        this.companyOverview = companyOverview;
    }
}
