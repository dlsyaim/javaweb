package com.ks.monitor.pojo;

public class ServerAuditSpecificationDetails {
    private Integer server_specification_id;

    private String audit_action_id;

    private String audit_action_name;

    private Byte class;

    private String class_desc;

    private Integer major_id;

    private Integer minor_id;

    private Integer audited_principal_id;

    private String audited_result;

    private Boolean is_group;

    public Integer getServer_specification_id() {
        return server_specification_id;
    }

    public void setServer_specification_id(Integer server_specification_id) {
        this.server_specification_id = server_specification_id;
    }

    public String getAudit_action_id() {
        return audit_action_id;
    }

    public void setAudit_action_id(String audit_action_id) {
        this.audit_action_id = audit_action_id == null ? null : audit_action_id.trim();
    }

    public String getAudit_action_name() {
        return audit_action_name;
    }

    public void setAudit_action_name(String audit_action_name) {
        this.audit_action_name = audit_action_name == null ? null : audit_action_name.trim();
    }

    public Byte getClass() {
        return class;
    }

    public void setClass(Byte class) {
        this.class = class;
    }

    public String getClass_desc() {
        return class_desc;
    }

    public void setClass_desc(String class_desc) {
        this.class_desc = class_desc == null ? null : class_desc.trim();
    }

    public Integer getMajor_id() {
        return major_id;
    }

    public void setMajor_id(Integer major_id) {
        this.major_id = major_id;
    }

    public Integer getMinor_id() {
        return minor_id;
    }

    public void setMinor_id(Integer minor_id) {
        this.minor_id = minor_id;
    }

    public Integer getAudited_principal_id() {
        return audited_principal_id;
    }

    public void setAudited_principal_id(Integer audited_principal_id) {
        this.audited_principal_id = audited_principal_id;
    }

    public String getAudited_result() {
        return audited_result;
    }

    public void setAudited_result(String audited_result) {
        this.audited_result = audited_result == null ? null : audited_result.trim();
    }

    public Boolean getIs_group() {
        return is_group;
    }

    public void setIs_group(Boolean is_group) {
        this.is_group = is_group;
    }
}