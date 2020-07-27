package com.rsatech.realty.web.mw.controller;

import com.rsatech.core.shared.dto.common.CoreResponse;
import com.rsatech.realty.core.shared.dto.user.UserActionDto;
import com.rsatech.realty.core.shared.dto.user.UserProfileDto;
import com.rsatech.realty.core.shared.service.user.UserService;
import com.rsatech.realty.web.mw.constant.common.WebMwConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class UserController implements WebMwConst {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;


    @GetMapping(URL_REALTY_USER_PROFILE_ID)
    public Map<String, Object> findUserProfileById(@PathVariable("userId") long userId) {
        logger.info("Begin - findUserProfileById. USER_ID:{}", userId);
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            UserProfileDto dto = userService.findUserProfileById(userId);
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
        logger.info("End - findUserProfileById. USER_ID:{}", userId);
        return response.getResMap();
    }

    @PostMapping(URL_REALTY_USER_PROFILE)
    public Map<String, Object> addUserProfile(@RequestBody UserProfileDto user) {
        return saveUserProfile(user).getResMap();

    }

    @PutMapping(URL_REALTY_USER_PROFILE_ID)
    public Map<String, Object> updateUserProfile(@RequestBody UserProfileDto user, @PathVariable("userId") long userId) {
        logger.info("Begin - updateUserProfile.");
        CoreResponse response = new CoreResponse();
        String msg = "";
        try {
            if (user.getUserId() != userId) {
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
        logger.info("End - updateUserProfile. USER_ID:{}", userId);
        return response.getResMap();
    }

    private CoreResponse saveUserProfile(UserProfileDto user) {
        logger.info("Begin - saveUserProfile.");
        CoreResponse response = new CoreResponse();
        UserActionDto actionDto = new UserActionDto();
        String msg = "";
        long userId = 0;
        try {
            actionDto.setUserId(1);
            userId = userService.saveUserProfile(user, actionDto);
            response.addResponse(RESPONSE_USER_ID, userId);
        } catch (Exception e) {
            response.addStatus(false);
            msg = "Error occurred while saving profile.";
            logger.error(msg + e.getMessage(), e);
        }
        response.addMessage(msg);
        logger.info("End - saveUserProfile. USER_ID:{}", userId);
        return response;
    }
}
