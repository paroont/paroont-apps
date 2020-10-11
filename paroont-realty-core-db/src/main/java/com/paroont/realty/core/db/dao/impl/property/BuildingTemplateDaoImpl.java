package com.paroont.realty.core.db.dao.impl.property;

import com.paroont.core.db.exception.common.RecordNotFoundException;
import com.paroont.realty.core.db.dao.impl.property.sql.template.BuildingTemplateRowMapper;
import com.paroont.realty.core.db.dao.impl.property.sql.template.BuildingTemplateSelectQueryBuilder;
import com.paroont.realty.core.db.dao.dao.property.BuildingTemplateDao;
import com.paroont.realty.core.db.dao.entity.property.template.BuildingTemplateAuditDo;
import com.paroont.realty.core.db.dao.entity.property.template.BuildingTemplateDo;
import com.paroont.realty.core.db.dao.impl.common.RealtyDaoImpl;
import com.paroont.realty.core.shared.dto.property.common.PropertyActionDto;
import com.paroont.realty.core.shared.filter.property.PropertyFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class BuildingTemplateDaoImpl extends RealtyDaoImpl<BuildingTemplateDo, Long, PropertyFilter, BuildingTemplateAuditDo, PropertyActionDto>
        implements BuildingTemplateDao {
    private static final Logger logger = LoggerFactory.getLogger(BuildingTemplateDaoImpl.class);

    @Override
    public List<BuildingTemplateDo> findAll(PropertyFilter filter) {
        logger.info("Begin - findAll.");
        BuildingTemplateSelectQueryBuilder queryBuilder = new BuildingTemplateSelectQueryBuilder();
        queryBuilder.setFilter(filter);
        String sql = queryBuilder.build();
        List<BuildingTemplateDo> datas = jdbcTemplateHelper.findAll(sql, queryBuilder.getQueryParams(), new BuildingTemplateRowMapper());
        logger.info("End - findAll.");
        return datas;
    }

    @Override
    public BuildingTemplateDo findById(Long id) {
        logger.info("Begin - findById. TEMPLATE_ID:{}", id);
        long templateId = Optional.ofNullable(id).orElse(-1L);
        PropertyFilter filter = new PropertyFilter();
        filter.setTemplateId(templateId);
        BuildingTemplateDo data = findAll(filter).stream().filter(Objects::nonNull).findFirst().orElse(null);
        logger.info("End - findById. TEMPLATE_ID:{}", id);
        return data;
    }

    @Override
    public BuildingTemplateDo fetchById(Long id) {
        logger.info("Begin - fetchById. TEMPLATE_ID:{}", id);
        BuildingTemplateDo data = findById(id);
        if (null == data) {
            throw new RecordNotFoundException("Building Template doesn't exist for TEMPLATE_ID:" + id);
        }
        logger.info("End - fetchById. TEMPLATE_ID:{}", id);
        return data;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Long save(BuildingTemplateDo data, PropertyActionDto action) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void deleteById(Long aLong, PropertyActionDto action) {
        throw new UnsupportedOperationException();
    }


}