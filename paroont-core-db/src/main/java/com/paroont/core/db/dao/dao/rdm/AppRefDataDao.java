package com.paroont.core.db.dao.dao.rdm;

import com.paroont.core.db.dao.dao.common.CoreDao;
import com.paroont.core.db.dao.entity.rdm.AppRefDataAuditDo;
import com.paroont.core.db.dao.entity.rdm.AppRefDataDo;
import com.paroont.core.shared.dto.rdm.AppRefDataActionDto;
import com.paroont.core.shared.filter.rdm.AppRefDataFilter;

import java.util.List;

public interface AppRefDataDao extends CoreDao<AppRefDataDo, Long, AppRefDataFilter, AppRefDataAuditDo, AppRefDataActionDto> {
    public List<AppRefDataDo> findByType(String type);

    public AppRefDataDo findByTypeAndKey(String type, String key);
}

