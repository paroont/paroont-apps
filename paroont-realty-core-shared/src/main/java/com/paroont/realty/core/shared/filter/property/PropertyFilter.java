package com.paroont.realty.core.shared.filter.property;

import com.paroont.realty.core.shared.filter.common.RealtyBaseFilter;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PropertyFilter extends RealtyBaseFilter {

    protected long templateId = -99;

    protected long propertyId = -99;
    protected List<Integer> propertyTypeIds = new ArrayList<>();

    protected long transactionTypeId = -99;

    protected String searchQuery;

    protected double minBudget = -99;
    protected double maxBudget = -99;
    protected List<Integer> configurationIds = new ArrayList<>();
    protected List<Integer> availabilityIds = new ArrayList<>();
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
    protected List<Integer> saleTypeIds = new ArrayList<>();

    protected List<Integer> faceIds = new ArrayList<>();
    protected List<Integer> furnishIds = new ArrayList<>();
    protected List<Integer> postedUserTypeIds = new ArrayList<>();
    protected List<Integer> noOfBathrooms = new ArrayList<>();

    protected List<Integer> propertyAgeIds = new ArrayList<>();

    protected List<Integer> tenantTypeIds = new ArrayList<>();

    protected Timestamp postedTs;
    protected List<String> localityIds = new ArrayList<>();

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

    public List<Integer> getPropertyTypeIds() {
        return propertyTypeIds;
    }

    public void setPropertyTypeIds(List<Integer> propertyTypeIds) {
        this.propertyTypeIds = propertyTypeIds;
    }

    public long getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(long transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
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

    public List<Integer> getConfigurationIds() {
        return configurationIds;
    }

    public void setConfigurationIds(List<Integer> configurationIds) {
        this.configurationIds = configurationIds;
    }

    public List<Integer> getAvailabilityIds() {
        return availabilityIds;
    }

    public void setAvailabilityIds(List<Integer> availabilityIds) {
        this.availabilityIds = availabilityIds;
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

    public List<Integer> getSaleTypeIds() {
        return saleTypeIds;
    }

    public void setSaleTypeIds(List<Integer> saleTypeIds) {
        this.saleTypeIds = saleTypeIds;
    }

    public List<Integer> getFaceIds() {
        return faceIds;
    }

    public void setFaceIds(List<Integer> faceIds) {
        this.faceIds = faceIds;
    }

    public List<Integer> getFurnishIds() {
        return furnishIds;
    }

    public void setFurnishIds(List<Integer> furnishIds) {
        this.furnishIds = furnishIds;
    }

    public List<Integer> getPostedUserTypeIds() {
        return postedUserTypeIds;
    }

    public void setPostedUserTypeIds(List<Integer> postedUserTypeIds) {
        this.postedUserTypeIds = postedUserTypeIds;
    }

    public List<Integer> getNoOfBathrooms() {
        return noOfBathrooms;
    }

    public void setNoOfBathrooms(List<Integer> noOfBathrooms) {
        this.noOfBathrooms = noOfBathrooms;
    }

    public List<Integer> getPropertyAgeIds() {
        return propertyAgeIds;
    }

    public void setPropertyAgeIds(List<Integer> propertyAgeIds) {
        this.propertyAgeIds = propertyAgeIds;
    }

    public List<Integer> getTenantTypeIds() {
        return tenantTypeIds;
    }

    public void setTenantTypeIds(List<Integer> tenantTypeIds) {
        this.tenantTypeIds = tenantTypeIds;
    }

    public Timestamp getPostedTs() {
        return postedTs;
    }

    public void setPostedTs(Timestamp postedTs) {
        this.postedTs = postedTs;
    }

    public List<String> getLocalityIds() {
        return localityIds;
    }

    public void setLocalityIds(List<String> localityIds) {
        this.localityIds = localityIds;
    }
}
