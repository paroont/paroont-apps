package com.rsatech.core.db.dao.entity.user;

import com.rsatech.core.db.dao.entity.common.CoreBaseDo;

import java.sql.Timestamp;

public class UserProfileBaseDo extends CoreBaseDo {
    protected long userId;

    protected String firstName;
    protected String lastName;
    protected String mobileNo;
    protected String mobileCountryCode;

    protected String emailId;
    protected String emailId2;
    protected String emailId3;


    protected int profileTypeId;
    protected String profileTypeTitle;

    protected String facebookId;
    protected String twitterId;
    protected String instagramId;

    protected String whatsAppNo;
    protected String whatsAppCountryCode;

    protected String contactNo2;
    protected String contactNo2CountryCode;
    protected String contactNo2Title;


    protected String contactNo3;
    protected String contactNo3CountryCode;
    protected String contactNo3Title;

    protected String addressLine1;
    protected String addressLine2;
    protected String cityName;
    protected String stateName;
    protected String landmarkName;
    protected String pinCode;
    protected String countryName;

    protected String genderTitle;
    protected Timestamp dob;

    protected int incomeRangeId;
    protected String incomeRangeTitle;



    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public String getEmailId2() {
        return emailId2;
    }

    public void setEmailId2(String emailId2) {
        this.emailId2 = emailId2;
    }

    public String getEmailId3() {
        return emailId3;
    }

    public void setEmailId3(String emailId3) {
        this.emailId3 = emailId3;
    }

    public int getProfileTypeId() {
        return profileTypeId;
    }

    public void setProfileTypeId(int profileTypeId) {
        this.profileTypeId = profileTypeId;
    }

    public String getProfileTypeTitle() {
        return profileTypeTitle;
    }

    public void setProfileTypeTitle(String profileTypeTitle) {
        this.profileTypeTitle = profileTypeTitle;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getInstagramId() {
        return instagramId;
    }

    public void setInstagramId(String instagramId) {
        this.instagramId = instagramId;
    }

    public String getWhatsAppNo() {
        return whatsAppNo;
    }

    public void setWhatsAppNo(String whatsAppNo) {
        this.whatsAppNo = whatsAppNo;
    }

    public String getWhatsAppCountryCode() {
        return whatsAppCountryCode;
    }

    public void setWhatsAppCountryCode(String whatsAppCountryCode) {
        this.whatsAppCountryCode = whatsAppCountryCode;
    }

    public String getContactNo2() {
        return contactNo2;
    }

    public void setContactNo2(String contactNo2) {
        this.contactNo2 = contactNo2;
    }

    public String getContactNo2CountryCode() {
        return contactNo2CountryCode;
    }

    public void setContactNo2CountryCode(String contactNo2CountryCode) {
        this.contactNo2CountryCode = contactNo2CountryCode;
    }

    public String getContactNo2Title() {
        return contactNo2Title;
    }

    public void setContactNo2Title(String contactNo2Title) {
        this.contactNo2Title = contactNo2Title;
    }

    public String getContactNo3() {
        return contactNo3;
    }

    public void setContactNo3(String contactNo3) {
        this.contactNo3 = contactNo3;
    }

    public String getContactNo3CountryCode() {
        return contactNo3CountryCode;
    }

    public void setContactNo3CountryCode(String contactNo3CountryCode) {
        this.contactNo3CountryCode = contactNo3CountryCode;
    }

    public String getContactNo3Title() {
        return contactNo3Title;
    }

    public void setContactNo3Title(String contactNo3Title) {
        this.contactNo3Title = contactNo3Title;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getLandmarkName() {
        return landmarkName;
    }

    public void setLandmarkName(String landmarkName) {
        this.landmarkName = landmarkName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getGenderTitle() {
        return genderTitle;
    }

    public void setGenderTitle(String genderTitle) {
        this.genderTitle = genderTitle;
    }

    public Timestamp getDob() {
        return dob;
    }

    public void setDob(Timestamp dob) {
        this.dob = dob;
    }

    public int getIncomeRangeId() {
        return incomeRangeId;
    }

    public void setIncomeRangeId(int incomeRangeId) {
        this.incomeRangeId = incomeRangeId;
    }

    public String getIncomeRangeTitle() {
        return incomeRangeTitle;
    }

    public void setIncomeRangeTitle(String incomeRangeTitle) {
        this.incomeRangeTitle = incomeRangeTitle;
    }
}
