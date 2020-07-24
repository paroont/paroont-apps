package com.rsatech.realty.core.mw.service.impl.user;

import com.rsatech.realty.core.db.dao.entity.user.UserProfileDo;
import com.rsatech.realty.core.db.dao.user.UserProfileDao;
import com.rsatech.realty.core.mw.service.impl.common.RealtyServiceImpl;
import com.rsatech.realty.core.shared.dto.user.UserProfileDto;
import com.rsatech.realty.core.shared.filter.user.UserProfileFilter;
import com.rsatech.realty.core.shared.service.user.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserProfileServiceImpl extends RealtyServiceImpl implements UserProfileService {

    @Autowired
   private UserProfileDao userProfileDao;

    public List<UserProfileDto> findAllUserProfiles(UserProfileFilter filter)
    {
        List<UserProfileDto> dtos = new ArrayList<>();
        List<UserProfileDo> dos = userProfileDao.findAll(filter);
        dos.forEach(data -> dtos.add(new UserProfileDto(data.getFirstName(), data.getLastName())));
      return  dtos;
    }
}
