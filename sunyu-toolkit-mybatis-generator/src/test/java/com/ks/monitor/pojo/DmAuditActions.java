package com.ks.monitor.pojo;

public class DmAuditActions {
    private String action_id;

    private String name;

    private String class_desc;

    private String covering_action_name;

    private String parent_class_desc;

    private String covering_parent_action_name;

    private String configuration_level;

    private String containing_group_name;

    private Boolean action_in_log;

    public String getAction_id() {
        return action_id;
    }

    public void setAction_id(String action_id) {
        this.action_id = action_id == null ? null : action_id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getClass_desc() {
        return class_desc;
    }

    public void setClass_desc(String class_desc) {
        this.class_desc = class_desc == null ? null : class_desc.trim();
    }

    public String getCovering_action_name() {
        return covering_action_name;
    }

    public void setCovering_action_name(String covering_action_name) {
        this.covering_action_name = covering_action_name == null ? null : covering_action_name.trim();
    }

    public String getParent_class_desc() {
        return parent_class_desc;
    }

    public void setParent_class_desc(String parent_class_desc) {
        this.parent_class_desc = parent_class_desc == null ? null : parent_class_desc.trim();
    }

    public String getCovering_parent_action_name() {
        return covering_parent_action_name;
    }

    public void setCovering_parent_action_name(String covering_parent_action_name) {
        this.covering_parent_action_name = covering_parent_action_name == null ? null : covering_parent_action_name.trim();
    }

    public String getConfiguration_level() {
        return configuration_level;
    }

    public void setConfiguration_level(String configuration_level) {
        this.configuration_level = configuration_level == null ? null : configuration_level.trim();
    }

    public String getContaining_group_name() {
        return containing_group_name;
    }

    public void setContaining_group_name(String containing_group_name) {
        this.containing_group_name = containing_group_name == null ? null : containing_group_name.trim();
    }

    public Boolean getAction_in_log() {
        return action_in_log;
    }

    public void setAction_in_log(Boolean action_in_log) {
        this.action_in_log = action_in_log;
    }
}