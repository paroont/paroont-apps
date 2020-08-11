package com.rsatech.realty.core.db.dao.impl.property.sql.post;

import com.rsatech.realty.core.db.dao.entity.property.post.PostPropertyDo;
import com.rsatech.realty.core.db.dao.impl.property.sql.common.PropertyBaseRowMapper;

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
        data.setPropertyId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_PROPERTY_ID));

        data.setTransactionTypeId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TRANSACTION_TYPE_ID));
        data.setTransactionTypeTitle(rs.getString(DB_REALTY_PROPERTY_COLUMN_TRANSACTION_TYPE_TITLE));
        data.setConfigurationId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_CONFIGURATION_ID));
        data.setConfigurationTitle(rs.getString(DB_REALTY_PROPERTY_COLUMN_CONFIGURATION_TITLE));

        data.setTotalBedrooms(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_BEDROOMS));
        data.setTotalMasterBedrooms(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_MASTER_BEDROOMS));
        data.setTotalBathrooms(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_BATHROOMS));
        data.setTotalBalconies(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_BALCONIES));

        data.setSuperBuiltUpArea(rs.getFloat(DB_REALTY_PROPERTY_COLUMN_SUPER_BUILT_UP_AREA));
        data.setSuperBuiltUpAreaUnitId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_SUPER_BUILT_UP_AREA_UNIT_ID));
        data.setSuperBuiltUpAreaUnitTitle(rs.getString(DB_REALTY_PROPERTY_COLUMN_SUPER_BUILT_UP_AREA_UNIT_TITLE));

        data.setBuiltUpArea(rs.getFloat(DB_REALTY_PROPERTY_COLUMN_BUILT_UP_AREA));
        data.setBuiltUpAreaUnitId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_BUILT_UP_AREA_UNIT_ID));
        data.setBuiltUpAreaUnitTitle(rs.getString(DB_REALTY_PROPERTY_COLUMN_BUILT_UP_AREA_UNIT_TITLE));

        data.setCarpetArea(rs.getFloat(DB_REALTY_PROPERTY_COLUMN_CARPET_AREA));
        data.setCarpetAreaUnitId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_CARPET_AREA_UNIT_ID));
        data.setCarpetAreaUnitTitle(rs.getString(DB_REALTY_PROPERTY_COLUMN_CARPET_AREA_UNIT_TITLE));

        data.setFurnishId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_FURNISH_TYPE_ID));
        data.setFurnishTitle(rs.getString(DB_REALTY_PROPERTY_COLUMN_FURNISH_TYPE_TITLE));

        data.setFloorId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_FLOOR_ID));
        data.setFloorNo(rs.getString(DB_REALTY_PROPERTY_COLUMN_FLOOR_NO));

        data.setTotalCoveredParking(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_COVERED_PARKING));
        data.setTotalOpenParking(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_OPEN_PARKING));

        data.setFaceId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_FACE_ID));
        data.setFaceTitle(rs.getString(DB_REALTY_PROPERTY_COLUMN_FACE_TITLE));

        data.setOverlookIds(rs.getString(DB_REALTY_PROPERTY_COLUMN_OVERLOOK_IDS));
        data.setOverlookTitles(rs.getString(DB_REALTY_PROPERTY_COLUMN_OVERLOOK_TITLES));

        data.setFloorTypeIds(rs.getString(DB_REALTY_PROPERTY_COLUMN_FLOOR_TYPE_IDS));
        data.setFloorTypeTitles(rs.getString(DB_REALTY_PROPERTY_COLUMN_FLOOR_TYPE_TITLES));


        data.setAmountNegotiable(rs.getInt(DB_REALTY_PROPERTY_COLUMN_AMOUNT_NEGOTIABLE));
        data.setMaintenanceAmount(rs.getFloat(DB_REALTY_PROPERTY_COLUMN_MAINTENANCE_AMOUNT));
        data.setMaintenancePeriodId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_MAINTENANCE_PERIOD_ID));
        data.setMaintenancePeriodTitle(rs.getString(DB_REALTY_PROPERTY_COLUMN_MAINTENANCE_PERIOD_TITLE));

        data.setModularKitchen(rs.getInt(DB_REALTY_PROPERTY_COLUMN_MODULAR_KITCHEN));
        data.setPoojaRoom(rs.getInt(DB_REALTY_PROPERTY_COLUMN_POOJA_ROOM));
        data.setStudyRoom(rs.getInt(DB_REALTY_PROPERTY_COLUMN_STUDY_ROOM));
        data.setServantRoom(rs.getInt(DB_REALTY_PROPERTY_COLUMN_SERVANT_ROOM));
        data.setOthersRoom(rs.getInt(DB_REALTY_PROPERTY_COLUMN_OTHERS_ROOM));

        data.setNotes(rs.getString(DB_COMMON_COLUMN_NOTES));
        data.setTotalBrokers(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_BROKER));
        data.setWeekdaysVisitingIds(rs.getString(DB_REALTY_PROPERTY_COLUMN_WEEKDAYS_VISIT_TIME_IDS));
        data.setWeekdaysVisitingTitles(rs.getString(DB_REALTY_PROPERTY_COLUMN_WEEKDAYS_VISIT_TIME_TITLES));
        data.setWeekendVisitingIds(rs.getString(DB_REALTY_PROPERTY_COLUMN_WEEKEND_VISIT_TIME_IDS));
        data.setWeekendVisitingTitles(rs.getString(DB_REALTY_PROPERTY_COLUMN_WEEKEND_VISIT_TIME_TITLES));


        data.setHeavyDeposit(rs.getInt(DB_REALTY_PROPERTY_COLUMN_HEAVY_DEPOSIT));
        data.setExpectedDepositAmount(rs.getFloat(DB_REALTY_PROPERTY_COLUMN_EXPECTED_DEPOSIT_AMOUNT));


        data.setExpectedRentAmount(rs.getFloat(DB_REALTY_PROPERTY_COLUMN_EXPECTED_RENTAL_AMOUNT));
        data.setExpectedAmount(rs.getDouble(DB_REALTY_PROPERTY_COLUMN_EXPECTED_AMOUNT));
        data.setAllInclusiveAmount(rs.getInt(DB_REALTY_PROPERTY_COLUMN_ALL_INCLUSIVE_PRICE));
        data.setTaxAndGovChargeIncluded(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TAX_AND_GOV_CHARGE_INCLUDED));


    }
}
