package com.rsatech.core.db.dao.impl.user.profile.sql.common;

import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.entity.user.UserProfileBaseDo;
import com.rsatech.core.db.dao.impl.common.sql.CoreUpdateQueryBuilder;
import com.rsatech.core.db.dao.impl.common.sql.DbQueryUtil;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class UserProfileBaseUpdateQueryBuilder<D extends UserProfileBaseDo, AD extends CoreAuditDo, AN extends CoreActionBaseDto> extends CoreUpdateQueryBuilder<D, AD, AN> {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileBaseUpdateQueryBuilder.class);

    public UserProfileBaseUpdateQueryBuilder() {

    }


    protected void buildUpdateQuery() {
        buildUpdateClause();

        buildStringUpdateQuery(data.getFirstName(), oldData.getFirstName(), DB_COMMON_COLUMN_FIRST_NAME);
        buildStringUpdateQuery(data.getLastName(), oldData.getLastName(), DB_COMMON_COLUMN_LAST_NAME);

        buildStringUpdateQuery(data.getMobileNo(), oldData.getMobileNo(), DB_COMMON_COLUMN_MOBILE_NO);
        buildStringUpdateQuery(data.getMobileCountryCode(), oldData.getMobileCountryCode(), DB_COMMON_COLUMN_MOBILE_COUNTRY_CODE);
        buildStringUpdateQuery(data.getEmailId(), oldData.getEmailId(), DB_COMMON_COLUMN_EMAIL_ID);

        buildNumberUpdateQuery(data.getStatusId(), oldData.getStatusId(), DB_COMMON_COLUMN_STATUS_ID);
        buildStringUpdateQuery(data.getStatusTitle(), oldData.getStatusTitle(), DB_COMMON_COLUMN_STATUS_TITLE);

        buildNumberUpdateQuery(data.getProfileTypeId(), oldData.getProfileTypeId(), DB_COMMON_USER_PROFILE_COLUMN_PROFILE_TYPE_ID);
        buildStringUpdateQuery(data.getProfileTypeTitle(), oldData.getProfileTypeTitle(), DB_COMMON_USER_PROFILE_COLUMN_PROFILE_TYPE_TITLE);


        buildStringUpdateQuery(data.getFacebookId(), oldData.getFacebookId(), DB_COMMON_COLUMN_FACEBOOK_ID);
        buildStringUpdateQuery(data.getTwitterId(), oldData.getTwitterId(), DB_COMMON_COLUMN_TWITTER_ID);
        buildStringUpdateQuery(data.getInstagramId(), oldData.getInstagramId(), DB_COMMON_COLUMN_INSTAGRAM_ID);
        buildStringUpdateQuery(data.getWhatsAppNo(), oldData.getWhatsAppNo(), DB_COMMON_COLUMN_WHATSAPP_NO);
        buildStringUpdateQuery(data.getWhatsAppCountryCode(), oldData.getWhatsAppCountryCode(), DB_COMMON_COLUMN_WHATSAPP_COUNTRY_CODE);


        buildStringUpdateQuery(data.getEmailId2(), oldData.getEmailId2(), DB_COMMON_COLUMN_EMAIL_ID_2);
        buildStringUpdateQuery(data.getEmailId3(), oldData.getEmailId3(), DB_COMMON_COLUMN_EMAIL_ID_3);

        buildStringUpdateQuery(data.getContactNo2(), oldData.getContactNo2(), DB_COMMON_COLUMN_CONTACT_NO_2);
        buildStringUpdateQuery(data.getContactNo2CountryCode(), oldData.getContactNo2CountryCode(), DB_COMMON_COLUMN_CONTACT_NO_2_COUNTRY_CODE);
        buildStringUpdateQuery(data.getContactNo2Title(), oldData.getContactNo2Title(), DB_COMMON_COLUMN_CONTACT_NO_2_TITLE);

        buildStringUpdateQuery(data.getContactNo3(), oldData.getContactNo3(), DB_COMMON_COLUMN_CONTACT_NO_3);
        buildStringUpdateQuery(data.getContactNo3CountryCode(), oldData.getContactNo3CountryCode(), DB_COMMON_COLUMN_CONTACT_NO_3_COUNTRY_CODE);
        buildStringUpdateQuery(data.getContactNo3Title(), oldData.getContactNo3Title(), DB_COMMON_COLUMN_CONTACT_NO_3_TITLE);

        buildStringUpdateQuery(data.getAddressLine1(), oldData.getAddressLine1(), DB_COMMON_COLUMN_ADDRESS_LINE_1);
        buildStringUpdateQuery(data.getAddressLine2(), oldData.getAddressLine2(), DB_COMMON_COLUMN_ADDRESS_LINE_2);
        buildStringUpdateQuery(data.getCityName(), oldData.getCityName(), DB_COMMON_COLUMN_CITY_NAME);
        buildStringUpdateQuery(data.getStateName(), oldData.getStateName(), DB_COMMON_COLUMN_STATE_NAME);
        buildStringUpdateQuery(data.getLandmarkName(), oldData.getLandmarkName(), DB_COMMON_COLUMN_LANDMARK_NAME);
        buildStringUpdateQuery(data.getPinCode(), oldData.getPinCode(), DB_COMMON_COLUMN_PIN_CODE);
        buildStringUpdateQuery(data.getCountryName(), oldData.getCountryName(), DB_COMMON_COLUMN_COUNTRY_NAME);

        buildStringUpdateQuery(data.getGenderTitle(), oldData.getGenderTitle(), DB_COMMON_COLUMN_GENDER_TITLE);
        buildTimestampUpdateQuery(data.getDob(), oldData.getDob(), DB_COMMON_COLUMN_DOB);

        buildNumberUpdateQuery(data.getIncomeRangeId(), oldData.getIncomeRangeId(), DB_COMMON_USER_PROFILE_COLUMN_INCOME_RANGE_ID);
        buildStringUpdateQuery(data.getIncomeRangeTitle(), oldData.getIncomeRangeTitle(), DB_COMMON_USER_PROFILE_COLUMN_INCOME_RANGE_TITLE);
    }


    protected void buildUpdateClause() {
        query.append("UPDATE USER_PROFILE SET UPDATED_BY = :UPDATED_BY, UPDATED_TS = :UPDATED_TS ");
    }


    @Override
    protected void buildWhereQuery() {
        includeWhereClause();
        if (data.getUserId() > 0) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_USER_ID));
            queryParams.addValue(DB_COMMON_COLUMN_USER_ID, data.getUserId());
        } else {
            includeNotMatchingClause();
        }
    }


}
