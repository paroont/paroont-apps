package com.rsatech.core.db.service.impl.rdm;

import com.rsatech.core.db.dao.dao.rdm.AppRefDataDao;
import com.rsatech.core.db.service.impl.common.CoreDbServiceImpl;
import com.rsatech.core.db.service.rdm.AppRefDataDbService;
import com.rsatech.core.shared.dto.rdm.AppRefDataDto;
import com.rsatech.core.shared.enumeration.rdm.AppRefDataTypeEnum;
import com.rsatech.core.shared.filter.rdm.AppRefDataFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AppRefDataDbServiceImpl extends CoreDbServiceImpl implements AppRefDataDbService {
    private static final Logger logger = LoggerFactory.getLogger(AppRefDataDbServiceImpl.class);

    @Autowired
    private AppRefDataDao appRefDataDao;

    public List<AppRefDataDto> findAllRefData(AppRefDataFilter filter) {
        logger.info("Begin - findAllRefData.");
        List<AppRefDataDto> dtos = AppRefDataMapper.INSTANCE.toDtos(appRefDataDao.findAll(filter));
        logger.info("End - findAllRefData.");
        return dtos;
    }

    public AppRefDataDto findRefDataById(long id) {
        logger.info("Begin - findRefDataById. REF_DATA_ID:{}", id);
        AppRefDataDto dto = AppRefDataMapper.INSTANCE.toDto(appRefDataDao.findById(id));
        logger.info("End - findRefDataById. REF_DATA_ID:{}", id);
        return dto;
    }


    public List<AppRefDataDto> findRefDataByType(String type){
        logger.info("Begin - findRefDataByType. REF_DATA_TYPE:{}", type);
        List<AppRefDataDto> dtos = AppRefDataMapper.INSTANCE.toDtos(appRefDataDao.findByType(type));
        logger.info("End - findRefDataByType. REF_DATA_TYPE:{}", type);
        return dtos;
    }

    public AppRefDataDto findRefDataByTypeAndKey(String type, String key){
        logger.info("Begin - findRefDataByTypeAndKey. REF_DATA_TYPE:{}, REF_DATA_KEY:{}", type, key);
        AppRefDataDto dto = AppRefDataMapper.INSTANCE.toDto(appRefDataDao.findByTypeAndKey(type, key));
        logger.info("End - findRefDataByTypeAndKey. REF_DATA_TYPE:{}, REF_DATA_KEY:{}", type, key);
        return dto;
    }

    public Map<String, String> findAllKeyValueByType(String type) {
        logger.info("Begin - findAllKeyValueByType. REF_DATA_TYPE:{}", type);
        Map<String, String> keyValue = null;
        List<AppRefDataDto> dtos = findRefDataByType(type);
        keyValue =  AppRefDataMapUtil.buildKeyValueMap(dtos);
        logger.info("Begin - findAllKeyValueByType. REF_DATA_TYPE:{}", type);
        return keyValue;
    }

    public String findValueByTypeAndKey(String type, String key) {
        logger.info("Begin - findValueByTypeAndKey. REF_DATA_TYPE:{}, REF_DATA_KEY:{}", type, key);
        String value = "";
        AppRefDataDto dto = findRefDataByTypeAndKey(type, key);
        if(null != dto){
            value = dto.getValue();
        }
        logger.info("End - findValueByTypeAndKey. REF_DATA_TYPE:{}, REF_DATA_KEY:{}", type, key);
        return value;
    }


    public Map<String, String> findAllCommonStatus() {
        return findAllKeyValueByType(AppRefDataTypeEnum.COMMON_STATUS.getKey());
    }


    public String findCommonStatusValue(String key) {
        return findValueByTypeAndKey(AppRefDataTypeEnum.COMMON_STATUS.getKey(), key);
    }

    public Map<String, String> findAllContactType() {
        return findAllKeyValueByType(AppRefDataTypeEnum.CONTACT_TYPE.getKey());
    }


    public String findContactTypeValue(String key) {
        return findValueByTypeAndKey(AppRefDataTypeEnum.CONTACT_TYPE.getKey(), key);
    }

}
