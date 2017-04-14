package com.ks.monitor.pojo;

public class FunctionOrderColumns {
    private Integer object_id;

    private Integer order_column_id;

    private Integer column_id;

    private Boolean is_descending;

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Integer getOrder_column_id() {
        return order_column_id;
    }

    public void setOrder_column_id(Integer order_column_id) {
        this.order_column_id = order_column_id;
    }

    public Integer getColumn_id() {
        return column_id;
    }

    public void setColumn_id(Integer column_id) {
        this.column_id = column_id;
    }

    public Boolean getIs_descending() {
        return is_descending;
    }

    public void setIs_descending(Boolean is_descending) {
        this.is_descending = is_descending;
    }
}