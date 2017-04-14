package com.ks.monitor.pojo;

public class FnTraceGetfilterinfo {
    private Integer columnid;

    private Integer logical_operator;

    private Integer comparison_operator;

    private String value;

    public Integer getColumnid() {
        return columnid;
    }

    public void setColumnid(Integer columnid) {
        this.columnid = columnid;
    }

    public Integer getLogical_operator() {
        return logical_operator;
    }

    public void setLogical_operator(Integer logical_operator) {
        this.logical_operator = logical_operator;
    }

    public Integer getComparison_operator() {
        return comparison_operator;
    }

    public void setComparison_operator(Integer comparison_operator) {
        this.comparison_operator = comparison_operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}