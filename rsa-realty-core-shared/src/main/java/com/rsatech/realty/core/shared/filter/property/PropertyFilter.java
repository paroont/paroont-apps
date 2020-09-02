package com.rsatech.realty.core.shared.filter.property;

import com.rsatech.realty.core.shared.filter.common.RealtyBaseFilter;

import java.sql.Timestamp;

public class PropertyFilter extends RealtyBaseFilter {

    protected long templateId = -99;

    protected long propertyId = -99;
    protected int propertyTypeId = -99;

    protected long transactionTypeId = -99;

    protected String searchQuery;

    protected double minBudget = -99;
    protected double maxBudget = -99;

    protected int configurationId = -99;
    protected int availabilityId = -99;
    protected Timestamp availabilityTs;

    protected String cityName;
    protected String areaName;
    protected String pinCode;

    protected float minArea = -99;
    protected float maxArea = -99;
    protected int areaTypeId = -99;
    protected int areaUnitId = -99;

    protected int tenantTypeId = -99;
    protected int minFloorNo = -99;
    protected int maxFloorNo = -99;
    protected int floorId = -99;
    protected int saleTypeId = -99;

    protected int faceId = -99;
    protected int furnishId = -99;
    protected int postedUserTypeId = -99;
    protected int totalBathrooms = -99;

    protected int propertyAgeId = -99;

    protected Timestamp postedTs;
    protected String localityIds;


    public long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(long templateId) {
        this.templateId = templateId;
    }

    public long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(long propertyId) {
        this.propertyId = propertyId;
    }

    public long getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(long transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public int getPropertyTypeId() {
        return propertyTypeId;
    }

    public void setPropertyTypeId(int propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }

    public double getMinBudget() {
        return minBudget;
    }

    public void setMinBudget(double minBudget) {
        this.minBudget = minBudget;
    }

    public double getMaxBudget() {
        return maxBudget;
    }

    public void setMaxBudget(double maxBudget) {
        this.maxBudget = maxBudget;
    }

    public int getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(int configurationId) {
        this.configurationId = configurationId;
    }

    public int getAvailabilityId() {
        return availabilityId;
    }

    public void setAvailabilityId(int availabilityId) {
        this.availabilityId = availabilityId;
    }

    public Timestamp getAvailabilityTs() {
        return availabilityTs;
    }

    public void setAvailabilityTs(Timestamp availabilityTs) {
        this.availabilityTs = availabilityTs;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public float getMinArea() {
        return minArea;
    }

    public void setMinArea(float minArea) {
        this.minArea = minArea;
    }

    public float getMaxArea() {
        return maxArea;
    }

    public void setMaxArea(float maxArea) {
        this.maxArea = maxArea;
    }

    public int getAreaTypeId() {
        return areaTypeId;
    }

    public void setAreaTypeId(int areaTypeId) {
        this.areaTypeId = areaTypeId;
    }

    public int getAreaUnitId() {
        return areaUnitId;
    }

    public void setAreaUnitId(int areaUnitId) {
        this.areaUnitId = areaUnitId;
    }

    public int getTenantTypeId() {
        return tenantTypeId;
    }

    public void setTenantTypeId(int tenantTypeId) {
        this.tenantTypeId = tenantTypeId;
    }

    public int getMinFloorNo() {
        return minFloorNo;
    }

    public void setMinFloorNo(int minFloorNo) {
        this.minFloorNo = minFloorNo;
    }

    public int getMaxFloorNo() {
        return maxFloorNo;
    }

    public void setMaxFloorNo(int maxFloorNo) {
        this.maxFloorNo = maxFloorNo;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public int getSaleTypeId() {
        return saleTypeId;
    }

    public void setSaleTypeId(int saleTypeId) {
        this.saleTypeId = saleTypeId;
    }

    public int getFaceId() {
        return faceId;
    }

    public void setFaceId(int faceId) {
        this.faceId = faceId;
    }

    public int getFurnishId() {
        return furnishId;
    }

    public void setFurnishId(int furnishId) {
        this.furnishId = furnishId;
    }

    public int getPostedUserTypeId() {
        return postedUserTypeId;
    }

    public void setPostedUserTypeId(int postedUserTypeId) {
        this.postedUserTypeId = postedUserTypeId;
    }

    public int getTotalBathrooms() {
        return totalBathrooms;
    }

    public void setTotalBathrooms(int totalBathrooms) {
        this.totalBathrooms = totalBathrooms;
    }

    public int getPropertyAgeId() {
        return propertyAgeId;
    }

    public void setPropertyAgeId(int propertyAgeId) {
        this.propertyAgeId = propertyAgeId;
    }

    public Timestamp getPostedTs() {
        return postedTs;
    }

    public void setPostedTs(Timestamp postedTs) {
        this.postedTs = postedTs;
    }

    public String getLocalityIds() {
        return localityIds;
    }

    public void setLocalityIds(String localityIds) {
        this.localityIds = localityIds;
    }
}
