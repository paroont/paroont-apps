package com.paroont.core.db.dao.dao.common;

import com.paroont.core.db.dao.entity.common.CoreAuditDo;
import com.paroont.core.db.dao.entity.common.CoreDo;
import com.paroont.core.shared.dto.common.CoreActionDto;
import com.paroont.core.shared.filter.common.CoreFilter;

import java.util.List;

public interface CoreDao<D extends CoreDo, ID, F extends CoreFilter, AD extends CoreAuditDo, AN extends CoreActionDto>{

    List<D> findAll(F filter);

    D findById(ID id);

    D fetchById(ID id);

    public ID save(D data, AN action);

    void deleteById(ID id, AN action);
}
