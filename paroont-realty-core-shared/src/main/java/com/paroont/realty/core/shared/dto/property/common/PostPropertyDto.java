package com.paroont.realty.core.shared.dto.property.common;

import java.sql.Timestamp;

public class PostPropertyDto extends PropertyBaseDto {


    protected long propertyId;
    protected int transactionTypeId;
    protected String transactionTypeTitle;

    protected int configurationId;
    protected String configurationTitle;

    protected int totalBedrooms = -1;
    protected int totalMasterBedrooms = -1;
    protected int totalBathrooms = -1;
    protected int totalBalconies = -1;

    protected float superBuiltUpArea = -1;
    protected int superBuiltUpAreaUnitId = -1;
    protected String superBuiltUpAreaUnitTitle;

    protected float builtUpArea = -1;
    protected int builtUpAreaUnitId = -1;
    protected String builtUpAreaUnitTitle;

    protected float carpetArea = -1;
    protected int carpetAreaUnitId = -1;
    protected String carpetAreaUnitTitle;

    protected int furnishId = -1;
    protected String furnishTitle;

    protected int floorId = -1;
    protected String floorNo;

    protected int totalCoveredParking = -1;
    protected int totalOpenParking = -1;


    protected int faceId = -1;
    protected String faceTitle;

    protected String overlookIds;
    protected String overlookTitles;


    protected String floorTypeIds;
    protected String floorTypeTitles;


    protected int amountNegotiable = -1;
    protected float maintenanceAmount = -1;
    protected int maintenancePeriodId = -1;
    protected String maintenancePeriodTitle;

    protected int modularKitchen = -1;

    protected int poojaRoom = -1;
    protected int studyRoom = -1;
    protected int servantRoom = -1;
    protected int othersRoom = -1;

    protected String notes;

    protected int totalBrokers = -1;

    protected String weekdaysVisitingIds;
    protected String weekdaysVisitingTitles;

    protected String weekendVisitingIds;
    protected String weekendVisitingTitles;

    protected int heavyDeposit = -1;
    protected float expectedDepositAmount = -1;
    protected float expectedRentAmount = -1;

    protected double expectedAmount = -1;


    protected int allInclusiveAmount = -1;
    protected int taxAndGovChargeIncluded = -1;

    protected String postedBy;
    protected String postedByName;
    protected Timestamp postedTs;
    protected int postedUserTypeId;
    protected String postedUserTypeTitle;
    protected Timestamp dealTs;

    protected int tenantTypeId;
    protected String tenantTypeTitle;

    protected int saleTypeId;
    protected String saleTypeTitle;

    public long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(long propertyId) {
        this.propertyId = propertyId;
    }

