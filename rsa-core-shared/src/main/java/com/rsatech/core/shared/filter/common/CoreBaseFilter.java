package com.rsatech.core.shared.filter.common;


import com.rsatech.core.shared.exception.common.CoreRuntimeException;

public class CoreBaseFilter  implements CoreFilter {
    protected long userId;
    protected String loginId;

    protected Boolean active;
    protected int pageNo = 1;
    protected int pageSize = 25;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

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


}
