package com.ks.monitor.pojo;

public class NumberedProcedures {
    private Integer object_id;

    private Short procedure_number;

    private String definition;

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Short getProcedure_number() {
        return procedure_number;
    }

    public void setProcedure_number(Short procedure_number) {
        this.procedure_number = procedure_number;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition == null ? null : definition.trim();
    }
}