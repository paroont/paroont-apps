package com.paroont.core.shared.dto.common;

import java.sql.Timestamp;

public class CoreActionBaseDto implements CoreActionDto {
    protected long userId;
    protected String loginId;

    protected int actionId;
    protected String actionTitle;
    protected Timestamp actionTs;

    protected int appId;
    protected int moduleId;

    protected String comments;

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

    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Timestamp getActionTs() {
        return actionTs;
    }

    public void setActionTs(Timestamp actionTs) {
        this.actionTs = actionTs;
    }

    public String getActionTitle() {
        return actionTitle;
    }

    public void setActionTitle(String actionTitle) {
        this.actionTitle = actionTitle;
    }
}
