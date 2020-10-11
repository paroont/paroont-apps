package com.rsatech.core.db.dao.impl.user.profile.sql.common;

import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.entity.common.CoreDo;
import com.rsatech.core.db.dao.entity.user.UserProfileBaseDo;
import com.rsatech.core.db.dao.impl.common.sql.CoreInsertQueryBuilder;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLType;
import java.sql.Types;

public class UserProfileBaseInsertQueryBuilder<D extends UserProfileBaseDo, AD extends CoreAuditDo, AN extends CoreActionBaseDto>  extends CoreInsertQueryBuilder<D, AD, AN> {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileBaseInsertQueryBuilder.class);


    public UserProfileBaseInsertQueryBuilder() {

    }

    @Override
    protected void buildInsertQuery() {
        buildInsertClause();
        queryParams.addValue(DB_COMMON_COLUMN_FIRST_NAME, data.getFirstName());
        queryParams.addValue(DB_COMMON_COLUMN_LAST_NAME, data.getLastName());
        queryParams.addValue(DB_COMMON_COLUMN_MOBILE_NO, data.getMobileNo());
        queryParams.addValue(DB_COMMON_COLUMN_MOBILE_COUNTRY_CODE, data.getMobileCountryCode());
        queryParams.addValue(DB_COMMON_COLUMN_EMAIL_ID, data.getEmailId());

        queryParams.addValue(DB_COMMON_COLUMN_STATUS_ID, data.getStatusId());
        queryParams.addValue(DB_COMMON_COLUMN_STATUS_TITLE, data.getStatusTitle());
        queryParams.addValue(DB_COMMON_USER_PROFILE_COLUMN_PROFILE_TYPE_ID, data.getProfileTypeId());
        queryParams.addValue(DB_COMMON_USER_PROFILE_COLUMN_PROFILE_TYPE_TITLE, data.getProfileTypeTitle());

        queryParams.addValue(DB_COMMON_COLUMN_FACEBOOK_ID, data.getFacebookId());
        queryParams.addValue(DB_COMMON_COLUMN_TWITTER_ID, data.getTwitterId());
        queryParams.addValue(DB_COMMON_COLUMN_INSTAGRAM_ID, data.getInstagramId());
        queryParams.addValue(DB_COMMON_COLUMN_WHATSAPP_NO, data.getWhatsAppNo());
        queryParams.addValue(DB_COMMON_COLUMN_WHATSAPP_COUNTRY_CODE, data.getWhatsAppCountryCode());

        queryParams.addValue(DB_COMMON_COLUMN_EMAIL_ID_2, data.getEmailId2());
        queryParams.addValue(DB_COMMON_COLUMN_EMAIL_ID_3, data.getEmailId3());

        queryParams.addValue(DB_COMMON_COLUMN_CONTACT_NO_2, data.getContactNo2());
        queryParams.addValue(DB_COMMON_COLUMN_CONTACT_NO_2_COUNTRY_CODE, data.getContactNo2CountryCode());
        queryParams.addValue(DB_COMMON_COLUMN_CONTACT_NO_2_TITLE, data.getContactNo2Title());
        queryParams.addValue(DB_COMMON_COLUMN_CONTACT_NO_3, data.getContactNo3());
        queryParams.addValue(DB_COMMON_COLUMN_CONTACT_NO_3_COUNTRY_CODE, data.getContactNo3CountryCode());
        queryParams.addValue(DB_COMMON_COLUMN_CONTACT_NO_3_TITLE, data.getContactNo3Title());


        queryParams.addValue(DB_COMMON_COLUMN_ADDRESS_LINE_1, data.getAddressLine1());
        queryParams.addValue(DB_COMMON_COLUMN_ADDRESS_LINE_2, data.getAddressLine2());
        queryParams.addValue(DB_COMMON_COLUMN_CITY_NAME, data.getCityName());
        queryParams.addValue(DB_COMMON_COLUMN_STATE_NAME, data.getStateName());
        queryParams.addValue(DB_COMMON_COLUMN_LANDMARK_NAME, data.getLandmarkName());
        queryParams.addValue(DB_COMMON_COLUMN_PIN_CODE, data.getPinCode());
        queryParams.addValue(DB_COMMON_COLUMN_COUNTRY_NAME, data.getCountryName());

        queryParams.addValue(DB_COMMON_COLUMN_GENDER_TITLE, data.getGenderTitle());
        queryParams.addValue(DB_COMMON_COLUMN_DOB, data.getDob(), Types.TIMESTAMP);

        queryParams.addValue(DB_COMMON_USER_PROFILE_COLUMN_INCOME_RANGE_ID, data.getIncomeRangeId());
        queryParams.addValue(DB_COMMON_USER_PROFILE_COLUMN_INCOME_RANGE_TITLE, data.getIncomeRangeTitle());
    }


    protected void buildInsertClause() {
        query.append(DB_COMMON_USER_PROFILE_INSERT);
    }

}