    public int getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(int transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public String getTransactionTypeTitle() {
        return transactionTypeTitle;
    }

    public void setTransactionTypeTitle(String transactionTypeTitle) {
        this.transactionTypeTitle = transactionTypeTitle;
    }

    public int getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(int configurationId) {
        this.configurationId = configurationId;
    }

    public String getConfigurationTitle() {
        return configurationTitle;
    }

    public void setConfigurationTitle(String configurationTitle) {
        this.configurationTitle = configurationTitle;
    }

    public int getTotalBedrooms() {
        return totalBedrooms;
    }

    public void setTotalBedrooms(int totalBedrooms) {
        this.totalBedrooms = totalBedrooms;
    }

    public int getTotalMasterBedrooms() {
        return totalMasterBedrooms;
    }

    public void setTotalMasterBedrooms(int totalMasterBedrooms) {
        this.totalMasterBedrooms = totalMasterBedrooms;
    }

    public int getTotalBathrooms() {
        return totalBathrooms;
    }

    public void setTotalBathrooms(int totalBathrooms) {
        this.totalBathrooms = totalBathrooms;
    }

    public int getTotalBalconies() {
        return totalBalconies;
    }

    public void setTotalBalconies(int totalBalconies) {
        this.totalBalconies = totalBalconies;
    }

    public float getSuperBuiltUpArea() {
        return superBuiltUpArea;
    }

    public void setSuperBuiltUpArea(float superBuiltUpArea) {
        this.superBuiltUpArea = superBuiltUpArea;
    }


    public float getBuiltUpArea() {
        return builtUpArea;
    }

    public void setBuiltUpArea(float builtUpArea) {
        this.builtUpArea = builtUpArea;
    }


    public float getCarpetArea() {
        return carpetArea;
    }

    public void setCarpetArea(float carpetArea) {
        this.carpetArea = carpetArea;
    }


    public int getFurnishId() {
        return furnishId;
    }

    public void setFurnishId(int furnishId) {
        this.furnishId = furnishId;
    }

    public String getFurnishTitle() {
        return furnishTitle;
    }

    public void setFurnishTitle(String furnishTitle) {
        this.furnishTitle = furnishTitle;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    public int getTotalCoveredParking() {
        return totalCoveredParking;
    }

    public void setTotalCoveredParking(int totalCoveredParking) {
        this.totalCoveredParking = totalCoveredParking;
    }

    public int getTotalOpenParking() {
        return totalOpenParking;
    }

    public void setTotalOpenParking(int totalOpenParking) {
        this.totalOpenParking = totalOpenParking;
    }

    public int getFaceId() {
        return faceId;
    }

    public void setFaceId(int faceId) {
        this.faceId = faceId;
    }

    public String getFaceTitle() {
        return faceTitle;
    }

    public void setFaceTitle(String faceTitle) {
        this.faceTitle = faceTitle;
    }

    public String getOverlookIds() {
        return overlookIds;
    }

    public void setOverlookIds(String overlookIds) {
        this.overlookIds = overlookIds;
    }

    public String getOverlookTitles() {
        return overlookTitles;
    }

    public void setOverlookTitles(String overlookTitles) {
        this.overlookTitles = overlookTitles;
    }


    public int getAmountNegotiable() {
        return amountNegotiable;
    }

    public void setAmountNegotiable(int amountNegotiable) {
        this.amountNegotiable = amountNegotiable;
    }

    public float getMaintenanceAmount() {
        return maintenanceAmount;
    }

    public void setMaintenanceAmount(float maintenanceAmount) {
        this.maintenanceAmount = maintenanceAmount;
    }

    public int getModularKitchen() {
        return modularKitchen;
    }

    public void setModularKitchen(int modularKitchen) {
        this.modularKitchen = modularKitchen;
    }

    public int getPoojaRoom() {
        return poojaRoom;
    }

    public void setPoojaRoom(int poojaRoom) {
        this.poojaRoom = poojaRoom;
    }

    public int getStudyRoom() {
        return studyRoom;
    }

    public void setStudyRoom(int studyRoom) {
        this.studyRoom = studyRoom;
    }

    public int getServantRoom() {
        return servantRoom;
    }

    public void setServantRoom(int servantRoom) {
        this.servantRoom = servantRoom;
    }

    public int getOthersRoom() {
        return othersRoom;
    }

    public void setOthersRoom(int othersRoom) {
        this.othersRoom = othersRoom;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getTotalBrokers() {
        return totalBrokers;
    }

    public void setTotalBrokers(int totalBrokers) {
        this.totalBrokers = totalBrokers;
    }

    public String getWeekdaysVisitingIds() {
        return weekdaysVisitingIds;
    }

    public void setWeekdaysVisitingIds(String weekdaysVisitingIds) {
        this.weekdaysVisitingIds = weekdaysVisitingIds;
    }

    public String getWeekdaysVisitingTitles() {
        return weekdaysVisitingTitles;
    }

    public void setWeekdaysVisitingTitles(String weekdaysVisitingTitles) {
        this.weekdaysVisitingTitles = weekdaysVisitingTitles;
    }

    public String getWeekendVisitingIds() {
        return weekendVisitingIds;
    }

    public void setWeekendVisitingIds(String weekendVisitingIds) {
        this.weekendVisitingIds = weekendVisitingIds;
    }

    public String getWeekendVisitingTitles() {
        return weekendVisitingTitles;
    }

    public void setWeekendVisitingTitles(String weekendVisitingTitles) {
        this.weekendVisitingTitles = weekendVisitingTitles;
    }

    public int getSuperBuiltUpAreaUnitId() {
        return superBuiltUpAreaUnitId;
    }

    public void setSuperBuiltUpAreaUnitId(int superBuiltUpAreaUnitId) {
        this.superBuiltUpAreaUnitId = superBuiltUpAreaUnitId;
    }

    public String getSuperBuiltUpAreaUnitTitle() {
        return superBuiltUpAreaUnitTitle;
    }

    public void setSuperBuiltUpAreaUnitTitle(String superBuiltUpAreaUnitTitle) {
        this.superBuiltUpAreaUnitTitle = superBuiltUpAreaUnitTitle;
    }

    public int getBuiltUpAreaUnitId() {
        return builtUpAreaUnitId;
    }

    public void setBuiltUpAreaUnitId(int builtUpAreaUnitId) {
        this.builtUpAreaUnitId = builtUpAreaUnitId;
    }

    public String getBuiltUpAreaUnitTitle() {
        return builtUpAreaUnitTitle;
    }

    public void setBuiltUpAreaUnitTitle(String builtUpAreaUnitTitle) {
        this.builtUpAreaUnitTitle = builtUpAreaUnitTitle;
    }

    public int getCarpetAreaUnitId() {
        return carpetAreaUnitId;
    }

    public void setCarpetAreaUnitId(int carpetAreaUnitId) {
        this.carpetAreaUnitId = carpetAreaUnitId;
    }

    public String getCarpetAreaUnitTitle() {
        return carpetAreaUnitTitle;
    }

    public void setCarpetAreaUnitTitle(String carpetAreaUnitTitle) {
        this.carpetAreaUnitTitle = carpetAreaUnitTitle;
    }

    public String getFloorTypeIds() {
        return floorTypeIds;
    }

    public void setFloorTypeIds(String floorTypeIds) {
        this.floorTypeIds = floorTypeIds;
    }

    public String getFloorTypeTitles() {
        return floorTypeTitles;
    }

    public void setFloorTypeTitles(String floorTypeTitles) {
        this.floorTypeTitles = floorTypeTitles;
    }

    public int getMaintenancePeriodId() {
        return maintenancePeriodId;
    }

    public void setMaintenancePeriodId(int maintenancePeriodId) {
        this.maintenancePeriodId = maintenancePeriodId;
    }

    public String getMaintenancePeriodTitle() {
        return maintenancePeriodTitle;
    }

    public void setMaintenancePeriodTitle(String maintenancePeriodTitle) {
        this.maintenancePeriodTitle = maintenancePeriodTitle;
    }

    public int getHeavyDeposit() {
        return heavyDeposit;
    }

    public void setHeavyDeposit(int heavyDeposit) {
        this.heavyDeposit = heavyDeposit;
    }

    public float getExpectedDepositAmount() {
        return expectedDepositAmount;
    }

    public void setExpectedDepositAmount(float expectedDepositAmount) {
        this.expectedDepositAmount = expectedDepositAmount;
    }

    public float getExpectedRentAmount() {
        return expectedRentAmount;
    }

    public void setExpectedRentAmount(float expectedRentAmount) {
        this.expectedRentAmount = expectedRentAmount;
    }

    public double getExpectedAmount() {
        return expectedAmount;
    }

    public void setExpectedAmount(double expectedAmount) {
        this.expectedAmount = expectedAmount;
    }

    public int getAllInclusiveAmount() {
        return allInclusiveAmount;
    }

    public void setAllInclusiveAmount(int allInclusiveAmount) {
        this.allInclusiveAmount = allInclusiveAmount;
    }

    public int getTaxAndGovChargeIncluded() {
        return taxAndGovChargeIncluded;
    }

    public void setTaxAndGovChargeIncluded(int taxAndGovChargeIncluded) {
        this.taxAndGovChargeIncluded = taxAndGovChargeIncluded;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public String getPostedByName() {
        return postedByName;
    }

    public void setPostedByName(String postedByName) {
        this.postedByName = postedByName;
    }

    public Timestamp getPostedTs() {
        return postedTs;
    }

    public void setPostedTs(Timestamp postedTs) {
        this.postedTs = postedTs;
    }

    public int getPostedUserTypeId() {
        return postedUserTypeId;
    }

    public void setPostedUserTypeId(int postedUserTypeId) {
        this.postedUserTypeId = postedUserTypeId;
    }

    public String getPostedUserTypeTitle() {
        return postedUserTypeTitle;
    }

    public void setPostedUserTypeTitle(String postedUserTypeTitle) {
        this.postedUserTypeTitle = postedUserTypeTitle;
    }

    public Timestamp getDealTs() {
        return dealTs;
    }

    public void setDealTs(Timestamp dealTs) {
        this.dealTs = dealTs;
    }

    public int getTenantTypeId() {
        return tenantTypeId;
    }

    public void setTenantTypeId(int tenantTypeId) {
        this.tenantTypeId = tenantTypeId;
    }

    public String getTenantTypeTitle() {
        return tenantTypeTitle;
    }

    public void setTenantTypeTitle(String tenantTypeTitle) {
        this.tenantTypeTitle = tenantTypeTitle;
    }

    public int getSaleTypeId() {
        return saleTypeId;
    }

    public void setSaleTypeId(int saleTypeId) {
        this.saleTypeId = saleTypeId;
    }

    public String getSaleTypeTitle() {
        return saleTypeTitle;
    }

    public void setSaleTypeTitle(String saleTypeTitle) {
        this.saleTypeTitle = saleTypeTitle;
    }
}
