package com.rsatech.realty.core.shared.dto.property.common;

import com.rsatech.realty.core.shared.dto.common.RealtyBaseDto;

import java.sql.Timestamp;

public class PropertyBaseDto extends RealtyBaseDto {

    protected long templateId;
    protected String projectName;

    protected int propertyTypeId;
    protected String propertyTypeTitle;

    protected int propertyTypeGroupId;
    protected String propertyTypeGroupTitle;


    protected String buildingName;
    protected String builderName;
    protected String builderWebUrl;

    protected int availabilityId;
    protected String availabilityTitle;
    protected Timestamp availabilityTs;


    protected int propertyAgeId = -1;
    protected String propertyAgeTitle;

    protected String localityIds;
    protected String localityTitles;

    protected String addressLine1;
    protected String addressLine2;
    protected String cityName;
    protected String stateName;
    protected String landmarkName;
    protected String pinCode;
    protected String countryName;

    protected int totalFloors = -1;
    protected int totalFlatsFloor = -1;

    protected int totalBuildingCoveredParking = -1;
    protected int totalBuildingOpenParking = -1;
    protected int totalBuildingVisitorParking = -1;

    protected int totalServiceLift = -1;
    protected int totalLift = -1;


    protected String reraId;

    protected Timestamp ocTs;
    protected String propertyDescription;

    protected int earthquakeResistant = -1;
    protected int gasPipeline = -1;
    protected int clubHouse = -1;
    protected int gym = -1;
    protected int kidsPlayArea = -1;
    protected int waterHarvesting = -1;
    protected int swimmingPool = -1;
    protected int commonAreaPowerBackup = -1;
    protected int flatPowerBackup = -1;
    protected int seniorCitizenArea = -1;
    protected int gatedSociety = -1;
    protected int waterSupply = -1;
    protected int landscapeLawn = -1;
    protected int banquetHall = -1;
    protected int joggersTrack = -1;
    protected int cctv = -1;
    protected int fireAlarm = -1;


    protected int petFriendly = -1;


    public String getReraId() {
        return reraId;
    }

    public void setReraId(String reraId) {
        this.reraId = reraId;
    }

