package com.rsatech.core.db.dao.common;

import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.entity.common.CoreDo;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import com.rsatech.core.shared.dto.common.CoreActionDto;
import com.rsatech.core.shared.filter.common.CoreFilter;

import java.util.List;

public interface CoreDao<D extends CoreDo, ID, F extends CoreFilter, AD extends CoreAuditDo, AN extends CoreActionDto>{

    List<D> findAll(F filter);

    D findById(ID id);

    D fetchById(ID id);

    public ID save(D data, AN action);

    void deleteById(ID id, AN action);
}
