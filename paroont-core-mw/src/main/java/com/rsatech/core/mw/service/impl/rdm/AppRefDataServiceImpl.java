package com.rsatech.core.mw.service.impl.rdm;

import com.rsatech.core.db.service.rdm.AppRefDataDbService;
import com.rsatech.core.mw.service.impl.common.CoreServiceImpl;
import com.rsatech.core.shared.dto.rdm.AppRefDataDto;
import com.rsatech.core.shared.filter.rdm.AppRefDataFilter;
import com.rsatech.core.shared.service.rdm.AppRefDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AppRefDataServiceImpl extends CoreServiceImpl implements AppRefDataService {
    @Autowired
    private AppRefDataDbService appRefDataDbService;

    @Override
    public List<AppRefDataDto> findAllRefData(AppRefDataFilter filter) {
        return appRefDataDbService.findAllRefData(filter);
    }

    @Override
    public AppRefDataDto findRefDataById(long id) {
        return appRefDataDbService.findRefDataById(id);
    }

    @Override
    public List<AppRefDataDto> findRefDataByType(String type) {
        return appRefDataDbService.findRefDataByType(type);
    }

    @Override
    public AppRefDataDto findRefDataByTypeAndKey(String type, String key) {
        return appRefDataDbService.findRefDataByTypeAndKey(type,key);
    }

    public Map<String, String> findAllKeyValueByType(String type){
        return appRefDataDbService.findAllKeyValueByType(type);
    }

    public String findValueByTypeAndKey(String type, String key){
        return appRefDataDbService.findValueByTypeAndKey(type,key);
    }


    public Map<String, String> findAllCommonStatus(){
        return appRefDataDbService.findAllCommonStatus();
    }

    public String findCommonStatusValue(String key){
        return appRefDataDbService.findCommonStatusValue(key);
    }

    public Map<String, String> findAllContactType(){
        return appRefDataDbService.findAllContactType();
    }

    public String findContactTypeValue(String key){
        return appRefDataDbService.findContactTypeValue(key);
    }

}
