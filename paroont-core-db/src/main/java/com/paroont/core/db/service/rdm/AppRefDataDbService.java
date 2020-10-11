package com.paroont.core.db.service.rdm;

import com.paroont.core.db.service.common.CoreDbService;
import com.paroont.core.shared.dto.rdm.AppRefDataDto;
import com.paroont.core.shared.filter.rdm.AppRefDataFilter;

import java.util.List;
import java.util.Map;

public interface AppRefDataDbService extends CoreDbService {
    public List<AppRefDataDto> findAllRefData(AppRefDataFilter filter);

    public AppRefDataDto findRefDataById(long id);

    public List<AppRefDataDto> findRefDataByType(String type);

    public AppRefDataDto findRefDataByTypeAndKey(String type, String key);


    public Map<String, String> findAllKeyValueByType(String type);

    public String findValueByTypeAndKey(String type, String key);


    public Map<String, String> findAllCommonStatus();

    public String findCommonStatusValue(String key);

    public Map<String, String> findAllContactType();

    public String findContactTypeValue(String key);
}
