package com.paroont.realty.core.db.dao.impl.property.sql.common;

import com.paroont.core.db.dao.impl.common.sql.CoreRowMapper;
import com.paroont.realty.core.db.constant.common.RealtyDbConst;
import com.paroont.realty.core.db.dao.entity.property.common.PropertyBaseDo;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class PropertyBaseRowMapper<T extends PropertyBaseDo> extends CoreRowMapper<T> implements RealtyDbConst {


    @Override
    protected void mapData(T data, ResultSet rs, int rowNum) throws SQLException {

        data.setTemplateId(rs.getLong(DB_COMMON_COLUMN_TEMPLATE_ID));
        data.setProjectName(rs.getString(DB_COMMON_COLUMN_PROJECT_NAME));

        data.setPropertyTypeId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_ID));
        data.setPropertyTypeTitle(rs.getString(DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_TITLE));
        data.setPropertyTypeGroupId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_GROUP_ID));
        data.setPropertyTypeGroupTitle(rs.getString(DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_GROUP_TITLE));

        data.setBuildingName(rs.getString(DB_REALTY_PROPERTY_COLUMN_BUILDING_NAME));
        data.setBuilderName(rs.getString(DB_REALTY_PROPERTY_COLUMN_BUILDER_NAME));
        data.setBuilderWebUrl(rs.getString(DB_REALTY_PROPERTY_COLUMN_BUILDER_WEB_URL));

        data.setAvailabilityId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_AVAILABILITY_ID));
        data.setAvailabilityTitle(rs.getString(DB_REALTY_PROPERTY_COLUMN_AVAILABILITY_TITLE));
        data.setAvailabilityTs(rs.getTimestamp(DB_REALTY_PROPERTY_COLUMN_AVAILABILITY_TS));

        data.setPropertyAgeId(rs.getInt(DB_REALTY_PROPERTY_COLUMN_PROPERTY_AGE_ID));
        data.setPropertyAgeTitle(rs.getString(DB_REALTY_PROPERTY_COLUMN_PROPERTY_AGE_TITLE));

        data.setAddressLine1(rs.getString(DB_COMMON_COLUMN_ADDRESS_LINE_1));
        data.setAddressLine2(rs.getString(DB_COMMON_COLUMN_ADDRESS_LINE_2));
        data.setLocalityIds(rs.getString(DB_REALTY_PROPERTY_COLUMN_LOCALITY_IDS));
        data.setLocalityTitles(rs.getString(DB_REALTY_PROPERTY_COLUMN_LOCALITY_TITLES));

        data.setCityId(rs.getString(DB_COMMON_COLUMN_CITY_ID));
        data.setCityName(rs.getString(DB_COMMON_COLUMN_CITY_NAME));
        data.setAreaId(rs.getString(DB_COMMON_COLUMN_AREA_ID));
        data.setAreaName(rs.getString(DB_COMMON_COLUMN_AREA_NAME));
        data.setStateId(rs.getString(DB_COMMON_COLUMN_STATE_ID));
        data.setStateName(rs.getString(DB_COMMON_COLUMN_STATE_NAME));
        data.setLandmarkId(rs.getString(DB_COMMON_COLUMN_LANDMARK_ID));
        data.setLandmarkName(rs.getString(DB_COMMON_COLUMN_LANDMARK_NAME));
        data.setPinCode(rs.getString(DB_COMMON_COLUMN_PIN_CODE));
        data.setCountryName(rs.getString(DB_COMMON_COLUMN_COUNTRY_NAME));

        data.setTotalFloors(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_FLOORS));
        data.setTotalFlatsFloor(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_FLATS_FLOOR));
        data.setTotalBuildingCoveredParking(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_BUILDING_COVERED_PARKING));
        data.setTotalBuildingOpenParking(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_BUILDING_OPEN_PARKING));
        data.setTotalBuildingVisitorParking(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_BUILDING_VISITOR_PARKING));
        data.setTotalServiceLift(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_SERVICE_LIFT));
        data.setTotalLift(rs.getInt(DB_REALTY_PROPERTY_COLUMN_TOTAL_LIFT));

        data.setReraId(rs.getString(DB_REALTY_COMMON_COLUMN_RERA_ID));
        data.setPropertyDescription(rs.getString(DB_REALTY_PROPERTY_COLUMN_PROPERTY_DESCRIPTION));
        data.setOcTs(rs.getTimestamp(DB_REALTY_PROPERTY_COLUMN_OC_TS));

        data.setEarthquakeResistant(rs.getInt(DB_REALTY_PROPERTY_COLUMN_EARTHQUAKE_RESISTANT));
        data.setGasPipeline(rs.getInt(DB_REALTY_PROPERTY_COLUMN_GAS_PIPELINE));
        data.setClubHouse(rs.getInt(DB_REALTY_PROPERTY_COLUMN_CLUB_HOUSE));
        data.setGym(rs.getInt(DB_REALTY_PROPERTY_COLUMN_GYM));

        data.setKidsPlayArea(rs.getInt(DB_REALTY_PROPERTY_COLUMN_KIDS_PLAY_AREA));
        data.setWaterHarvesting(rs.getInt(DB_REALTY_PROPERTY_COLUMN_WATER_HARVESTING));
        data.setSwimmingPool(rs.getInt(DB_REALTY_PROPERTY_COLUMN_SWIMMING_POOL));
        data.setCommonAreaPowerBackup(rs.getInt(DB_REALTY_PROPERTY_COLUMN_COMMON_AREA_POWER_BACKUP));
        data.setFlatPowerBackup(rs.getInt(DB_REALTY_PROPERTY_COLUMN_FLAT_POWER_BACKUP));
        data.setSeniorCitizenArea(rs.getInt(DB_REALTY_PROPERTY_COLUMN_SENIOR_CITIZEN_AREA));
        data.setGatedSociety(rs.getInt(DB_REALTY_PROPERTY_COLUMN_GATED_SOCIETY));

        data.setWaterSupply(rs.getInt(DB_REALTY_PROPERTY_COLUMN_WATER_SUPPLY));
        data.setLandscapeLawn(rs.getInt(DB_REALTY_PROPERTY_COLUMN_LANDSCAPE_LAWN));
        data.setBanquetHall(rs.getInt(DB_REALTY_PROPERTY_COLUMN_BANQUET_HALL));
        data.setJoggersTrack(rs.getInt(DB_REALTY_PROPERTY_COLUMN_JOGGERS_TRACK));
        data.setCctv(rs.getInt(DB_REALTY_PROPERTY_COLUMN_CCTV));
        data.setFireAlarm(rs.getInt(DB_REALTY_PROPERTY_COLUMN_FIRE_ALARM));
        data.setPetFriendly(rs.getInt(DB_REALTY_PROPERTY_COLUMN_PET_FRIENDLY));

        mapStatusData(data, rs);
        mapCreatedData(data, rs);
        mapUpdatedData(data, rs);
    }
}
