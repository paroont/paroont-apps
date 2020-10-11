package com.paroont.core.shared.facade.rdm;

import com.paroont.core.shared.constant.common.CoreConst;
import com.paroont.core.shared.filter.rdm.AppRefDataFilter;
import com.paroont.core.shared.service.rdm.AppRefDataService;
import com.paroont.core.shared.dto.common.CoreResponse;
import com.paroont.core.shared.dto.rdm.AppRefDataDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AppRefDataFacade implements CoreConst {

    private static final Logger logger = LoggerFactory.getLogger(AppRefDataFacade.class);

    @Autowired
    private AppRefDataService appRefDataService;

    public CoreResponse findAllAppRefData() {
        return findAllAppRefData(new AppRefDataFilter());
    }


    public CoreResponse findAllAppRefDataByAppName(String appName) {
        return findAllAppRefData(appName, null, null);
    }

    public CoreResponse findAllAppRefDataByModuleName(String moduleName) {
        return findAllAppRefData(null, moduleName, null);
    }


    public CoreResponse findAllAppRefDataByAppAndModuleName(String appName, String moduleName) {
        return findAllAppRefData(appName, moduleName, null);
    }

    public CoreResponse findAllAppRefDataByType(String type) {
        return findAllAppRefData(null, null, type);
    }

    public CoreResponse findAllAppRefData(String appName, String moduleName, String type) {
        AppRefDataFilter filter = new AppRefDataFilter();
        filter.setAppName(appName);
        filter.setModuleName(moduleName);
        filter.setType(type);
        return findAllAppRefData(filter);
    }


    public CoreResponse findAllAppRefData(AppRefDataFilter filter) {
        logger.info("Begin - findAllAppRefData.");
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            List<AppRefDataDto> dtos = appRefDataService.findAllRefData(filter);
            response.addData(dtos);
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while searching app ref data.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - findAllAppRefData.");
        return response;
    }

}
