package com.ks.monitor.pojo;

import java.util.Date;

public class Assemblies {
    private String name;

    private Integer principal_id;

    private Integer assembly_id;

    private String clr_name;

    private Byte permission_set;

    private String permission_set_desc;

    private Boolean is_visible;

    private Date create_date;

    private Date modify_date;

    private Boolean is_user_defined;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }

    public Integer getAssembly_id() {
        return assembly_id;
    }

    public void setAssembly_id(Integer assembly_id) {
        this.assembly_id = assembly_id;
    }

    public String getClr_name() {
        return clr_name;
    }

    public void setClr_name(String clr_name) {
        this.clr_name = clr_name == null ? null : clr_name.trim();
    }

    public Byte getPermission_set() {
        return permission_set;
    }

    public void setPermission_set(Byte permission_set) {
        this.permission_set = permission_set;
    }

    public String getPermission_set_desc() {
        return permission_set_desc;
    }

    public void setPermission_set_desc(String permission_set_desc) {
        this.permission_set_desc = permission_set_desc == null ? null : permission_set_desc.trim();
    }

    public Boolean getIs_visible() {
        return is_visible;
    }

    public void setIs_visible(Boolean is_visible) {
        this.is_visible = is_visible;
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

    public Boolean getIs_user_defined() {
        return is_user_defined;
    }

    public void setIs_user_defined(Boolean is_user_defined) {
        this.is_user_defined = is_user_defined;
    }
}