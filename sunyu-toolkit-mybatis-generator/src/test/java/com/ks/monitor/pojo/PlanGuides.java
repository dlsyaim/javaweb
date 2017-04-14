package com.ks.monitor.pojo;

import java.util.Date;

public class PlanGuides {
    private Integer plan_guide_id;

    private String name;

    private Date create_date;

    private Date modify_date;

    private Boolean is_disabled;

    private Byte scope_type;

    private String scope_type_desc;

    private Integer scope_object_id;

    public Integer getPlan_guide_id() {
        return plan_guide_id;
    }

    public void setPlan_guide_id(Integer plan_guide_id) {
        this.plan_guide_id = plan_guide_id;
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

    public Boolean getIs_disabled() {
        return is_disabled;
    }

    public void setIs_disabled(Boolean is_disabled) {
        this.is_disabled = is_disabled;
    }

    public Byte getScope_type() {
        return scope_type;
    }

    public void setScope_type(Byte scope_type) {
        this.scope_type = scope_type;
    }

    public String getScope_type_desc() {
        return scope_type_desc;
    }

    public void setScope_type_desc(String scope_type_desc) {
        this.scope_type_desc = scope_type_desc == null ? null : scope_type_desc.trim();
    }

    public Integer getScope_object_id() {
        return scope_object_id;
    }

    public void setScope_object_id(Integer scope_object_id) {
        this.scope_object_id = scope_object_id;
    }
}