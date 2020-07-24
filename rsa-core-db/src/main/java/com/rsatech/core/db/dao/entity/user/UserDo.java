package com.rsatech.core.db.dao.entity.user;

import com.rsatech.core.db.dao.entity.common.CoreBaseDo;
import com.rsatech.core.shared.dto.common.CoreBaseDto;

public class UserDo extends CoreBaseDo {
   private long userId;
   private String loginId;
   private String firstName;
   private String lastName;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
