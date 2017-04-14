package com.ks.monitor.pojo;

import java.util.Date;

public class ForeignKeys {
    private String name;

    private Integer object_id;

    private Integer principal_id;

    private Integer schema_id;

    private Integer parent_object_id;

    private String type;

    private String type_desc;

    private Date create_date;

    private Date modify_date;

    private Boolean is_ms_shipped;

    private Boolean is_published;

    private Boolean is_schema_published;

    private Integer referenced_object_id;

    private Integer key_index_id;

    private Boolean is_disabled;

    private Boolean is_not_for_replication;

    private Boolean is_not_trusted;

    private Byte delete_referential_action;

    private String delete_referential_action_desc;

    private Byte update_referential_action;

    private String update_referential_action_desc;

    private Boolean is_system_named;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }

    public Integer getSchema_id() {
        return schema_id;
    }

    public void setSchema_id(Integer schema_id) {
        this.schema_id = schema_id;
    }

    public Integer getParent_object_id() {
        return parent_object_id;
    }

    public void setParent_object_id(Integer parent_object_id) {
        this.parent_object_id = parent_object_id;
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

    public Boolean getIs_ms_shipped() {
        return is_ms_shipped;
    }

    public void setIs_ms_shipped(Boolean is_ms_shipped) {
        this.is_ms_shipped = is_ms_shipped;
    }

    public Boolean getIs_published() {
        return is_published;
    }

    public void setIs_published(Boolean is_published) {
        this.is_published = is_published;
    }

    public Boolean getIs_schema_published() {
        return is_schema_published;
    }

    public void setIs_schema_published(Boolean is_schema_published) {
        this.is_schema_published = is_schema_published;
    }

    public Integer getReferenced_object_id() {
        return referenced_object_id;
    }

    public void setReferenced_object_id(Integer referenced_object_id) {
        this.referenced_object_id = referenced_object_id;
    }

    public Integer getKey_index_id() {
        return key_index_id;
    }

    public void setKey_index_id(Integer key_index_id) {
        this.key_index_id = key_index_id;
    }

    public Boolean getIs_disabled() {
        return is_disabled;
    }

    public void setIs_disabled(Boolean is_disabled) {
        this.is_disabled = is_disabled;
    }

    public Boolean getIs_not_for_replication() {
        return is_not_for_replication;
    }

    public void setIs_not_for_replication(Boolean is_not_for_replication) {
        this.is_not_for_replication = is_not_for_replication;
    }

    public Boolean getIs_not_trusted() {
        return is_not_trusted;
    }

    public void setIs_not_trusted(Boolean is_not_trusted) {
        this.is_not_trusted = is_not_trusted;
    }

    public Byte getDelete_referential_action() {
        return delete_referential_action;
    }

    public void setDelete_referential_action(Byte delete_referential_action) {
        this.delete_referential_action = delete_referential_action;
    }

    public String getDelete_referential_action_desc() {
        return delete_referential_action_desc;
    }

    public void setDelete_referential_action_desc(String delete_referential_action_desc) {
        this.delete_referential_action_desc = delete_referential_action_desc == null ? null : delete_referential_action_desc.trim();
    }

    public Byte getUpdate_referential_action() {
        return update_referential_action;
    }

    public void setUpdate_referential_action(Byte update_referential_action) {
        this.update_referential_action = update_referential_action;
    }

    public String getUpdate_referential_action_desc() {
        return update_referential_action_desc;
    }

    public void setUpdate_referential_action_desc(String update_referential_action_desc) {
        this.update_referential_action_desc = update_referential_action_desc == null ? null : update_referential_action_desc.trim();
    }

    public Boolean getIs_system_named() {
        return is_system_named;
    }

    public void setIs_system_named(Boolean is_system_named) {
        this.is_system_named = is_system_named;
    }
}