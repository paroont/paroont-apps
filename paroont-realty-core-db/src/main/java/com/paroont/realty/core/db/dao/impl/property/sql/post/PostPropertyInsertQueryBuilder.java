package com.paroont.realty.core.db.dao.impl.property.sql.post;

import com.paroont.realty.core.db.dao.impl.property.sql.common.PropertyBaseInsertQueryBuilder;
import com.paroont.realty.core.db.dao.entity.property.post.PostPropertyAuditDo;
import com.paroont.realty.core.db.dao.entity.property.post.PostPropertyDo;
import com.paroont.realty.core.shared.dto.property.common.PropertyActionDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostPropertyInsertQueryBuilder extends PropertyBaseInsertQueryBuilder<PostPropertyDo, PostPropertyAuditDo, PropertyActionDto> {
    private static final Logger logger = LoggerFactory.getLogger(PostPropertyInsertQueryBuilder.class);


    public PostPropertyInsertQueryBuilder() {

    }


    @Override
    protected void buildInsertQuery() {
        super.buildInsertQuery();

        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_PROPERTY_ID, data.getPropertyId());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_TRANSACTION_TYPE_ID, data.getTransactionTypeId());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_TRANSACTION_TYPE_TITLE, data.getTransactionTypeTitle());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_CONFIGURATION_ID, data.getConfigurationId());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_CONFIGURATION_TITLE, data.getConfigurationTitle());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_TOTAL_BEDROOMS, data.getTotalBedrooms());

        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_TOTAL_MASTER_BEDROOMS, data.getTotalMasterBedrooms());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_TOTAL_BATHROOMS, data.getTotalBathrooms());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_TOTAL_BALCONIES, data.getTotalBalconies());

        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_SUPER_BUILT_UP_AREA, data.getSuperBuiltUpArea());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_SUPER_BUILT_UP_AREA_UNIT_ID, data.getBuiltUpAreaUnitId());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_SUPER_BUILT_UP_AREA_UNIT_TITLE, data.getSuperBuiltUpAreaUnitTitle());

        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_BUILT_UP_AREA, data.getBuiltUpArea());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_BUILT_UP_AREA_UNIT_ID, data.getBuiltUpAreaUnitId());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_BUILT_UP_AREA_UNIT_TITLE, data.getBuiltUpAreaUnitTitle());


        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_CARPET_AREA, data.getCarpetArea());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_CARPET_AREA_UNIT_ID, data.getCarpetAreaUnitId());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_CARPET_AREA_UNIT_TITLE, data.getCarpetAreaUnitTitle());

        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_FURNISH_TYPE_ID, data.getFurnishId());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_FURNISH_TYPE_TITLE, data.getFurnishTitle());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_FLOOR_ID, data.getFloorId());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_FLOOR_NO, data.getFloorNo());

        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_TOTAL_COVERED_PARKING, data.getTotalCoveredParking());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_TOTAL_OPEN_PARKING, data.getTotalOpenParking());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_FACE_ID, data.getFaceId());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_FACE_TITLE, data.getFaceTitle());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_OVERLOOK_IDS, data.getOverlookIds());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_OVERLOOK_TITLES, data.getOverlookTitles());

        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_FLOOR_TYPE_IDS, data.getFloorTypeIds());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_FLOOR_TYPE_TITLES, data.getFloorTypeTitles());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_AMOUNT_NEGOTIABLE, data.getAmountNegotiable());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_MAINTENANCE_AMOUNT, data.getMaintenanceAmount());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_MAINTENANCE_PERIOD_ID, data.getMaintenancePeriodId());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_MAINTENANCE_PERIOD_TITLE, data.getMaintenancePeriodTitle());

        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_MODULAR_KITCHEN, data.getModularKitchen());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_POOJA_ROOM, data.getPoojaRoom());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_STUDY_ROOM, data.getStudyRoom());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_SERVANT_ROOM, data.getServantRoom());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_OTHERS_ROOM, data.getOthersRoom());

        queryParams.addValue(DB_COMMON_COLUMN_NOTES, data.getNotes());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_TOTAL_BROKER, data.getTotalBrokers());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_WEEKDAYS_VISIT_TIME_IDS, data.getWeekdaysVisitingIds());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_WEEKDAYS_VISIT_TIME_TITLES, data.getWeekdaysVisitingTitles());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_WEEKEND_VISIT_TIME_IDS, data.getWeekendVisitingIds());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_WEEKEND_VISIT_TIME_TITLES, data.getWeekendVisitingTitles());

        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_HEAVY_DEPOSIT, data.getHeavyDeposit());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_EXPECTED_DEPOSIT_AMOUNT, data.getExpectedDepositAmount());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_EXPECTED_AMOUNT, data.getExpectedAmount());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_ALL_INCLUSIVE_PRICE, data.getAllInclusiveAmount());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_TAX_AND_GOV_CHARGE_INCLUDED, data.getTaxAndGovChargeIncluded());

        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_POSTED_BY, data.getPostedBy());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_POSTED_BY_NAME, data.getPostedByName());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_POSTED_TS, data.getPostedTs());

        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_POSTED_USER_TYPE_ID, data.getPostedUserTypeId());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_POSTED_USER_TYPE_TITLE, data.getPostedUserTypeTitle());

        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_DEAL_TS, data.getDealTs());

        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_TENANT_TYPE_ID, data.getTenantTypeId());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_TENANT_TYPE_TITLE, data.getTenantTypeTitle());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_SALE_TYPE_ID, data.getSaleTypeId());
        queryParams.addValue(DB_REALTY_PROPERTY_COLUMN_SALE_TYPE_TITLE, data.getSaleTypeTitle());

    }


    protected void buildInsertClause() {
        query.append(DB_REALTY_POST_PROPERTY_INSERT);
    }


}
