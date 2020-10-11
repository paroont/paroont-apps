package com.rsatech.core.db.dao.impl.rdm;

import com.rsatech.core.db.dao.dao.rdm.AppRefDataDao;
import com.rsatech.core.db.dao.entity.rdm.AppRefDataAuditDo;
import com.rsatech.core.db.dao.entity.rdm.AppRefDataDo;
import com.rsatech.core.db.dao.impl.common.CoreDaoImpl;
import com.rsatech.core.db.dao.impl.rdm.sql.AppRefDataRowMapper;
import com.rsatech.core.db.dao.impl.rdm.sql.AppRefDataSelectQueryBuilder;
import com.rsatech.core.db.exception.common.RecordNotFoundException;
import com.rsatech.core.shared.dto.rdm.AppRefDataActionDto;
import com.rsatech.core.shared.filter.rdm.AppRefDataFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AppRefDataDaoImpl extends CoreDaoImpl<AppRefDataDo, Long, AppRefDataFilter, AppRefDataAuditDo, AppRefDataActionDto>
        implements AppRefDataDao {
    private static final Logger logger = LoggerFactory.getLogger(AppRefDataDaoImpl.class);

    @Override
    public List<AppRefDataDo> findAll(AppRefDataFilter filter) {
        logger.info("Begin - findAll.");
        AppRefDataSelectQueryBuilder queryBuilder = new AppRefDataSelectQueryBuilder();
        queryBuilder.setFilter(filter);
        String sql = queryBuilder.build();
        List<AppRefDataDo> datas = jdbcTemplateHelper.findAll(sql, queryBuilder.getQueryParams(), new AppRefDataRowMapper());
        logger.info("End - findAll.");
        return datas;
    }

    @Override
    public AppRefDataDo findById(Long id) {
        logger.info("Begin - findById. REF_DATA_ID:{}", id);
        long dataId = Optional.ofNullable(id).orElse(0L);
        AppRefDataFilter filter = new AppRefDataFilter();
        filter.setDataId(dataId);
        AppRefDataDo data = findAll(filter).stream().filter(Objects::nonNull).findFirst().orElse(null);
        logger.info("End - findById. REF_DATA_ID:{}", id);
        return data;
    }

    @Override
    public AppRefDataDo fetchById(Long id) {
        logger.info("Begin - fetchById. REF_DATA_ID:{}", id);
        AppRefDataDo data = findById(id);
        if (null == data) {
            throw new RecordNotFoundException("Ref data doesn't exist.");
        }
        logger.info("End - fetchById. REF_DATA_ID:{}", id);
        return data;
    }

    public  List<AppRefDataDo> findByType(String type) {
        logger.info("Begin - findByType. REF_DATA_TYPE:{}", type);
        AppRefDataFilter filter = new AppRefDataFilter();
        filter.setType(type);
        List<AppRefDataDo> datas  = findAll(filter);
        logger.info("End - findByType. REF_DATA_TYPE:{}", type);
        return datas;
    }
    public  AppRefDataDo findByTypeAndKey(String type, String key) {
        logger.info("Begin - findByTypeAndKey. REF_DATA_TYPE:{}, REF_DATA_KEY:{}", type, key);
        AppRefDataDo data = null;
        AppRefDataFilter filter = new AppRefDataFilter();
        filter.setType(type);
        filter.setKey(key);
        List<AppRefDataDo> datas  = findAll(filter);
        if(!datas.isEmpty()){
            data = datas.get(0);
        }
        logger.info("End - findByTypeAndKey. REF_DATA_TYPE:{}, REF_DATA_KEY:{}", type, key);
        return data;
    }

    @Override
    public Long save(AppRefDataDo data, AppRefDataActionDto action) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void deleteById(Long aLong, AppRefDataActionDto action) {
        throw  new UnsupportedOperationException();
    }
}