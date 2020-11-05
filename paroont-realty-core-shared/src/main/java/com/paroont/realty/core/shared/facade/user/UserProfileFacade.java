package com.paroont.realty.core.shared.facade.user;

import com.paroont.core.shared.dto.common.CorePaginationDto;
import com.paroont.core.shared.dto.common.CoreResponse;
import com.paroont.realty.core.shared.constant.common.RealtyConst;
import com.paroont.realty.core.shared.constant.common.RealtyResponseConst;
import com.paroont.realty.core.shared.dto.property.common.PostPropertyDto;
import com.paroont.realty.core.shared.dto.property.common.PropertyActionDto;
import com.paroont.realty.core.shared.dto.user.UserActionDto;
import com.paroont.realty.core.shared.dto.user.UserProfileDto;
import com.paroont.realty.core.shared.filter.property.PropertyFilter;
import com.paroont.realty.core.shared.filter.user.UserProfileFilter;
import com.paroont.realty.core.shared.service.property.PropertyService;
import com.paroont.realty.core.shared.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UserProfileFacade implements RealtyConst {

    private static final Logger logger = LoggerFactory.getLogger(UserProfileFacade.class);

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private UserService userService;

    public CoreResponse findAllUserProfiles() {
        return findAllUserProfiles(new UserProfileFilter());
    }

    public CoreResponse findAllUserProfiles(UserProfileFilter filter) {
        logger.info("Begin - findAllUserProfiles.");
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            CorePaginationDto<UserProfileDto> paginationDto = new CorePaginationDto<>();
            paginationDto.setData(userService.findAllUserProfiles(filter));
            paginationDto.setTotalRecords(paginationDto.getData().size());
            response.updateTotalRecords(paginationDto.getTotalRecords());
            response.addData(paginationDto.getData());
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while searching user profiles.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - findAllUserProfiles.");
        return response;
    }

    public CoreResponse saveUserProfile(UserProfileDto dto, UserActionDto  actionDto) {
        logger.info("Begin - saveUserProfile.");
        CoreResponse response = new CoreResponse();
        List<UserProfileDto> data = new ArrayList<>();
        String msg = "";
        long id = 0;
        try {
            id = userService.saveUserProfile(dto, actionDto);
            UserProfileDto savedDto = userService.findUserProfileById(id);
            data.add(savedDto);
            response.addData(data);
            msg = "Profile saved.";
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while saving profile.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - saveUserProfile. User_Profile_Id:{}", id);
        return response;
    }



    public CoreResponse findUserProfileById(long id){
        logger.info("Begin - findUserProfileById. User_Profile_Id:{}", id);
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            UserProfileDto dto = userService.findUserProfileById(id);
            response.addData(dto);
            if(dto == null)
            {
                response.addStatus(false);
                msg ="User profile doesn't exist for User_Profile_Id:" + id;
            }

        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while searching user profile for User_Profile_Id:" + id;
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - findUserProfileById. User_Profile_Id:{}", id);
        return response;
    }


}
