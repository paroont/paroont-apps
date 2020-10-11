package com.paroont.realty.core.db.dao.impl.property.sql.post;

import com.paroont.realty.core.db.constant.property.PropertyDbConstant;
import com.paroont.realty.core.db.dao.impl.property.sql.common.PropertyBaseRowMapper;
import com.paroont.realty.core.db.dao.entity.property.post.PostPropertyDo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PostPropertyRowMapper extends PropertyBaseRowMapper<PostPropertyDo> {
    @Override
    protected PostPropertyDo createData() {
        return new PostPropertyDo();
    }

    @Override
    protected void mapData(PostPropertyDo data, ResultSet rs, int rowNum) throws SQLException {
        super.mapData(data, rs, rowNum);
        data.setPropertyId(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_ID));

        data.setTransactionTypeId(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TRANSACTION_TYPE_ID));
        data.setTransactionTypeTitle(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TRANSACTION_TYPE_TITLE));
        data.setConfigurationId(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_CONFIGURATION_ID));
        data.setConfigurationTitle(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_CONFIGURATION_TITLE));

        data.setTotalBedrooms(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_BEDROOMS));
        data.setTotalMasterBedrooms(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_MASTER_BEDROOMS));
        data.setTotalBathrooms(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_BATHROOMS));
        data.setTotalBalconies(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_BALCONIES));

        data.setSuperBuiltUpArea(rs.getFloat(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_SUPER_BUILT_UP_AREA));
        data.setSuperBuiltUpAreaUnitId(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_SUPER_BUILT_UP_AREA_UNIT_ID));
        data.setSuperBuiltUpAreaUnitTitle(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_SUPER_BUILT_UP_AREA_UNIT_TITLE));

        data.setBuiltUpArea(rs.getFloat(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_BUILT_UP_AREA));
        data.setBuiltUpAreaUnitId(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_BUILT_UP_AREA_UNIT_ID));
        data.setBuiltUpAreaUnitTitle(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_BUILT_UP_AREA_UNIT_TITLE));

        data.setCarpetArea(rs.getFloat(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_CARPET_AREA));
        data.setCarpetAreaUnitId(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_CARPET_AREA_UNIT_ID));
        data.setCarpetAreaUnitTitle(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_CARPET_AREA_UNIT_TITLE));

        data.setFurnishId(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_FURNISH_TYPE_ID));
        data.setFurnishTitle(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_FURNISH_TYPE_TITLE));

        data.setFloorId(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_FLOOR_ID));
        data.setFloorNo(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_FLOOR_NO));

        data.setTotalCoveredParking(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_COVERED_PARKING));
        data.setTotalOpenParking(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_OPEN_PARKING));

        data.setFaceId(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_FACE_ID));
        data.setFaceTitle(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_FACE_TITLE));

        data.setOverlookIds(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_OVERLOOK_IDS));
        data.setOverlookTitles(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_OVERLOOK_TITLES));

        data.setFloorTypeIds(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_FLOOR_TYPE_IDS));
        data.setFloorTypeTitles(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_FLOOR_TYPE_TITLES));


        data.setAmountNegotiable(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_AMOUNT_NEGOTIABLE));
        data.setMaintenanceAmount(rs.getFloat(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_MAINTENANCE_AMOUNT));
        data.setMaintenancePeriodId(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_MAINTENANCE_PERIOD_ID));
        data.setMaintenancePeriodTitle(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_MAINTENANCE_PERIOD_TITLE));

        data.setModularKitchen(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_MODULAR_KITCHEN));
        data.setPoojaRoom(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_POOJA_ROOM));
        data.setStudyRoom(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_STUDY_ROOM));
        data.setServantRoom(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_SERVANT_ROOM));
        data.setOthersRoom(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_OTHERS_ROOM));

        data.setNotes(rs.getString(DB_COMMON_COLUMN_NOTES));
        data.setTotalBrokers(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_BROKER));
        data.setWeekdaysVisitingIds(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_WEEKDAYS_VISIT_TIME_IDS));
        data.setWeekdaysVisitingTitles(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_WEEKDAYS_VISIT_TIME_TITLES));
        data.setWeekendVisitingIds(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_WEEKEND_VISIT_TIME_IDS));
        data.setWeekendVisitingTitles(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_WEEKEND_VISIT_TIME_TITLES));


        data.setHeavyDeposit(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_HEAVY_DEPOSIT));
        data.setExpectedDepositAmount(rs.getFloat(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_EXPECTED_DEPOSIT_AMOUNT));


        data.setExpectedRentAmount(rs.getFloat(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_EXPECTED_RENTAL_AMOUNT));
        data.setExpectedAmount(rs.getDouble(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_EXPECTED_AMOUNT));
        data.setAllInclusiveAmount(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_ALL_INCLUSIVE_PRICE));
        data.setTaxAndGovChargeIncluded(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TAX_AND_GOV_CHARGE_INCLUDED));


        data.setPostedBy(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_POSTED_BY));
        data.setPostedByName(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_POSTED_BY_NAME));
        data.setPostedTs(rs.getTimestamp(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_POSTED_TS));

        data.setPostedUserTypeId(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_POSTED_USER_TYPE_ID));
        data.setPostedUserTypeTitle(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_POSTED_USER_TYPE_TITLE));
        data.setDealTs(rs.getTimestamp(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_DEAL_TS));

        data.setTenantTypeId(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TENANT_TYPE_ID));
        data.setTenantTypeTitle(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TENANT_TYPE_TITLE));

        data.setSaleTypeId(rs.getInt(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_SALE_TYPE_ID));
        data.setSaleTypeTitle(rs.getString(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_SALE_TYPE_TITLE));

    }
}
