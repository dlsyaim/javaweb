package com.ks.monitor.pojo;

public class DmSqlReferencedEntities {
    private Integer referencing_minor_id;

    private String referenced_server_name;

    private String referenced_database_name;

    private String referenced_schema_name;

    private String referenced_entity_name;

    private String referenced_minor_name;

    private Integer referenced_id;

    private Integer referenced_minor_id;

    private Byte referenced_class;

    private String referenced_class_desc;

    private Boolean is_caller_dependent;

    private Boolean is_ambiguous;

    public Integer getReferencing_minor_id() {
        return referencing_minor_id;
    }

    public void setReferencing_minor_id(Integer referencing_minor_id) {
        this.referencing_minor_id = referencing_minor_id;
    }

    public String getReferenced_server_name() {
        return referenced_server_name;
    }

    public void setReferenced_server_name(String referenced_server_name) {
        this.referenced_server_name = referenced_server_name == null ? null : referenced_server_name.trim();
    }

    public String getReferenced_database_name() {
        return referenced_database_name;
    }

    public void setReferenced_database_name(String referenced_database_name) {
        this.referenced_database_name = referenced_database_name == null ? null : referenced_database_name.trim();
    }

    public String getReferenced_schema_name() {
        return referenced_schema_name;
    }

    public void setReferenced_schema_name(String referenced_schema_name) {
        this.referenced_schema_name = referenced_schema_name == null ? null : referenced_schema_name.trim();
    }

    public String getReferenced_entity_name() {
        return referenced_entity_name;
    }

    public void setReferenced_entity_name(String referenced_entity_name) {
        this.referenced_entity_name = referenced_entity_name == null ? null : referenced_entity_name.trim();
    }

    public String getReferenced_minor_name() {
        return referenced_minor_name;
    }

    public void setReferenced_minor_name(String referenced_minor_name) {
        this.referenced_minor_name = referenced_minor_name == null ? null : referenced_minor_name.trim();
    }

    public Integer getReferenced_id() {
        return referenced_id;
    }

    public void setReferenced_id(Integer referenced_id) {
        this.referenced_id = referenced_id;
    }

    public Integer getReferenced_minor_id() {
        return referenced_minor_id;
    }

    public void setReferenced_minor_id(Integer referenced_minor_id) {
        this.referenced_minor_id = referenced_minor_id;
    }

    public Byte getReferenced_class() {
        return referenced_class;
    }

    public void setReferenced_class(Byte referenced_class) {
        this.referenced_class = referenced_class;
    }

    public String getReferenced_class_desc() {
        return referenced_class_desc;
    }

    public void setReferenced_class_desc(String referenced_class_desc) {
        this.referenced_class_desc = referenced_class_desc == null ? null : referenced_class_desc.trim();
    }

    public Boolean getIs_caller_dependent() {
        return is_caller_dependent;
    }

    public void setIs_caller_dependent(Boolean is_caller_dependent) {
        this.is_caller_dependent = is_caller_dependent;
    }

    public Boolean getIs_ambiguous() {
        return is_ambiguous;
    }

    public void setIs_ambiguous(Boolean is_ambiguous) {
        this.is_ambiguous = is_ambiguous;
    }
}