package com.ks.monitor.pojo;

public class DmFilestreamFileIoRequests {
    private Short current_spid;

    private String request_type;

    private String request_state;

    private Integer request_id;

    private Integer irp_id;

    private Integer handle_id;

    public Short getCurrent_spid() {
        return current_spid;
    }

    public void setCurrent_spid(Short current_spid) {
        this.current_spid = current_spid;
    }

    public String getRequest_type() {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type == null ? null : request_type.trim();
    }

    public String getRequest_state() {
        return request_state;
    }

    public void setRequest_state(String request_state) {
        this.request_state = request_state == null ? null : request_state.trim();
    }

    public Integer getRequest_id() {
        return request_id;
    }

    public void setRequest_id(Integer request_id) {
        this.request_id = request_id;
    }

    public Integer getIrp_id() {
        return irp_id;
    }

    public void setIrp_id(Integer irp_id) {
        this.irp_id = irp_id;
    }

    public Integer getHandle_id() {
        return handle_id;
    }

    public void setHandle_id(Integer handle_id) {
        this.handle_id = handle_id;
    }
}