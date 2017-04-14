package com.ks.monitor.pojo;

public class ForeignKeyColumns {
    private Integer constraint_object_id;

    private Integer constraint_column_id;

    private Integer parent_object_id;

    private Integer parent_column_id;

    private Integer referenced_object_id;

    private Integer referenced_column_id;

    public Integer getConstraint_object_id() {
        return constraint_object_id;
    }

    public void setConstraint_object_id(Integer constraint_object_id) {
        this.constraint_object_id = constraint_object_id;
    }

    public Integer getConstraint_column_id() {
        return constraint_column_id;
    }

    public void setConstraint_column_id(Integer constraint_column_id) {
        this.constraint_column_id = constraint_column_id;
    }

    public Integer getParent_object_id() {
        return parent_object_id;
    }

    public void setParent_object_id(Integer parent_object_id) {
        this.parent_object_id = parent_object_id;
    }

    public Integer getParent_column_id() {
        return parent_column_id;
    }

    public void setParent_column_id(Integer parent_column_id) {
        this.parent_column_id = parent_column_id;
    }

    public Integer getReferenced_object_id() {
        return referenced_object_id;
    }

    public void setReferenced_object_id(Integer referenced_object_id) {
        this.referenced_object_id = referenced_object_id;
    }

    public Integer getReferenced_column_id() {
        return referenced_column_id;
    }

    public void setReferenced_column_id(Integer referenced_column_id) {
        this.referenced_column_id = referenced_column_id;
    }
}