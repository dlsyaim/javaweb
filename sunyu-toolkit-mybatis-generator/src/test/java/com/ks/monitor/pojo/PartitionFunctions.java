package com.ks.monitor.pojo;

import java.util.Date;

public class PartitionFunctions {
    private String name;

    private Integer function_id;

    private String type;

    private String type_desc;

    private Integer fanout;

    private Boolean boundary_value_on_right;

    private Date create_date;

    private Date modify_date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFunction_id() {
        return function_id;
    }

    public void setFunction_id(Integer function_id) {
        this.function_id = function_id;
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

    public Integer getFanout() {
        return fanout;
    }

    public void setFanout(Integer fanout) {
        this.fanout = fanout;
    }

    public Boolean getBoundary_value_on_right() {
        return boundary_value_on_right;
    }

    public void setBoundary_value_on_right(Boolean boundary_value_on_right) {
        this.boundary_value_on_right = boundary_value_on_right;
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
}