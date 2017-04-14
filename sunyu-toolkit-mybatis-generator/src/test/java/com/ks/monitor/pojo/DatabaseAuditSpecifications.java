package com.ks.monitor.pojo;

import java.util.Date;

public class DatabaseAuditSpecifications {
    private Integer database_specification_id;

    private String name;

    private Date create_date;

    private Date modify_date;

    private String audit_guid;

    private Boolean is_state_enabled;

    public Integer getDatabase_specification_id() {
        return database_specification_id;
    }

    public void setDatabase_specification_id(Integer database_specification_id) {
        this.database_specification_id = database_specification_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }

    public String getAudit_guid() {
        return audit_guid;
    }

    public void setAudit_guid(String audit_guid) {
        this.audit_guid = audit_guid == null ? null : audit_guid.trim();
    }

    public Boolean getIs_state_enabled() {
        return is_state_enabled;
    }

    public void setIs_state_enabled(Boolean is_state_enabled) {
        this.is_state_enabled = is_state_enabled;
    }
}