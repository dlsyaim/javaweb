package com.ks.monitor.pojo;

public class DmSqlReferencingEntities {
    private String referencing_schema_name;

    private String referencing_entity_name;

    private Integer referencing_id;

    private Byte referencing_class;

    private String referencing_class_desc;

    private Boolean is_caller_dependent;

    public String getReferencing_schema_name() {
        return referencing_schema_name;
    }

    public void setReferencing_schema_name(String referencing_schema_name) {
        this.referencing_schema_name = referencing_schema_name == null ? null : referencing_schema_name.trim();
    }

    public String getReferencing_entity_name() {
        return referencing_entity_name;
    }

    public void setReferencing_entity_name(String referencing_entity_name) {
        this.referencing_entity_name = referencing_entity_name == null ? null : referencing_entity_name.trim();
    }

    public Integer getReferencing_id() {
        return referencing_id;
    }

    public void setReferencing_id(Integer referencing_id) {
        this.referencing_id = referencing_id;
    }

    public Byte getReferencing_class() {
        return referencing_class;
    }

    public void setReferencing_class(Byte referencing_class) {
        this.referencing_class = referencing_class;
    }

    public String getReferencing_class_desc() {
        return referencing_class_desc;
    }

    public void setReferencing_class_desc(String referencing_class_desc) {
        this.referencing_class_desc = referencing_class_desc == null ? null : referencing_class_desc.trim();
    }

    public Boolean getIs_caller_dependent() {
        return is_caller_dependent;
    }

    public void setIs_caller_dependent(Boolean is_caller_dependent) {
        this.is_caller_dependent = is_caller_dependent;
    }
}