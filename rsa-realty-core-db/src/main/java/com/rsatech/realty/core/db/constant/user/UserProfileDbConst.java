package com.rsatech.realty.core.db.constant.user;

// Add Only DB SQL Const for User Profile
public interface UserProfileDbConst {

    // ====================   SELECT/INSERT/UPDATE/DELETE Constant   =======================

    String DB_REALTY_USER_PROFILE_SELECT = "SELECT USER_ID, FIRST_NAME, LAST_NAME, MOBILE_NO, MOBILE_COUNTRY_CODE, EMAIL_ID, STATUS_ID, STATUS_TITLE, PROFILE_TYPE_ID, PROFILE_TYPE_TITLE, COMPANY_NAME, COMPANY_WEB_URL, COMPANY_OVERVIEW, FACEBOOK_ID, TWITTER_ID, INSTAGRAM_ID, WHATSAPP_NO, WHATSAPP_COUNTRY_CODE, RERA_ID, CONTACT_NO_2, CONTACT_NO_2_COUNTRY_CODE, CONTACT_NO_2_TITLE, CONTACT_NO_3, CONTACT_NO_3_COUNTRY_CODE, CONTACT_NO_3_TITLE, ADDRESS_LINE_1, ADDRESS_LINE_2, CITY_NAME, STATE_NAME, LANDMARK_NAME, PIN_CODE, COUNTRY_NAME, DOB, INCOME_RANGE_ID, INCOME_RANGE_TITLE, CREATED_BY, CREATED_TS, UPDATED_BY, UPDATED_TS FROM USER_PROFILE WHERE 1 = 1 ";

    // ====================   Column Constant   =======================


    // ====================   Param Constant   =======================

}