package com.rsatech.realty.core.db.dao.dao.common;

import com.rsatech.core.db.dao.dao.common.CoreDao;
import com.rsatech.realty.core.db.dao.entity.common.RealtyAuditDo;
import com.rsatech.realty.core.db.dao.entity.common.RealtyDo;
import com.rsatech.realty.core.shared.dto.common.RealtyActionDto;
import com.rsatech.realty.core.shared.filter.common.RealtyFilter;


public interface RealtyDao<D extends RealtyDo, ID, F extends RealtyFilter, AD extends RealtyAuditDo, AN extends RealtyActionDto> extends CoreDao<D, ID, F, AD, AN> {

}
