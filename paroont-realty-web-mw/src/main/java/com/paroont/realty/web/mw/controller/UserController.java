package com.paroont.realty.web.mw.controller;

import com.paroont.core.shared.dto.common.CoreResponse;
import com.paroont.realty.core.shared.dto.user.UserActionDto;
import com.paroont.realty.core.shared.dto.user.UserProfileDto;
import com.paroont.realty.core.shared.service.common.RealtyAllService;
import com.paroont.realty.web.mw.constant.common.WebMwConst;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;


@RestController
public class UserController implements WebMwConst {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);



    @Autowired
    RealtyAllService realtyAllService;


    @GetMapping(URL_REALTY_USER_PROFILE_ID)
    public Map<String, Object> findUserProfileById(@PathVariable(URL_COMMON_PARAM_USER_PROFILE_ID) long userProfileId) {
        logger.info("Begin - findUserProfileById. USER_PROFILE_ID:{}", userProfileId);
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            UserProfileDto dto = realtyAllService.getUserService().findUserProfileById(userProfileId);
            response.addData(dto);
            if (null == dto) {
                response.addStatus(false);
                msg = "Invalid User!!!";
            }
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while getting profile details.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - findUserProfileById. USER_PROFILE_ID:{}", userProfileId);
        return response.getResMap();
    }

    @PostMapping(URL_REALTY_USER_PROFILE)
    public Map<String, Object> addUserProfile(@RequestBody UserProfileDto user) {
        user.setUserProfileId(0L);
        return saveUserProfile(user).getResMap();

    }

    @PutMapping(URL_REALTY_USER_PROFILE_ID)
    public Map<String, Object> updateUserProfile(@RequestBody UserProfileDto user, @PathVariable(URL_COMMON_PARAM_USER_PROFILE_ID) long userProfileId) {
        logger.info("Begin - updateUserProfile.");
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            if (user.getUserProfileId() != userProfileId) {
                response.addStatus(false);
                msg = "Invalid User Request!!!";
                response.addMessage(msg);
                logger.error(msg);
            } else {
                response = saveUserProfile(user);
            }
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while updating profile.";
            response.addMessage(msg);
            logger.error(msg + e.getMessage(), e);
        }
        logger.info("End - updateUserProfile. USER_PROFILE_ID:{}", userProfileId);
        return response.getResMap();
    }

    private CoreResponse saveUserProfile(UserProfileDto user) {
        logger.info("Begin - saveUserProfile.");
        CoreResponse response = new CoreResponse();
        UserActionDto actionDto = new UserActionDto();
        String msg = "";
        long userProfileId = 0;
        try {
            updateUserId( user);
            actionDto.setUserId(user.getUserId());
            userProfileId = realtyAllService.getUserService().saveUserProfile(user, actionDto);
            response.addResponse(RESPONSE_USER_PROFILE_ID, userProfileId);
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while saving profile.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - saveUserProfile. USER_PROFILE_ID:{}", userProfileId);
        return response;
    }

    private void updateUserId(UserProfileDto user){
            user.setUserId(Optional.ofNullable(user.getMobileCountryCode()).orElse("") + Optional.ofNullable(user.getMobileNo()).orElse(""));
    }
}
