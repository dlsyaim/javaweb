package com.ks.monitor.pojo;

public class ServerPermissions {
    private Byte class;

    private String class_desc;

    private Integer major_id;

    private Integer minor_id;

    private Integer grantee_principal_id;

    private Integer grantor_principal_id;

    private String type;

    private String permission_name;

    private String state;

    private String state_desc;

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

    public Integer getGrantee_principal_id() {
        return grantee_principal_id;
    }

    public void setGrantee_principal_id(Integer grantee_principal_id) {
        this.grantee_principal_id = grantee_principal_id;
    }

    public Integer getGrantor_principal_id() {
        return grantor_principal_id;
    }

    public void setGrantor_principal_id(Integer grantor_principal_id) {
        this.grantor_principal_id = grantor_principal_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPermission_name() {
        return permission_name;
    }

    public void setPermission_name(String permission_name) {
        this.permission_name = permission_name == null ? null : permission_name.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getState_desc() {
        return state_desc;
    }

    public void setState_desc(String state_desc) {
        this.state_desc = state_desc == null ? null : state_desc.trim();
    }
}