package com.rsatech.core.db.dao.dao.rdm;

import com.rsatech.core.db.dao.dao.common.CoreDao;
import com.rsatech.core.db.dao.entity.rdm.AppRefDataAuditDo;
import com.rsatech.core.db.dao.entity.rdm.AppRefDataDo;
import com.rsatech.core.shared.dto.rdm.AppRefDataActionDto;
import com.rsatech.core.shared.filter.rdm.AppRefDataFilter;

import java.util.List;

public interface AppRefDataDao extends CoreDao<AppRefDataDo, Long, AppRefDataFilter, AppRefDataAuditDo, AppRefDataActionDto> {
    public List<AppRefDataDo> findByType(String type);

    public AppRefDataDo findByTypeAndKey(String type, String key);
}

