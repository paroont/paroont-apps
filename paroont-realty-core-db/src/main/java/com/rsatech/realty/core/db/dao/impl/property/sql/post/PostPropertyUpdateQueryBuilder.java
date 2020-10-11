package com.rsatech.realty.core.db.dao.impl.property.sql.post;

import com.rsatech.core.db.dao.impl.common.sql.DbQueryUtil;
import com.rsatech.realty.core.db.dao.entity.property.post.PostPropertyAuditDo;
import com.rsatech.realty.core.db.dao.entity.property.post.PostPropertyDo;
import com.rsatech.realty.core.db.dao.impl.property.sql.common.PropertyBaseUpdateQueryBuilder;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostPropertyUpdateQueryBuilder extends PropertyBaseUpdateQueryBuilder<PostPropertyDo, PostPropertyAuditDo, PropertyActionDto> {
    private static final Logger logger = LoggerFactory.getLogger(PostPropertyUpdateQueryBuilder.class);


    public PostPropertyUpdateQueryBuilder() {

    }

    protected void buildUpdateClause() {
        query.append("UPDATE POST_PROPERTY SET UPDATED_BY = :UPDATED_BY, UPDATED_TS = :UPDATED_TS ");
    }

    protected void buildUpdateQuery() {
       super.buildUpdateQuery();

        buildNumberUpdateQuery(data.getPropertyId(), oldData.getPropertyId(), DB_REALTY_PROPERTY_COLUMN_PROPERTY_ID);

        buildNumberUpdateQuery(data.getTransactionTypeId(), oldData.getTransactionTypeId(), DB_REALTY_PROPERTY_COLUMN_TRANSACTION_TYPE_ID);
        buildStringUpdateQuery(data.getTransactionTypeTitle(), oldData.getTransactionTypeTitle(), DB_REALTY_PROPERTY_COLUMN_TRANSACTION_TYPE_TITLE);
        buildNumberUpdateQuery(data.getConfigurationId(), oldData.getConfigurationId(), DB_REALTY_PROPERTY_COLUMN_CONFIGURATION_ID);
        buildStringUpdateQuery(data.getConfigurationTitle(), oldData.getConfigurationTitle(), DB_REALTY_PROPERTY_COLUMN_CONFIGURATION_TITLE);

        buildNumberUpdateQuery(data.getTotalBedrooms(), oldData.getTotalBedrooms(), DB_REALTY_PROPERTY_COLUMN_TOTAL_BEDROOMS);
        buildNumberUpdateQuery(data.getTotalMasterBedrooms(), oldData.getTotalMasterBedrooms(), DB_REALTY_PROPERTY_COLUMN_TOTAL_MASTER_BEDROOMS);
        buildNumberUpdateQuery(data.getTotalBathrooms(), oldData.getTotalBathrooms(), DB_REALTY_PROPERTY_COLUMN_TOTAL_BATHROOMS);
        buildNumberUpdateQuery(data.getTotalBalconies(), oldData.getTotalBalconies(), DB_REALTY_PROPERTY_COLUMN_TOTAL_BALCONIES);

        buildDecimalUpdateQuery(data.getSuperBuiltUpArea(), oldData.getSuperBuiltUpArea(), DB_REALTY_PROPERTY_COLUMN_SUPER_BUILT_UP_AREA);
        buildNumberUpdateQuery(data.getSuperBuiltUpAreaUnitId(), oldData.getSuperBuiltUpAreaUnitId(), DB_REALTY_PROPERTY_COLUMN_SUPER_BUILT_UP_AREA_UNIT_ID);
        buildStringUpdateQuery(data.getSuperBuiltUpAreaUnitTitle(), oldData.getSuperBuiltUpAreaUnitTitle(), DB_REALTY_PROPERTY_COLUMN_SUPER_BUILT_UP_AREA_UNIT_TITLE);

        buildDecimalUpdateQuery(data.getBuiltUpArea(), oldData.getBuiltUpArea(), DB_REALTY_PROPERTY_COLUMN_BUILT_UP_AREA);
        buildNumberUpdateQuery(data.getBuiltUpAreaUnitId(), oldData.getBuiltUpAreaUnitId(), DB_REALTY_PROPERTY_COLUMN_BUILT_UP_AREA_UNIT_ID);
        buildStringUpdateQuery(data.getBuiltUpAreaUnitTitle(), oldData.getBuiltUpAreaUnitTitle(), DB_REALTY_PROPERTY_COLUMN_BUILT_UP_AREA_UNIT_TITLE);

        buildDecimalUpdateQuery(data.getCarpetArea(), oldData.getCarpetArea(), DB_REALTY_PROPERTY_COLUMN_CARPET_AREA);
        buildNumberUpdateQuery(data.getCarpetAreaUnitId(), oldData.getCarpetAreaUnitId(), DB_REALTY_PROPERTY_COLUMN_CARPET_AREA_UNIT_ID);
        buildStringUpdateQuery(data.getCarpetAreaUnitTitle(), oldData.getCarpetAreaUnitTitle(), DB_REALTY_PROPERTY_COLUMN_CARPET_AREA_UNIT_TITLE);

        buildNumberUpdateQuery(data.getFurnishId(), oldData.getFurnishId(), DB_REALTY_PROPERTY_COLUMN_FURNISH_TYPE_ID);
        buildStringUpdateQuery(data.getFurnishTitle(), oldData.getFurnishTitle(), DB_REALTY_PROPERTY_COLUMN_FURNISH_TYPE_TITLE);

        buildNumberUpdateQuery(data.getFloorId(), oldData.getFloorId(), DB_REALTY_PROPERTY_COLUMN_FLOOR_ID);
        buildStringUpdateQuery(data.getFloorNo(), oldData.getFloorNo(), DB_REALTY_PROPERTY_COLUMN_FLOOR_NO);

        buildNumberUpdateQuery(data.getTotalCoveredParking(), oldData.getTotalCoveredParking(), DB_REALTY_PROPERTY_COLUMN_TOTAL_COVERED_PARKING);
        buildNumberUpdateQuery(data.getTotalOpenParking(), oldData.getTotalOpenParking(), DB_REALTY_PROPERTY_COLUMN_TOTAL_OPEN_PARKING);

        buildNumberUpdateQuery(data.getFaceId(), oldData.getFaceId(), DB_REALTY_PROPERTY_COLUMN_FACE_ID);
        buildStringUpdateQuery(data.getFaceTitle(), oldData.getFaceTitle(), DB_REALTY_PROPERTY_COLUMN_FACE_TITLE);

        buildStringUpdateQuery(data.getOverlookIds(), oldData.getOverlookIds(), DB_REALTY_PROPERTY_COLUMN_OVERLOOK_IDS);
        buildStringUpdateQuery(data.getOverlookTitles(), oldData.getOverlookTitles(), DB_REALTY_PROPERTY_COLUMN_OVERLOOK_TITLES);

        buildStringUpdateQuery(data.getFloorTypeIds(), oldData.getFloorTypeIds(), DB_REALTY_PROPERTY_COLUMN_FLOOR_TYPE_IDS);
        buildStringUpdateQuery(data.getFloorTypeTitles(), oldData.getFloorTypeTitles(), DB_REALTY_PROPERTY_COLUMN_FLOOR_TYPE_TITLES);

        buildNumberUpdateQuery(data.getAmountNegotiable(), oldData.getAmountNegotiable(), DB_REALTY_PROPERTY_COLUMN_AMOUNT_NEGOTIABLE);
        buildDecimalUpdateQuery(data.getMaintenanceAmount(), oldData.getMaintenanceAmount(), DB_REALTY_PROPERTY_COLUMN_MAINTENANCE_AMOUNT);
        buildNumberUpdateQuery(data.getMaintenancePeriodId(), oldData.getMaintenancePeriodId(), DB_REALTY_PROPERTY_COLUMN_MAINTENANCE_PERIOD_ID);
        buildStringUpdateQuery(data.getMaintenancePeriodTitle(), oldData.getMaintenancePeriodTitle(), DB_REALTY_PROPERTY_COLUMN_MAINTENANCE_PERIOD_TITLE);

        buildNumberUpdateQuery(data.getModularKitchen(), oldData.getModularKitchen(), DB_REALTY_PROPERTY_COLUMN_MODULAR_KITCHEN);
        buildNumberUpdateQuery(data.getPoojaRoom(), oldData.getPoojaRoom(), DB_REALTY_PROPERTY_COLUMN_POOJA_ROOM);
        buildNumberUpdateQuery(data.getStudyRoom(), oldData.getStudyRoom(), DB_REALTY_PROPERTY_COLUMN_STUDY_ROOM);
        buildNumberUpdateQuery(data.getServantRoom(), oldData.getServantRoom(), DB_REALTY_PROPERTY_COLUMN_SERVANT_ROOM);
        buildNumberUpdateQuery(data.getOthersRoom(), oldData.getOthersRoom(), DB_REALTY_PROPERTY_COLUMN_OTHERS_ROOM);

        buildStringUpdateQuery(data.getNotes(), oldData.getNotes(), DB_COMMON_COLUMN_NOTES);
        buildNumberUpdateQuery(data.getTotalBrokers(), oldData.getTotalBrokers(), DB_REALTY_PROPERTY_COLUMN_TOTAL_BROKER);
        buildStringUpdateQuery(data.getWeekdaysVisitingIds(), oldData.getWeekdaysVisitingIds(), DB_REALTY_PROPERTY_COLUMN_WEEKDAYS_VISIT_TIME_IDS);
        buildStringUpdateQuery(data.getWeekdaysVisitingTitles(), oldData.getWeekdaysVisitingTitles(), DB_REALTY_PROPERTY_COLUMN_WEEKDAYS_VISIT_TIME_TITLES);
        buildStringUpdateQuery(data.getWeekendVisitingIds(), oldData.getWeekendVisitingIds(), DB_REALTY_PROPERTY_COLUMN_WEEKEND_VISIT_TIME_IDS);
        buildStringUpdateQuery(data.getWeekendVisitingTitles(), oldData.getWeekendVisitingTitles(), DB_REALTY_PROPERTY_COLUMN_WEEKEND_VISIT_TIME_TITLES);

        buildNumberUpdateQuery(data.getHeavyDeposit(), oldData.getHeavyDeposit(), DB_REALTY_PROPERTY_COLUMN_HEAVY_DEPOSIT);
        buildDecimalUpdateQuery(data.getExpectedDepositAmount(), oldData.getExpectedDepositAmount(), DB_REALTY_PROPERTY_COLUMN_EXPECTED_DEPOSIT_AMOUNT);

        buildDecimalUpdateQuery(data.getExpectedRentAmount(), oldData.getExpectedRentAmount(), DB_REALTY_PROPERTY_COLUMN_EXPECTED_RENTAL_AMOUNT);
        buildDecimalUpdateQuery(data.getExpectedAmount(), oldData.getExpectedAmount(), DB_REALTY_PROPERTY_COLUMN_EXPECTED_AMOUNT);
        buildNumberUpdateQuery(data.getAllInclusiveAmount(), oldData.getAllInclusiveAmount(), DB_REALTY_PROPERTY_COLUMN_ALL_INCLUSIVE_PRICE);
        buildNumberUpdateQuery(data.getTaxAndGovChargeIncluded(), oldData.getTaxAndGovChargeIncluded(), DB_REALTY_PROPERTY_COLUMN_TAX_AND_GOV_CHARGE_INCLUDED);

        buildStringUpdateQuery(data.getPostedBy(), oldData.getPostedBy(), DB_REALTY_PROPERTY_COLUMN_POSTED_BY);
        buildStringUpdateQuery(data.getPostedByName(), oldData.getPostedByName(), DB_REALTY_PROPERTY_COLUMN_POSTED_BY_NAME);
        buildTimestampUpdateQuery(data.getPostedTs(), oldData.getPostedTs(), DB_REALTY_PROPERTY_COLUMN_POSTED_TS);

        buildNumberUpdateQuery(data.getPostedUserTypeId(), oldData.getPostedUserTypeId(), DB_REALTY_PROPERTY_COLUMN_POSTED_USER_TYPE_ID);
        buildStringUpdateQuery(data.getPostedUserTypeTitle(), oldData.getPostedUserTypeTitle(), DB_REALTY_PROPERTY_COLUMN_POSTED_USER_TYPE_TITLE);
        buildTimestampUpdateQuery(data.getDealTs(), oldData.getDealTs(), DB_REALTY_PROPERTY_COLUMN_DEAL_TS);

        buildNumberUpdateQuery(data.getTenantTypeId(), oldData.getTenantTypeId(), DB_REALTY_PROPERTY_COLUMN_TENANT_TYPE_ID);
        buildStringUpdateQuery(data.getTenantTypeTitle(), oldData.getTenantTypeTitle(), DB_REALTY_PROPERTY_COLUMN_TENANT_TYPE_TITLE);

        buildNumberUpdateQuery(data.getSaleTypeId(), oldData.getSaleTypeId(), DB_REALTY_PROPERTY_COLUMN_SALE_TYPE_ID);
        buildStringUpdateQuery(data.getSaleTypeTitle(), oldData.getSaleTypeTitle(), DB_REALTY_PROPERTY_COLUMN_SALE_TYPE_TITLE);
    }

    @Override
    protected void buildWhereQuery() {
        super.buildWhereQuery();
        if (data.getPropertyId() > 0) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_REALTY_PROPERTY_COLUMN_PROPERTY_ID));
            queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_PROPERTY_ID, data.getPropertyId());
        } else {
            includeNotMatchingClause();
        }
    }

}
