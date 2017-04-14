package com.ks.monitor.pojo;

public class DmServerAuditStatus {
    private Integer audit_id;

    private String name;

    private Short status;

    private String status_desc;

    private String status_time;

    private String audit_file_path;

    private Long audit_file_size;

    private byte[] event_session_address;

    public Integer getAudit_id() {
        return audit_id;
    }

    public void setAudit_id(Integer audit_id) {
        this.audit_id = audit_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getStatus_desc() {
        return status_desc;
    }

    public void setStatus_desc(String status_desc) {
        this.status_desc = status_desc == null ? null : status_desc.trim();
    }

    public String getStatus_time() {
        return status_time;
    }

    public void setStatus_time(String status_time) {
        this.status_time = status_time == null ? null : status_time.trim();
    }

    public String getAudit_file_path() {
        return audit_file_path;
    }

    public void setAudit_file_path(String audit_file_path) {
        this.audit_file_path = audit_file_path == null ? null : audit_file_path.trim();
    }

    public Long getAudit_file_size() {
        return audit_file_size;
    }

    public void setAudit_file_size(Long audit_file_size) {
        this.audit_file_size = audit_file_size;
    }

    public byte[] getEvent_session_address() {
        return event_session_address;
    }

    public void setEvent_session_address(byte[] event_session_address) {
        this.event_session_address = event_session_address;
    }
}