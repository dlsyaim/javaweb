package com.ks.monitor.pojo;

import java.util.Date;

public class ServerFileAudits {
    private Integer audit_id;

    private String name;

    private String audit_guid;

    private Date create_date;

    private Date modify_date;

    private Integer principal_id;

    private String type;

    private String type_desc;

    private Byte on_failure;

    private String on_failure_desc;

    private Boolean is_state_enabled;

    private Integer queue_delay;

    private Long max_file_size;

    private Integer max_rollover_files;

    private Boolean reserve_disk_space;

    private String log_file_path;

    private String log_file_name;

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

    public String getAudit_guid() {
        return audit_guid;
    }

    public void setAudit_guid(String audit_guid) {
        this.audit_guid = audit_guid == null ? null : audit_guid.trim();
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

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getType_desc() {
        return type_desc;
    }

    public void setType_desc(String type_desc) {
        this.type_desc = type_desc == null ? null : type_desc.trim();
    }

    public Byte getOn_failure() {
        return on_failure;
    }

    public void setOn_failure(Byte on_failure) {
        this.on_failure = on_failure;
    }

    public String getOn_failure_desc() {
        return on_failure_desc;
    }

    public void setOn_failure_desc(String on_failure_desc) {
        this.on_failure_desc = on_failure_desc == null ? null : on_failure_desc.trim();
    }

    public Boolean getIs_state_enabled() {
        return is_state_enabled;
    }

    public void setIs_state_enabled(Boolean is_state_enabled) {
        this.is_state_enabled = is_state_enabled;
    }

    public Integer getQueue_delay() {
        return queue_delay;
    }

    public void setQueue_delay(Integer queue_delay) {
        this.queue_delay = queue_delay;
    }

    public Long getMax_file_size() {
        return max_file_size;
    }

    public void setMax_file_size(Long max_file_size) {
        this.max_file_size = max_file_size;
    }

    public Integer getMax_rollover_files() {
        return max_rollover_files;
    }

    public void setMax_rollover_files(Integer max_rollover_files) {
        this.max_rollover_files = max_rollover_files;
    }

    public Boolean getReserve_disk_space() {
        return reserve_disk_space;
    }

    public void setReserve_disk_space(Boolean reserve_disk_space) {
        this.reserve_disk_space = reserve_disk_space;
    }

    public String getLog_file_path() {
        return log_file_path;
    }

    public void setLog_file_path(String log_file_path) {
        this.log_file_path = log_file_path == null ? null : log_file_path.trim();
    }

    public String getLog_file_name() {
        return log_file_name;
    }

    public void setLog_file_name(String log_file_name) {
        this.log_file_name = log_file_name == null ? null : log_file_name.trim();
    }
}