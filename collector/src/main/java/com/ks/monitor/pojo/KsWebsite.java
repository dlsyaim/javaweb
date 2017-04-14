package com.ks.monitor.pojo;

import java.util.Date;

public class KsWebsite {
    private Long webSiteID;

    private String webSiteName;

    private Date addTime;

    private Short status;

    public Long getWebSiteID() {
        return webSiteID;
    }

    public void setWebSiteID(Long webSiteID) {
        this.webSiteID = webSiteID;
    }

    public String getWebSiteName() {
        return webSiteName;
    }

    public void setWebSiteName(String webSiteName) {
        this.webSiteName = webSiteName == null ? null : webSiteName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}