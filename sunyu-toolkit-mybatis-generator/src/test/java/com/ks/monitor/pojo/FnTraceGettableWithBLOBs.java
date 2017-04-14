package com.ks.monitor.pojo;

public class FnTraceGettableWithBLOBs extends FnTraceGettable {
    private String textData;

    private byte[] binaryData;

    private byte[] loginSid;

    private byte[] targetLoginSid;

    private byte[] sqlHandle;

    private byte[] planHandle;

    public String getTextData() {
        return textData;
    }

    public void setTextData(String textData) {
        this.textData = textData == null ? null : textData.trim();
    }

    public byte[] getBinaryData() {
        return binaryData;
    }

    public void setBinaryData(byte[] binaryData) {
        this.binaryData = binaryData;
    }

    public byte[] getLoginSid() {
        return loginSid;
    }

    public void setLoginSid(byte[] loginSid) {
        this.loginSid = loginSid;
    }

    public byte[] getTargetLoginSid() {
        return targetLoginSid;
    }

    public void setTargetLoginSid(byte[] targetLoginSid) {
        this.targetLoginSid = targetLoginSid;
    }

    public byte[] getSqlHandle() {
        return sqlHandle;
    }

    public void setSqlHandle(byte[] sqlHandle) {
        this.sqlHandle = sqlHandle;
    }

    public byte[] getPlanHandle() {
        return planHandle;
    }

    public void setPlanHandle(byte[] planHandle) {
        this.planHandle = planHandle;
    }
}