    public long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(long templateId) {
        this.templateId = templateId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getPropertyTypeId() {
        return propertyTypeId;
    }

    public void setPropertyTypeId(int propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    public String getPropertyTypeTitle() {
        return propertyTypeTitle;
    }

    public void setPropertyTypeTitle(String propertyTypeTitle) {
        this.propertyTypeTitle = propertyTypeTitle;
    }

    public int getPropertyTypeGroupId() {
        return propertyTypeGroupId;
    }

    public void setPropertyTypeGroupId(int propertyTypeGroupId) {
        this.propertyTypeGroupId = propertyTypeGroupId;
    }

    public String getPropertyTypeGroupTitle() {
        return propertyTypeGroupTitle;
    }

    public void setPropertyTypeGroupTitle(String propertyTypeGroupTitle) {
        this.propertyTypeGroupTitle = propertyTypeGroupTitle;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuilderName() {
        return builderName;
    }

    public void setBuilderName(String builderName) {
        this.builderName = builderName;
    }

    public String getBuilderWebUrl() {
        return builderWebUrl;
    }

    public void setBuilderWebUrl(String builderWebUrl) {
        this.builderWebUrl = builderWebUrl;
    }

    public int getAvailabilityId() {
        return availabilityId;
    }

    public void setAvailabilityId(int availabilityId) {
        this.availabilityId = availabilityId;
    }

    public String getAvailabilityTitle() {
        return availabilityTitle;
    }

    public void setAvailabilityTitle(String availabilityTitle) {
        this.availabilityTitle = availabilityTitle;
    }

    public Timestamp getAvailabilityTs() {
        return availabilityTs;
    }

    public void setAvailabilityTs(Timestamp availabilityTs) {
        this.availabilityTs = availabilityTs;
    }

    public int getPropertyAgeId() {
        return propertyAgeId;
    }

    public void setPropertyAgeId(int propertyAgeId) {
        this.propertyAgeId = propertyAgeId;
    }

    public String getPropertyAgeTitle() {
        return propertyAgeTitle;
    }

    public void setPropertyAgeTitle(String propertyAgeTitle) {
        this.propertyAgeTitle = propertyAgeTitle;
    }

    public String getLocalityIds() {
        return localityIds;
    }

    public void setLocalityIds(String localityIds) {
        this.localityIds = localityIds;
    }

    public String getLocalityTitles() {
        return localityTitles;
    }

    public void setLocalityTitles(String localityTitles) {
        this.localityTitles = localityTitles;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getLandmarkName() {
        return landmarkName;
    }

    public void setLandmarkName(String landmarkName) {
        this.landmarkName = landmarkName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public int getTotalFlatsFloor() {
        return totalFlatsFloor;
    }

    public void setTotalFlatsFloor(int totalFlatsFloor) {
        this.totalFlatsFloor = totalFlatsFloor;
    }

    public int getTotalBuildingCoveredParking() {
        return totalBuildingCoveredParking;
    }

    public void setTotalBuildingCoveredParking(int totalBuildingCoveredParking) {
        this.totalBuildingCoveredParking = totalBuildingCoveredParking;
    }

    public int getTotalBuildingOpenParking() {
        return totalBuildingOpenParking;
    }

    public void setTotalBuildingOpenParking(int totalBuildingOpenParking) {
        this.totalBuildingOpenParking = totalBuildingOpenParking;
    }

    public int getTotalBuildingVisitorParking() {
        return totalBuildingVisitorParking;
    }

    public void setTotalBuildingVisitorParking(int totalBuildingVisitorParking) {
        this.totalBuildingVisitorParking = totalBuildingVisitorParking;
    }

    public int getTotalServiceLift() {
        return totalServiceLift;
    }

    public void setTotalServiceLift(int totalServiceLift) {
        this.totalServiceLift = totalServiceLift;
    }

    public int getTotalLift() {
        return totalLift;
    }

    public void setTotalLift(int totalLift) {
        this.totalLift = totalLift;
    }

    public Timestamp getOcTs() {
        return ocTs;
    }

    public void setOcTs(Timestamp ocTs) {
        this.ocTs = ocTs;
    }

    public String getPropertyDescription() {
        return propertyDescription;
    }

    public void setPropertyDescription(String propertyDescription) {
        this.propertyDescription = propertyDescription;
    }

    public int getEarthquakeResistant() {
        return earthquakeResistant;
    }

    public void setEarthquakeResistant(int earthquakeResistant) {
        this.earthquakeResistant = earthquakeResistant;
    }

    public int getGasPipeline() {
        return gasPipeline;
    }

    public void setGasPipeline(int gasPipeline) {
        this.gasPipeline = gasPipeline;
    }

    public int getClubHouse() {
        return clubHouse;
    }

    public void setClubHouse(int clubHouse) {
        this.clubHouse = clubHouse;
    }

    public int getGym() {
        return gym;
    }

    public void setGym(int gym) {
        this.gym = gym;
    }

    public int getKidsPlayArea() {
        return kidsPlayArea;
    }

    public void setKidsPlayArea(int kidsPlayArea) {
        this.kidsPlayArea = kidsPlayArea;
    }

    public int getWaterHarvesting() {
        return waterHarvesting;
    }

    public void setWaterHarvesting(int waterHarvesting) {
        this.waterHarvesting = waterHarvesting;
    }

    public int getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(int swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public int getCommonAreaPowerBackup() {
        return commonAreaPowerBackup;
    }

    public void setCommonAreaPowerBackup(int commonAreaPowerBackup) {
        this.commonAreaPowerBackup = commonAreaPowerBackup;
    }

    public int getSeniorCitizenArea() {
        return seniorCitizenArea;
    }

    public void setSeniorCitizenArea(int seniorCitizenArea) {
        this.seniorCitizenArea = seniorCitizenArea;
    }

    public int getGatedSociety() {
        return gatedSociety;
    }

    public void setGatedSociety(int gatedSociety) {
        this.gatedSociety = gatedSociety;
    }

    public int getWaterSupply() {
        return waterSupply;
    }

    public void setWaterSupply(int waterSupply) {
        this.waterSupply = waterSupply;
    }

    public int getLandscapeLawn() {
        return landscapeLawn;
    }

    public void setLandscapeLawn(int landscapeLawn) {
        this.landscapeLawn = landscapeLawn;
    }

    public int getBanquetHall() {
        return banquetHall;
    }

    public void setBanquetHall(int banquetHall) {
        this.banquetHall = banquetHall;
    }

    public int getJoggersTrack() {
        return joggersTrack;
    }

    public void setJoggersTrack(int joggersTrack) {
        this.joggersTrack = joggersTrack;
    }

    public int getCctv() {
        return cctv;
    }

    public void setCctv(int cctv) {
        this.cctv = cctv;
    }

    public int getFireAlarm() {
        return fireAlarm;
    }

    public void setFireAlarm(int fireAlarm) {
        this.fireAlarm = fireAlarm;
    }

    public int getFlatPowerBackup() {
        return flatPowerBackup;
    }

    public void setFlatPowerBackup(int flatPowerBackup) {
        this.flatPowerBackup = flatPowerBackup;
    }

    public int getPetFriendly() {
        return petFriendly;
    }

    public void setPetFriendly(int petFriendly) {
        this.petFriendly = petFriendly;
    }
}
