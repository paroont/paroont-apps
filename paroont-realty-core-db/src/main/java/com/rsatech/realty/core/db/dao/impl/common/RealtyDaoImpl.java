package com.rsatech.realty.core.db.dao.impl.common;

import com.rsatech.core.db.dao.impl.common.CoreDaoImpl;
import com.rsatech.realty.core.db.constant.common.RealtyDbConst;
import com.rsatech.realty.core.db.dao.dao.common.RealtyDao;
import com.rsatech.realty.core.db.dao.entity.common.RealtyAuditDo;
import com.rsatech.realty.core.db.dao.entity.common.RealtyDo;
import com.rsatech.realty.core.shared.dto.common.RealtyActionDto;
import com.rsatech.realty.core.shared.filter.common.RealtyFilter;


public abstract class RealtyDaoImpl<D extends RealtyDo, ID, F extends RealtyFilter, AD extends RealtyAuditDo, AN extends RealtyActionDto>
        extends CoreDaoImpl<D, ID, F, AD, AN> implements RealtyDao<D, ID, F, AD, AN>, RealtyDbConst {


}