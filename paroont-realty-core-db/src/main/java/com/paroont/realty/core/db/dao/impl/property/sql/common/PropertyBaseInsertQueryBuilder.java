package com.paroont.realty.core.db.dao.impl.property.sql.common;

import com.paroont.core.db.dao.impl.common.sql.CoreInsertQueryBuilder;
import com.paroont.realty.core.db.constant.common.RealtyDbConst;
import com.paroont.realty.core.db.constant.property.PropertyDbConstant;
import com.paroont.realty.core.db.dao.entity.common.RealtyAuditDo;
import com.paroont.realty.core.db.dao.entity.property.common.PropertyBaseDo;
import com.paroont.realty.core.shared.dto.property.common.PropertyActionDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Types;

public abstract class PropertyBaseInsertQueryBuilder<D extends PropertyBaseDo, AD extends RealtyAuditDo, AN extends PropertyActionDto> extends CoreInsertQueryBuilder<D, AD, AN> implements RealtyDbConst {
    private static final Logger logger = LoggerFactory.getLogger(PropertyBaseInsertQueryBuilder.class);

    public PropertyBaseInsertQueryBuilder() {


    }

    @Override
    protected void buildInsertQuery() {
        buildInsertClause();
        buildStatusInsertQuery();

        queryParams.addValue(DB_COMMON_COLUMN_TEMPLATE_ID, data.getTemplateId());
        queryParams.addValue(DB_COMMON_COLUMN_PROJECT_NAME, data.getProjectName());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_ID, data.getPropertyTypeId());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_TITLE, data.getPropertyTypeTitle());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_GROUP_ID, data.getPropertyTypeGroupId());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_GROUP_TITLE, data.getPropertyTypeGroupTitle());

        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_BUILDING_NAME, data.getBuildingName());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_BUILDER_NAME, data.getBuilderName());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_BUILDER_WEB_URL, data.getBuilderWebUrl());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_AVAILABILITY_ID, data.getAvailabilityId());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_AVAILABILITY_TITLE, data.getAvailabilityTitle());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_AVAILABILITY_TS, data.getAvailabilityTs(), Types.TIMESTAMP);

        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_AGE_ID, data.getPropertyAgeId());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_AGE_TITLE, data.getPropertyAgeTitle());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_LOCALITY_IDS, data.getLocalityIds());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_LOCALITY_TITLES, data.getLocalityTitles());

        queryParams.addValue(DB_COMMON_COLUMN_ADDRESS_LINE_1, data.getAddressLine1());
        queryParams.addValue(DB_COMMON_COLUMN_ADDRESS_LINE_2, data.getAddressLine2());
        queryParams.addValue(DB_COMMON_COLUMN_CITY_ID, data.getCityId());
        queryParams.addValue(DB_COMMON_COLUMN_CITY_NAME, data.getCityName());
        queryParams.addValue(DB_COMMON_COLUMN_AREA_ID, data.getAreaId());
        queryParams.addValue(DB_COMMON_COLUMN_AREA_NAME, data.getAreaName());
        queryParams.addValue(DB_COMMON_COLUMN_STATE_ID, data.getStateId());
        queryParams.addValue(DB_COMMON_COLUMN_STATE_NAME, data.getStateName());
        queryParams.addValue(DB_COMMON_COLUMN_LANDMARK_ID, data.getLandmarkId());
        queryParams.addValue(DB_COMMON_COLUMN_LANDMARK_NAME, data.getLandmarkName());
        queryParams.addValue(DB_COMMON_COLUMN_PIN_CODE, data.getPinCode());
        queryParams.addValue(DB_COMMON_COLUMN_COUNTRY_NAME, data.getCountryName());

        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_FLOORS, data.getTotalFloors());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_FLATS_FLOOR, data.getTotalFlatsFloor());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_BUILDING_COVERED_PARKING, data.getTotalBuildingCoveredParking());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_BUILDING_OPEN_PARKING, data.getTotalBuildingOpenParking());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_BUILDING_VISITOR_PARKING, data.getTotalBuildingVisitorParking());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_SERVICE_LIFT, data.getTotalServiceLift());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_LIFT, data.getTotalLift());

        queryParams.addValue(DB_REALTY_COMMON_COLUMN_RERA_ID, data.getReraId());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_DESCRIPTION, data.getPropertyDescription());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_OC_TS, data.getOcTs(), Types.TIMESTAMP);
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_EARTHQUAKE_RESISTANT, data.getEarthquakeResistant());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_GAS_PIPELINE, data.getGasPipeline());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_CLUB_HOUSE, data.getClubHouse());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_GYM, data.getGym());

        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_KIDS_PLAY_AREA, data.getKidsPlayArea());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_WATER_HARVESTING, data.getWaterHarvesting());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_SWIMMING_POOL, data.getSwimmingPool());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_COMMON_AREA_POWER_BACKUP, data.getCommonAreaPowerBackup());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_FLAT_POWER_BACKUP, data.getFlatPowerBackup());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_SENIOR_CITIZEN_AREA, data.getSeniorCitizenArea());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_GATED_SOCIETY, data.getGatedSociety());

        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_WATER_SUPPLY, data.getWaterSupply());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_LANDSCAPE_LAWN, data.getLandscapeLawn());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_BANQUET_HALL, data.getBanquetHall());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_JOGGERS_TRACK, data.getJoggersTrack());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_CCTV, data.getCctv());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_FIRE_ALARM, data.getFireAlarm());
        queryParams.addValue(PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PET_FRIENDLY, data.getPetFriendly());
    }

    protected abstract void buildInsertClause();


}
