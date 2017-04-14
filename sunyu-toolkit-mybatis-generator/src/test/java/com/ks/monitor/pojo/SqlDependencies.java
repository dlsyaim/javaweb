package com.ks.monitor.pojo;

public class SqlDependencies {
    private Byte class;

    private String class_desc;

    private Integer object_id;

    private Integer column_id;

    private Integer referenced_major_id;

    private Integer referenced_minor_id;

    private Boolean is_selected;

    private Boolean is_updated;

    private Boolean is_select_all;

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

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Integer getColumn_id() {
        return column_id;
    }

    public void setColumn_id(Integer column_id) {
        this.column_id = column_id;
    }

    public Integer getReferenced_major_id() {
        return referenced_major_id;
    }

    public void setReferenced_major_id(Integer referenced_major_id) {
        this.referenced_major_id = referenced_major_id;
    }

    public Integer getReferenced_minor_id() {
        return referenced_minor_id;
    }

    public void setReferenced_minor_id(Integer referenced_minor_id) {
        this.referenced_minor_id = referenced_minor_id;
    }

    public Boolean getIs_selected() {
        return is_selected;
    }

    public void setIs_selected(Boolean is_selected) {
        this.is_selected = is_selected;
    }

    public Boolean getIs_updated() {
        return is_updated;
    }

    public void setIs_updated(Boolean is_updated) {
        this.is_updated = is_updated;
    }

    public Boolean getIs_select_all() {
        return is_select_all;
    }

    public void setIs_select_all(Boolean is_select_all) {
        this.is_select_all = is_select_all;
    }
}