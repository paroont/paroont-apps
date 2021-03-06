package com.paroont.realty.core.db.service.impl.user;

import com.paroont.realty.core.db.dao.entity.user.UserProfileDo;
import com.paroont.realty.core.db.service.impl.common.RealtyDbServiceImpl;
import com.paroont.realty.core.db.service.service.user.UserDbService;
import com.paroont.realty.core.db.dao.dao.user.UserProfileDao;
import com.paroont.realty.core.shared.dto.user.UserActionDto;
import com.paroont.realty.core.shared.dto.user.UserProfileDto;
import com.paroont.realty.core.shared.filter.user.UserProfileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class UserDbServiceImpl extends RealtyDbServiceImpl implements UserDbService {
    private static final Logger logger = LoggerFactory.getLogger(UserDbServiceImpl.class);

    @Autowired
    private UserProfileDao userProfileDao;

    public List<UserProfileDto> findAllUserProfiles(UserProfileFilter filter) {
        logger.info("Begin - findAllUserProfiles.");
        List<UserProfileDto> dtos = UserProfileMapper.INSTANCE.toDtos(userProfileDao.findAll(filter));
        logger.info("End - findAllUserProfiles.");
        return dtos;
    }

    public UserProfileDto findUserProfileById(long id) {
        logger.info("Begin - findUserProfileById. USER_PROFILE_ID:{}", id);
        UserProfileDto dto = UserProfileMapper.INSTANCE.toDto(userProfileDao.findById(id));
        logger.info("End - findUserProfileById. USER_PROFILE_ID:{}", id);
        return dto;
    }


    public long saveUserProfile(UserProfileDto dto, UserActionDto action) {
        Long userId = dto.getUserProfileId();
        logger.info("Begin - saveUserProfile. USER_PROFILE_ID:{}", userId);
        UserProfileDo userDo = UserProfileMapper.INSTANCE.toDo(dto);
        action.setActionTs(new Timestamp(new Date().getTime()));
        userId = userProfileDao.save(userDo, action);
        logger.info("End - saveUserProfile. USER_PROFILE_ID:{}", userId);
        return userId;
    }

    @Lookup
    private UserProfileDao createUserProfileDao() {
        //TODO fix issue for null
        return null;
    }

}
