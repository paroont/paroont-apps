


-- ============================   POST_PROPERTY ===========================

CREATE TABLE POST_PROPERTY (
  PROPERTY_ID BIGINT NOT NULL AUTO_INCREMENT,
  TEMPLATE_ID BIGINT DEFAULT NULL,
  PROJECT_NAME VARCHAR(255) DEFAULT NULL,
  PROPERTY_TYPE_ID INT NOT NULL,
  PROPERTY_TYPE_TITLE VARCHAR(255) DEFAULT NULL,
  PROPERTY_TYPE_GROUP_ID INT NOT NULL,
  PROPERTY_TYPE_GROUP_TITLE VARCHAR(255) DEFAULT NULL,
  BUILDING_NAME VARCHAR(255) NOT NULL,
  BUILDER_NAME VARCHAR(255) DEFAULT NULL,
  BUILDER_WEB_URL VARCHAR(255) DEFAULT NULL,
  TRANSACTION_TYPE_ID INT NOT NULL,
  TRANSACTION_TYPE_TITLE VARCHAR(255) DEFAULT NULL,
  TENANT_TYPE_ID INT NOT NULL DEFAULT -1,
  TENANT_TYPE_TITLE VARCHAR(255) DEFAULT NULL,
  SALE_TYPE_ID INT NOT NULL DEFAULT -1,
  SALE_TYPE_TITLE VARCHAR(255) DEFAULT NULL,
  CONFIGURATION_ID INT NOT NULL,
  CONFIGURATION_TITLE VARCHAR(255) DEFAULT NULL,
  ADDRESS_LINE_1 VARCHAR(255) DEFAULT NULL,
  ADDRESS_LINE_2 VARCHAR(255) DEFAULT NULL,
  LOCALITY_IDS VARCHAR(255) DEFAULT NULL,
  LOCALITY_TITLES VARCHAR(255) DEFAULT NULL,
  CITY_NAME VARCHAR(255) DEFAULT NULL,
  AREA_NAME VARCHAR(255) DEFAULT NULL,
  STATE_NAME VARCHAR(255) DEFAULT NULL,
  LANDMARK_NAME VARCHAR(255) DEFAULT NULL,
  PIN_CODE VARCHAR(255) DEFAULT NULL,
  COUNTRY_NAME VARCHAR(255) DEFAULT NULL,
  AVAILABILITY_ID INT NOT NULL,
  AVAILABILITY_TITLE VARCHAR(255) DEFAULT NULL,
  AVAILABILITY_TS TIMESTAMP NULL DEFAULT NULL,
  PROPERTY_AGE_ID INT NOT NULL DEFAULT -1,
  PROPERTY_AGE_TITLE VARCHAR(255) DEFAULT NULL,
  PROPERTY_DESCRIPTION VARCHAR(2000) DEFAULT NULL,
  TOTAL_BEDROOMS INT NOT NULL DEFAULT -1,
  TOTAL_MASTER_BEDROOMS INT NOT NULL DEFAULT -1,
  TOTAL_BATHROOMS INT NOT NULL DEFAULT -1,
  TOTAL_BALCONIES INT NOT NULL DEFAULT -1,
  SUPER_BUILT_UP_AREA FLOAT NOT NULL DEFAULT -1,
  SUPER_BUILT_UP_AREA_UNIT_ID INT NOT NULL DEFAULT -1,
  SUPER_BUILT_UP_AREA_UNIT_TITLE VARCHAR(255) DEFAULT NULL,
  BUILT_UP_AREA FLOAT NOT NULL DEFAULT -1,
  BUILT_UP_AREA_UNIT_ID INT NOT NULL DEFAULT -1,
  BUILT_UP_AREA_UNIT_TITLE VARCHAR(255) DEFAULT NULL,
  CARPET_AREA FLOAT NOT NULL DEFAULT -1,
  CARPET_AREA_UNIT_ID INT NOT NULL DEFAULT -1,
  CARPET_AREA_UNIT_TITLE VARCHAR(255) DEFAULT NULL,
  FURNISH_TYPE_ID INT NOT NULL DEFAULT -1,
  FURNISH_TYPE_TITLE VARCHAR(255) DEFAULT NULL,
  FLOOR_ID INT NOT NULL DEFAULT -1,
  FLOOR_NO VARCHAR(255) DEFAULT NULL,
  TOTAL_FLOORS INT NOT NULL DEFAULT -1,
  TOTAL_FLATS_FLOOR INT NOT NULL DEFAULT -1,
  TOTAL_COVERED_PARKING INT NOT NULL DEFAULT -1,
  TOTAL_OPEN_PARKING INT NOT NULL DEFAULT -1,
  TOTAL_BUILDING_COVERED_PARKING INT NOT NULL DEFAULT -1,
  TOTAL_BUILDING_OPEN_PARKING INT NOT NULL DEFAULT -1,
  TOTAL_BUILDING_VISITOR_PARKING INT NOT NULL DEFAULT -1,
  FACE_ID INT NOT NULL DEFAULT -1,
  FACE_TITLE VARCHAR(255) DEFAULT NULL,
  OVERLOOK_IDS VARCHAR(255) DEFAULT NULL,
  OVERLOOK_TITLES VARCHAR(255) DEFAULT NULL,
  FLOOR_TYPE_IDS VARCHAR(255) DEFAULT NULL,
  FLOOR_TYPE_TITLES VARCHAR(255) DEFAULT NULL,
  MODULAR_KITCHEN INT NOT NULL DEFAULT -1,
  POOJA_ROOM INT NOT NULL DEFAULT -1,
  STUDY_ROOM INT NOT NULL DEFAULT -1,
  SERVANT_ROOM INT NOT NULL DEFAULT -1,
  OTHERS_ROOM INT NOT NULL DEFAULT -1,
  AMOUNT_NEGOTIABLE INT NOT NULL DEFAULT -1,
  MAINTENANCE_AMOUNT FLOAT NOT NULL DEFAULT -1,
  MAINTENANCE_PERIOD_ID INT NOT NULL DEFAULT -1,
  MAINTENANCE_PERIOD_TITLE VARCHAR(255) DEFAULT NULL,
  HEAVY_DEPOSIT INT NOT NULL DEFAULT -1,
  EXPECTED_DEPOSIT_AMOUNT FLOAT NOT NULL DEFAULT -1,
  EXPECTED_RENTAL_AMOUNT FLOAT NOT NULL DEFAULT -1,
  EXPECTED_AMOUNT DOUBLE NOT NULL DEFAULT -1,
  ALL_INCLUSIVE_PRICE FLOAT NOT NULL DEFAULT -1,
  TAX_AND_GOV_CHARGE_INCLUDED FLOAT NOT NULL DEFAULT -1,
  NOTES VARCHAR(2000) DEFAULT NULL,
  TOTAL_BROKER INT NOT NULL DEFAULT -1,
  WEEKDAYS_VISIT_TIME_IDS VARCHAR(255) DEFAULT NULL,
  WEEKDAYS_VISIT_TIME_TITLES VARCHAR(255) DEFAULT NULL,
  WEEKEND_VISIT_TIME_IDS VARCHAR(255) DEFAULT NULL,
  WEEKEND_VISIT_TIME_TITLES VARCHAR(255) DEFAULT NULL,
  EARTHQUAKE_RESISTANT INT NOT NULL DEFAULT -1,
  GAS_PIPELINE INT NOT NULL DEFAULT -1,
  CLUB_HOUSE INT NOT NULL DEFAULT -1,
  GYM INT NOT NULL DEFAULT -1,
  KIDS_PLAY_AREA INT NOT NULL DEFAULT -1,
  WATER_HARVESTING INT NOT NULL DEFAULT -1,
  SWIMMING_POOL INT NOT NULL DEFAULT -1,
  COMMON_AREA_POWER_BACKUP INT NOT NULL DEFAULT -1,
  FLAT_POWER_BACKUP INT NOT NULL DEFAULT -1,
  SENIOR_CITIZEN_AREA INT NOT NULL DEFAULT -1,
  GATED_SOCIETY INT NOT NULL DEFAULT -1,
  WATER_SUPPLY INT NOT NULL DEFAULT -1,
  LANDSCAPE_LAWN INT NOT NULL DEFAULT -1,
  BANQUET_HALL INT NOT NULL DEFAULT -1,
  JOGGERS_TRACK INT NOT NULL DEFAULT -1,
  CCTV INT NOT NULL DEFAULT -1,
  FIRE_ALARM INT NOT NULL DEFAULT -1,
  PET_FRIENDLY INT NOT NULL DEFAULT -1,
  TOTAL_SERVICE_LIFT INT NOT NULL DEFAULT -1,
  TOTAL_LIFT INT NOT NULL DEFAULT -1,
  OC_TS TIMESTAMP NULL DEFAULT NULL,
  RERA_ID VARCHAR(255) DEFAULT NULL,
  STATUS_ID INT NOT NULL DEFAULT 1,
  STATUS_TITLE VARCHAR(255) DEFAULT NULL,
  CREATED_BY VARCHAR(255) NOT NULL,
  CREATED_TS TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  UPDATED_BY VARCHAR(255) NOT NULL,
  POSTED_BY VARCHAR(255) DEFAULT NULL,
  POSTED_TS TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  POSTED_USER_TYPE_ID INT NOT NULL DEFAULT 2,
  POSTED_USER_TYPE_TITLE VARCHAR(255) DEFAULT NULL,
  UPDATED_TS TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  DEAL_TS TIMESTAMP NULL DEFAULT NULL,
  CONSTRAINT POST_PROPERTY_PK_PROPERTY_ID PRIMARY KEY(PROPERTY_ID)
);