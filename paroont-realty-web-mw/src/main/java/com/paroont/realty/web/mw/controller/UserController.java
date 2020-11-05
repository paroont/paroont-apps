package com.paroont.realty.web.mw.controller;

import com.paroont.realty.core.shared.dto.user.UserActionDto;
import com.paroont.realty.core.shared.dto.user.UserProfileDto;
import com.paroont.realty.core.shared.facade.user.UserProfileFacade;
import com.paroont.realty.core.shared.filter.user.UserProfileFilter;
import com.paroont.realty.web.mw.constant.common.WebMwConst;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class UserController implements WebMwConst {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserProfileFacade userProfileFacade;


    @GetMapping(URL_REALTY_USER_PROFILE)
    public Map<String, Object> findAllUserProfiles(@RequestParam Map<String, String> allParams) {
        logger.info("findAllUserProfiles:: allParams={}", allParams);
        UserProfileFilter filter = new UserProfileFilter();
        String userProfileId = allParams.getOrDefault(URL_COMMON_PARAM_USER_PROFILE_ID, "-99");
        if (allParams.containsKey(URL_COMMON_PARAM_MOBILE_NO)) {
            filter.setMobileNo(allParams.get(URL_COMMON_PARAM_MOBILE_NO));
        }
        if (allParams.containsKey(URL_COMMON_PARAM_MOBILE_COUNTRY_CODE)) {
            filter.setMobileCountryCode(allParams.get(URL_COMMON_PARAM_MOBILE_COUNTRY_CODE));
        }

        if (StringUtils.isNotBlank(userProfileId)) {
            filter.setUserProfileId(Long.parseLong(userProfileId));
        }
        return userProfileFacade.findAllUserProfiles(filter).getResMap();
    }

    @GetMapping(URL_REALTY_USER_PROFILE_ID)
    public Map<String, Object> findUserProfileById(@PathVariable(URL_COMMON_PARAM_USER_PROFILE_ID) long userProfileId) {
        return userProfileFacade.findUserProfileById(userProfileId).getResMap();
    }


    @PostMapping(URL_REALTY_USER_PROFILE)
    public Map<String, Object> addUserProfile(@RequestBody UserProfileDto dto, @RequestHeader(value = URL_COMMON_PARAM_HEADER_PAROONT_UID, defaultValue = "0") String uid) {
        dto.setUserProfileId(0);
        return userProfileFacade.saveUserProfile(dto, createUserActionDto(uid)).getResMap();
    }

    @PutMapping(URL_REALTY_USER_PROFILE_ID)
    public Map<String, Object> updateUserProfile(@RequestBody UserProfileDto dto, @PathVariable(URL_COMMON_PARAM_USER_PROFILE_ID) long userProfileId, @RequestHeader(value = URL_COMMON_PARAM_HEADER_PAROONT_UID, defaultValue = "0") String uid) {
        dto.setUserProfileId(userProfileId);
        return userProfileFacade.saveUserProfile(dto, createUserActionDto(uid)).getResMap();
    }

    private UserActionDto createUserActionDto(String userId) {
        UserActionDto actionDto = new UserActionDto();
        actionDto.setUserId(userId);
        return actionDto;
    }
}
