package com.ks.monitor.pojo;

import java.util.Date;

public class HisLogicalstation {
    private Integer ID;

    private Integer RTUID;

    private Integer EStationID;

    private String name;

    private Integer orderID;

    private String PY;

    private Integer importantLevel;

    private String stationNo;

    private Integer protocolID;

    private String installAddress;

    private Date installDate;

    private String SIMNO;

    private Double GISLongitude;

    private Double GISLatitude;

    private Integer deviceState;

    private Integer sendTime;

    private Integer overTimeMinute;

    private Boolean isDelete;

    private String deviceType;

    private Integer addressId;

    private String connectMobile;

    private String remark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getRTUID() {
        return RTUID;
    }

    public void setRTUID(Integer RTUID) {
        this.RTUID = RTUID;
    }

    public Integer getEStationID() {
        return EStationID;
    }

    public void setEStationID(Integer EStationID) {
        this.EStationID = EStationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getPY() {
        return PY;
    }

    public void setPY(String PY) {
        this.PY = PY == null ? null : PY.trim();
    }

    public Integer getImportantLevel() {
        return importantLevel;
    }

    public void setImportantLevel(Integer importantLevel) {
        this.importantLevel = importantLevel;
    }

    public String getStationNo() {
        return stationNo;
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo == null ? null : stationNo.trim();
    }

    public Integer getProtocolID() {
        return protocolID;
    }

    public void setProtocolID(Integer protocolID) {
        this.protocolID = protocolID;
    }

    public String getInstallAddress() {
        return installAddress;
    }

    public void setInstallAddress(String installAddress) {
        this.installAddress = installAddress == null ? null : installAddress.trim();
    }

    public Date getInstallDate() {
        return installDate;
    }

    public void setInstallDate(Date installDate) {
        this.installDate = installDate;
    }

    public String getSIMNO() {
        return SIMNO;
    }

    public void setSIMNO(String SIMNO) {
        this.SIMNO = SIMNO == null ? null : SIMNO.trim();
    }

    public Double getGISLongitude() {
        return GISLongitude;
    }

    public void setGISLongitude(Double GISLongitude) {
        this.GISLongitude = GISLongitude;
    }

    public Double getGISLatitude() {
        return GISLatitude;
    }

    public void setGISLatitude(Double GISLatitude) {
        this.GISLatitude = GISLatitude;
    }

    public Integer getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(Integer deviceState) {
        this.deviceState = deviceState;
    }

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getOverTimeMinute() {
        return overTimeMinute;
    }

    public void setOverTimeMinute(Integer overTimeMinute) {
        this.overTimeMinute = overTimeMinute;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getConnectMobile() {
        return connectMobile;
    }

    public void setConnectMobile(String connectMobile) {
        this.connectMobile = connectMobile == null ? null : connectMobile.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}