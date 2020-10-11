package com.paroont.core.shared.dto.user;

public class CompanyProfileDto extends BaseProfileDto {


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
