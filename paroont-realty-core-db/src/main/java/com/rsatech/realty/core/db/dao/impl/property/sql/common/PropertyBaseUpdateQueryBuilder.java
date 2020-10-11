package com.rsatech.realty.core.db.dao.impl.property.sql.common;

import com.rsatech.core.db.dao.impl.common.sql.CoreUpdateQueryBuilder;
import com.rsatech.realty.core.db.constant.common.RealtyDbConst;
import com.rsatech.realty.core.db.dao.entity.common.RealtyAuditDo;
import com.rsatech.realty.core.db.dao.entity.property.common.PropertyBaseDo;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PropertyBaseUpdateQueryBuilder<D extends PropertyBaseDo, AD extends RealtyAuditDo, AN extends PropertyActionDto> extends CoreUpdateQueryBuilder<D, AD, AN> implements RealtyDbConst {
    private static final Logger logger = LoggerFactory.getLogger(PropertyBaseUpdateQueryBuilder.class);

    public PropertyBaseUpdateQueryBuilder() {


    }


    protected void buildUpdateQuery() {
        buildUpdateClause();
        buildStatusUpdateQuery();

        buildNumberUpdateQuery(data.getTemplateId(), oldData.getTemplateId(), DB_COMMON_COLUMN_TEMPLATE_ID);
        buildStringUpdateQuery(data.getProjectName(), oldData.getProjectName(), DB_COMMON_COLUMN_PROJECT_NAME);

        buildNumberUpdateQuery(data.getPropertyTypeId(), oldData.getPropertyTypeId(), DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_ID);
        buildStringUpdateQuery(data.getPropertyTypeTitle(), oldData.getPropertyTypeTitle(), DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_TITLE);

        buildNumberUpdateQuery(data.getPropertyTypeGroupId(), oldData.getPropertyTypeGroupId(), DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_GROUP_ID);
        buildStringUpdateQuery(data.getPropertyTypeGroupTitle(), oldData.getPropertyTypeGroupTitle(), DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_GROUP_TITLE);

        buildStringUpdateQuery(data.getBuildingName(), oldData.getBuildingName(), DB_REALTY_PROPERTY_COLUMN_BUILDING_NAME);
        buildStringUpdateQuery(data.getBuilderName(), oldData.getBuilderName(), DB_REALTY_PROPERTY_COLUMN_BUILDER_NAME);
        buildStringUpdateQuery(data.getBuilderWebUrl(), oldData.getBuilderWebUrl(), DB_REALTY_PROPERTY_COLUMN_BUILDER_WEB_URL);

        buildNumberUpdateQuery(data.getAvailabilityId(), oldData.getAvailabilityId(), DB_REALTY_PROPERTY_COLUMN_AVAILABILITY_ID);
        buildStringUpdateQuery(data.getAvailabilityTitle(), oldData.getAvailabilityTitle(), DB_REALTY_PROPERTY_COLUMN_AVAILABILITY_TITLE);
        buildTimestampUpdateQuery(data.getAvailabilityTs(), oldData.getAvailabilityTs(), DB_REALTY_PROPERTY_COLUMN_AVAILABILITY_TS);

        buildNumberUpdateQuery(data.getPropertyAgeId(), oldData.getPropertyAgeId(), DB_REALTY_PROPERTY_COLUMN_PROPERTY_AGE_ID);
        buildStringUpdateQuery(data.getPropertyAgeTitle(), oldData.getPropertyAgeTitle(), DB_REALTY_PROPERTY_COLUMN_PROPERTY_AGE_TITLE);

        buildStringUpdateQuery(data.getLocalityIds(), oldData.getLocalityIds(), DB_REALTY_PROPERTY_COLUMN_LOCALITY_IDS);
        buildStringUpdateQuery(data.getLocalityTitles(), oldData.getLocalityTitles(), DB_REALTY_PROPERTY_COLUMN_LOCALITY_TITLES);

        buildStringUpdateQuery(data.getAddressLine1(), oldData.getAddressLine1(), DB_COMMON_COLUMN_ADDRESS_LINE_1);
        buildStringUpdateQuery(data.getAddressLine2(), oldData.getAddressLine2(), DB_COMMON_COLUMN_ADDRESS_LINE_2);
        buildStringUpdateQuery(data.getCityName(), oldData.getCityName(), DB_COMMON_COLUMN_CITY_NAME);
        buildStringUpdateQuery(data.getAreaName(), oldData.getAreaName(), DB_COMMON_COLUMN_AREA_NAME);
        buildStringUpdateQuery(data.getStateName(), oldData.getStateName(), DB_COMMON_COLUMN_STATE_NAME);
        buildStringUpdateQuery(data.getLandmarkName(), oldData.getLandmarkName(), DB_COMMON_COLUMN_LANDMARK_NAME);
        buildStringUpdateQuery(data.getPinCode(), oldData.getPinCode(), DB_COMMON_COLUMN_PIN_CODE);
        buildStringUpdateQuery(data.getCountryName(), oldData.getCountryName(), DB_COMMON_COLUMN_COUNTRY_NAME);

        buildNumberUpdateQuery(data.getTotalFloors(), oldData.getTotalFloors(), DB_REALTY_PROPERTY_COLUMN_TOTAL_FLOORS);
        buildNumberUpdateQuery(data.getTotalFlatsFloor(), oldData.getTotalFlatsFloor(), DB_REALTY_PROPERTY_COLUMN_TOTAL_FLATS_FLOOR);
        buildNumberUpdateQuery(data.getTotalBuildingCoveredParking(), oldData.getTotalBuildingCoveredParking(), DB_REALTY_PROPERTY_COLUMN_TOTAL_BUILDING_COVERED_PARKING);
        buildNumberUpdateQuery(data.getTotalBuildingOpenParking(), oldData.getTotalBuildingOpenParking(), DB_REALTY_PROPERTY_COLUMN_TOTAL_BUILDING_OPEN_PARKING);
        buildNumberUpdateQuery(data.getTotalBuildingVisitorParking(), oldData.getTotalBuildingVisitorParking(), DB_REALTY_PROPERTY_COLUMN_TOTAL_BUILDING_VISITOR_PARKING);
        buildNumberUpdateQuery(data.getTotalServiceLift(), oldData.getTotalServiceLift(), DB_REALTY_PROPERTY_COLUMN_TOTAL_SERVICE_LIFT);
        buildNumberUpdateQuery(data.getTotalLift(), oldData.getTotalLift(), DB_REALTY_PROPERTY_COLUMN_TOTAL_LIFT);

        buildStringUpdateQuery(data.getReraId(), oldData.getReraId(), DB_REALTY_COMMON_COLUMN_RERA_ID);
        buildStringUpdateQuery(data.getPropertyDescription(), oldData.getPropertyDescription(), DB_REALTY_PROPERTY_COLUMN_PROPERTY_DESCRIPTION);
        buildTimestampUpdateQuery(data.getOcTs(), oldData.getOcTs(), DB_REALTY_PROPERTY_COLUMN_OC_TS);

        buildNumberUpdateQuery(data.getEarthquakeResistant(), oldData.getEarthquakeResistant(), DB_REALTY_PROPERTY_COLUMN_EARTHQUAKE_RESISTANT);
        buildNumberUpdateQuery(data.getGasPipeline(), oldData.getGasPipeline(), DB_REALTY_PROPERTY_COLUMN_GAS_PIPELINE);
        buildNumberUpdateQuery(data.getClubHouse(), oldData.getClubHouse(), DB_REALTY_PROPERTY_COLUMN_CLUB_HOUSE);
        buildNumberUpdateQuery(data.getGym(), oldData.getGym(), DB_REALTY_PROPERTY_COLUMN_GYM);

        buildNumberUpdateQuery(data.getKidsPlayArea(), oldData.getKidsPlayArea(), DB_REALTY_PROPERTY_COLUMN_KIDS_PLAY_AREA);
        buildNumberUpdateQuery(data.getWaterHarvesting(), oldData.getWaterHarvesting(), DB_REALTY_PROPERTY_COLUMN_WATER_HARVESTING);
        buildNumberUpdateQuery(data.getSwimmingPool(), oldData.getSwimmingPool(), DB_REALTY_PROPERTY_COLUMN_SWIMMING_POOL);
        buildNumberUpdateQuery(data.getCommonAreaPowerBackup(), oldData.getCommonAreaPowerBackup(), DB_REALTY_PROPERTY_COLUMN_COMMON_AREA_POWER_BACKUP);
        buildNumberUpdateQuery(data.getFlatPowerBackup(), oldData.getFlatPowerBackup(), DB_REALTY_PROPERTY_COLUMN_FLAT_POWER_BACKUP);
        buildNumberUpdateQuery(data.getSeniorCitizenArea(), oldData.getSeniorCitizenArea(), DB_REALTY_PROPERTY_COLUMN_SENIOR_CITIZEN_AREA);
        buildNumberUpdateQuery(data.getGatedSociety(), oldData.getGatedSociety(), DB_REALTY_PROPERTY_COLUMN_GATED_SOCIETY);

        buildNumberUpdateQuery(data.getWaterSupply(), oldData.getWaterSupply(), DB_REALTY_PROPERTY_COLUMN_WATER_SUPPLY);
        buildNumberUpdateQuery(data.getLandscapeLawn(), oldData.getLandscapeLawn(), DB_REALTY_PROPERTY_COLUMN_LANDSCAPE_LAWN);
        buildNumberUpdateQuery(data.getBanquetHall(), oldData.getBanquetHall(), DB_REALTY_PROPERTY_COLUMN_BANQUET_HALL);
        buildNumberUpdateQuery(data.getJoggersTrack(), oldData.getJoggersTrack(), DB_REALTY_PROPERTY_COLUMN_JOGGERS_TRACK);
        buildNumberUpdateQuery(data.getCctv(), oldData.getCctv(), DB_REALTY_PROPERTY_COLUMN_CCTV);
        buildNumberUpdateQuery(data.getFireAlarm(), oldData.getFireAlarm(), DB_REALTY_PROPERTY_COLUMN_FIRE_ALARM);
        buildNumberUpdateQuery(data.getPetFriendly(), oldData.getPetFriendly(), DB_REALTY_PROPERTY_COLUMN_PET_FRIENDLY);
    }

    protected abstract void buildUpdateClause();


    @Override
    protected void buildWhereQuery() {
        includeWhereClause();
    }


}
