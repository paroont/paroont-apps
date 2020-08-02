package com.rsatech.core.db.dao.impl.user.profile.sql.common;

import com.rsatech.core.db.dao.entity.user.UserProfileBaseDo;
import com.rsatech.core.db.dao.impl.common.sql.CoreRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class UserProfileBaseRowMapper<T extends UserProfileBaseDo> extends CoreRowMapper<T> {


    protected void mapData(T data, ResultSet rs, int rowNum) throws SQLException {
        data.setUserId(rs.getLong(DB_COMMON_COLUMN_USER_ID));
        data.setFirstName(rs.getString(DB_COMMON_COLUMN_FIRST_NAME));
        data.setLastName(rs.getString(DB_COMMON_COLUMN_LAST_NAME));

        data.setMobileNo(rs.getString(DB_COMMON_COLUMN_MOBILE_NO));
        data.setMobileCountryCode(rs.getString(DB_COMMON_COLUMN_MOBILE_COUNTRY_CODE));

        data.setEmailId(rs.getString(DB_COMMON_COLUMN_EMAIL_ID));
        data.setEmailId2(rs.getString(DB_COMMON_COLUMN_EMAIL_ID_2));
        data.setEmailId3(rs.getString(DB_COMMON_COLUMN_EMAIL_ID_3));


        data.setProfileTypeId(rs.getInt(DB_COMMON_USER_PROFILE_COLUMN_PROFILE_TYPE_ID));
        data.setProfileTypeTitle(rs.getString(DB_COMMON_USER_PROFILE_COLUMN_PROFILE_TYPE_TITLE));

        data.setFacebookId(rs.getString(DB_COMMON_COLUMN_FACEBOOK_ID));
        data.setTwitterId(rs.getString(DB_COMMON_COLUMN_TWITTER_ID));
        data.setInstagramId(rs.getString(DB_COMMON_COLUMN_INSTAGRAM_ID));
        data.setWhatsAppNo(rs.getString(DB_COMMON_COLUMN_WHATSAPP_NO));
        data.setWhatsAppCountryCode(rs.getString(DB_COMMON_COLUMN_WHATSAPP_COUNTRY_CODE));


        data.setContactNo2(rs.getString(DB_COMMON_COLUMN_CONTACT_NO_2));
        data.setContactNo2CountryCode(rs.getString(DB_COMMON_COLUMN_CONTACT_NO_2_COUNTRY_CODE));
        data.setContactNo2Title(rs.getString(DB_COMMON_COLUMN_CONTACT_NO_2_TITLE));

        data.setContactNo3(rs.getString(DB_COMMON_COLUMN_CONTACT_NO_3));
        data.setContactNo3CountryCode(rs.getString(DB_COMMON_COLUMN_CONTACT_NO_3_COUNTRY_CODE));
        data.setContactNo3Title(rs.getString(DB_COMMON_COLUMN_CONTACT_NO_3_TITLE));

        data.setAddressLine1(rs.getString(DB_COMMON_COLUMN_ADDRESS_LINE_1));
        data.setAddressLine2(rs.getString(DB_COMMON_COLUMN_ADDRESS_LINE_2));
        data.setCityName(rs.getString(DB_COMMON_COLUMN_CITY_NAME));
        data.setStateName(rs.getString(DB_COMMON_COLUMN_STATE_NAME));
        data.setLandmarkName(rs.getString(DB_COMMON_COLUMN_LANDMARK_NAME));
        data.setPinCode(rs.getString(DB_COMMON_COLUMN_PIN_CODE));
        data.setCountryName(rs.getString(DB_COMMON_COLUMN_COUNTRY_NAME));


        data.setGenderTitle(rs.getString(DB_COMMON_COLUMN_GENDER_TITLE));
        data.setDob(rs.getTimestamp(DB_COMMON_COLUMN_DOB));
        data.setIncomeRangeId(rs.getInt(DB_COMMON_USER_PROFILE_COLUMN_INCOME_RANGE_ID));
        data.setIncomeRangeTitle(rs.getString(DB_COMMON_USER_PROFILE_COLUMN_INCOME_RANGE_TITLE));

        mapStatusData(data,rs);
        mapCreatedData(data, rs);
        mapUpdatedData(data, rs);


    }
}
