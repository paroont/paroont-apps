package com.paroont.realty.core.db.dao.impl.property.sql.common;

import com.paroont.core.db.dao.impl.common.sql.CoreUpdateQueryBuilder;
import com.paroont.realty.core.db.constant.common.RealtyDbConst;
import com.paroont.realty.core.db.constant.property.PropertyDbConstant;
import com.paroont.realty.core.db.dao.entity.common.RealtyAuditDo;
import com.paroont.realty.core.db.dao.entity.property.common.PropertyBaseDo;
import com.paroont.realty.core.shared.dto.property.common.PropertyActionDto;
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

        buildNumberUpdateQuery(data.getPropertyTypeId(), oldData.getPropertyTypeId(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_ID);
        buildStringUpdateQuery(data.getPropertyTypeTitle(), oldData.getPropertyTypeTitle(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_TITLE);

        buildNumberUpdateQuery(data.getPropertyTypeGroupId(), oldData.getPropertyTypeGroupId(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_GROUP_ID);
        buildStringUpdateQuery(data.getPropertyTypeGroupTitle(), oldData.getPropertyTypeGroupTitle(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_TYPE_GROUP_TITLE);

        buildStringUpdateQuery(data.getBuildingName(), oldData.getBuildingName(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_BUILDING_NAME);
        buildStringUpdateQuery(data.getBuilderName(), oldData.getBuilderName(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_BUILDER_NAME);
        buildStringUpdateQuery(data.getBuilderWebUrl(), oldData.getBuilderWebUrl(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_BUILDER_WEB_URL);

        buildNumberUpdateQuery(data.getAvailabilityId(), oldData.getAvailabilityId(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_AVAILABILITY_ID);
        buildStringUpdateQuery(data.getAvailabilityTitle(), oldData.getAvailabilityTitle(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_AVAILABILITY_TITLE);
        buildTimestampUpdateQuery(data.getAvailabilityTs(), oldData.getAvailabilityTs(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_AVAILABILITY_TS);

        buildNumberUpdateQuery(data.getPropertyAgeId(), oldData.getPropertyAgeId(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_AGE_ID);
        buildStringUpdateQuery(data.getPropertyAgeTitle(), oldData.getPropertyAgeTitle(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_AGE_TITLE);

        buildStringUpdateQuery(data.getLocalityIds(), oldData.getLocalityIds(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_LOCALITY_IDS);
        buildStringUpdateQuery(data.getLocalityTitles(), oldData.getLocalityTitles(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_LOCALITY_TITLES);

        buildStringUpdateQuery(data.getAddressLine1(), oldData.getAddressLine1(), DB_COMMON_COLUMN_ADDRESS_LINE_1);
        buildStringUpdateQuery(data.getAddressLine2(), oldData.getAddressLine2(), DB_COMMON_COLUMN_ADDRESS_LINE_2);
        buildStringUpdateQuery(data.getCityId(), oldData.getCityId(), DB_COMMON_COLUMN_CITY_ID);
        buildStringUpdateQuery(data.getCityName(), oldData.getCityName(), DB_COMMON_COLUMN_CITY_NAME);
        buildStringUpdateQuery(data.getAreaId(), oldData.getAreaId(), DB_COMMON_COLUMN_AREA_ID);
        buildStringUpdateQuery(data.getAreaName(), oldData.getAreaName(), DB_COMMON_COLUMN_AREA_NAME);
        buildStringUpdateQuery(data.getStateId(), oldData.getStateId(), DB_COMMON_COLUMN_STATE_ID);
        buildStringUpdateQuery(data.getStateName(), oldData.getStateName(), DB_COMMON_COLUMN_STATE_NAME);
        buildStringUpdateQuery(data.getLandmarkId(), oldData.getLandmarkId(), DB_COMMON_COLUMN_LANDMARK_ID);
        buildStringUpdateQuery(data.getLandmarkName(), oldData.getLandmarkName(), DB_COMMON_COLUMN_LANDMARK_NAME);
        buildStringUpdateQuery(data.getPinCode(), oldData.getPinCode(), DB_COMMON_COLUMN_PIN_CODE);
        buildStringUpdateQuery(data.getCountryName(), oldData.getCountryName(), DB_COMMON_COLUMN_COUNTRY_NAME);

        buildNumberUpdateQuery(data.getTotalFloors(), oldData.getTotalFloors(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_FLOORS);
        buildNumberUpdateQuery(data.getTotalFlatsFloor(), oldData.getTotalFlatsFloor(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_FLATS_FLOOR);
        buildNumberUpdateQuery(data.getTotalBuildingCoveredParking(), oldData.getTotalBuildingCoveredParking(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_BUILDING_COVERED_PARKING);
        buildNumberUpdateQuery(data.getTotalBuildingOpenParking(), oldData.getTotalBuildingOpenParking(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_BUILDING_OPEN_PARKING);
        buildNumberUpdateQuery(data.getTotalBuildingVisitorParking(), oldData.getTotalBuildingVisitorParking(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_BUILDING_VISITOR_PARKING);
        buildNumberUpdateQuery(data.getTotalServiceLift(), oldData.getTotalServiceLift(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_SERVICE_LIFT);
        buildNumberUpdateQuery(data.getTotalLift(), oldData.getTotalLift(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_TOTAL_LIFT);

        buildStringUpdateQuery(data.getReraId(), oldData.getReraId(), DB_REALTY_COMMON_COLUMN_RERA_ID);
        buildStringUpdateQuery(data.getPropertyDescription(), oldData.getPropertyDescription(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PROPERTY_DESCRIPTION);
        buildTimestampUpdateQuery(data.getOcTs(), oldData.getOcTs(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_OC_TS);

        buildNumberUpdateQuery(data.getEarthquakeResistant(), oldData.getEarthquakeResistant(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_EARTHQUAKE_RESISTANT);
        buildNumberUpdateQuery(data.getGasPipeline(), oldData.getGasPipeline(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_GAS_PIPELINE);
        buildNumberUpdateQuery(data.getClubHouse(), oldData.getClubHouse(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_CLUB_HOUSE);
        buildNumberUpdateQuery(data.getGym(), oldData.getGym(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_GYM);

        buildNumberUpdateQuery(data.getKidsPlayArea(), oldData.getKidsPlayArea(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_KIDS_PLAY_AREA);
        buildNumberUpdateQuery(data.getWaterHarvesting(), oldData.getWaterHarvesting(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_WATER_HARVESTING);
        buildNumberUpdateQuery(data.getSwimmingPool(), oldData.getSwimmingPool(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_SWIMMING_POOL);
        buildNumberUpdateQuery(data.getCommonAreaPowerBackup(), oldData.getCommonAreaPowerBackup(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_COMMON_AREA_POWER_BACKUP);
        buildNumberUpdateQuery(data.getFlatPowerBackup(), oldData.getFlatPowerBackup(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_FLAT_POWER_BACKUP);
        buildNumberUpdateQuery(data.getSeniorCitizenArea(), oldData.getSeniorCitizenArea(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_SENIOR_CITIZEN_AREA);
        buildNumberUpdateQuery(data.getGatedSociety(), oldData.getGatedSociety(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_GATED_SOCIETY);

        buildNumberUpdateQuery(data.getWaterSupply(), oldData.getWaterSupply(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_WATER_SUPPLY);
        buildNumberUpdateQuery(data.getLandscapeLawn(), oldData.getLandscapeLawn(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_LANDSCAPE_LAWN);
        buildNumberUpdateQuery(data.getBanquetHall(), oldData.getBanquetHall(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_BANQUET_HALL);
        buildNumberUpdateQuery(data.getJoggersTrack(), oldData.getJoggersTrack(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_JOGGERS_TRACK);
        buildNumberUpdateQuery(data.getCctv(), oldData.getCctv(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_CCTV);
        buildNumberUpdateQuery(data.getFireAlarm(), oldData.getFireAlarm(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_FIRE_ALARM);
        buildNumberUpdateQuery(data.getPetFriendly(), oldData.getPetFriendly(), PropertyDbConstant.DB_REALTY_PROPERTY_COLUMN_PET_FRIENDLY);
    }

    protected abstract void buildUpdateClause();


    @Override
    protected void buildWhereQuery() {
        includeWhereClause();
    }


}
