package com.ks.monitor.pojo;

import java.util.Date;

public class KsLog {
    private Long nId;

    private Long managerID;

    private Date dtDate;

    private String sThread;

    private String sLevel;

    private String sLogger;

    private String sMessage;

    private String sException;

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public Long getManagerID() {
        return managerID;
    }

    public void setManagerID(Long managerID) {
        this.managerID = managerID;
    }

    public Date getDtDate() {
        return dtDate;
    }

    public void setDtDate(Date dtDate) {
        this.dtDate = dtDate;
    }

    public String getsThread() {
        return sThread;
    }

    public void setsThread(String sThread) {
        this.sThread = sThread == null ? null : sThread.trim();
    }

    public String getsLevel() {
        return sLevel;
    }

    public void setsLevel(String sLevel) {
        this.sLevel = sLevel == null ? null : sLevel.trim();
    }

    public String getsLogger() {
        return sLogger;
    }

    public void setsLogger(String sLogger) {
        this.sLogger = sLogger == null ? null : sLogger.trim();
    }

    public String getsMessage() {
        return sMessage;
    }

    public void setsMessage(String sMessage) {
        this.sMessage = sMessage == null ? null : sMessage.trim();
    }

    public String getsException() {
        return sException;
    }

    public void setsException(String sException) {
        this.sException = sException == null ? null : sException.trim();
    }
}