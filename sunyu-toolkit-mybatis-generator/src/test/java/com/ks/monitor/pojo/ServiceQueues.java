package com.ks.monitor.pojo;

import java.util.Date;

public class ServiceQueues {
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

    private Short max_readers;

    private String activation_procedure;

    private Integer execute_as_principal_id;

    private Boolean is_activation_enabled;

    private Boolean is_receive_enabled;

    private Boolean is_enqueue_enabled;

    private Boolean is_retention_enabled;

    private Boolean is_poison_message_handling_enabled;

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

    public Short getMax_readers() {
        return max_readers;
    }

    public void setMax_readers(Short max_readers) {
        this.max_readers = max_readers;
    }

    public String getActivation_procedure() {
        return activation_procedure;
    }

    public void setActivation_procedure(String activation_procedure) {
        this.activation_procedure = activation_procedure == null ? null : activation_procedure.trim();
    }

    public Integer getExecute_as_principal_id() {
        return execute_as_principal_id;
    }

    public void setExecute_as_principal_id(Integer execute_as_principal_id) {
        this.execute_as_principal_id = execute_as_principal_id;
    }

    public Boolean getIs_activation_enabled() {
        return is_activation_enabled;
    }

    public void setIs_activation_enabled(Boolean is_activation_enabled) {
        this.is_activation_enabled = is_activation_enabled;
    }

    public Boolean getIs_receive_enabled() {
        return is_receive_enabled;
    }

    public void setIs_receive_enabled(Boolean is_receive_enabled) {
        this.is_receive_enabled = is_receive_enabled;
    }

    public Boolean getIs_enqueue_enabled() {
        return is_enqueue_enabled;
    }

    public void setIs_enqueue_enabled(Boolean is_enqueue_enabled) {
        this.is_enqueue_enabled = is_enqueue_enabled;
    }

    public Boolean getIs_retention_enabled() {
        return is_retention_enabled;
    }

    public void setIs_retention_enabled(Boolean is_retention_enabled) {
        this.is_retention_enabled = is_retention_enabled;
    }

    public Boolean getIs_poison_message_handling_enabled() {
        return is_poison_message_handling_enabled;
    }

    public void setIs_poison_message_handling_enabled(Boolean is_poison_message_handling_enabled) {
        this.is_poison_message_handling_enabled = is_poison_message_handling_enabled;
    }
}