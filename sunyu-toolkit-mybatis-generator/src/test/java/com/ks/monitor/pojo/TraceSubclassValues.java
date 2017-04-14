package com.ks.monitor.pojo;

public class TraceSubclassValues {
    private Short trace_event_id;

    private Short trace_column_id;

    private String subclass_name;

    private Short subclass_value;

    public Short getTrace_event_id() {
        return trace_event_id;
    }

    public void setTrace_event_id(Short trace_event_id) {
        this.trace_event_id = trace_event_id;
    }

    public Short getTrace_column_id() {
        return trace_column_id;
    }

    public void setTrace_column_id(Short trace_column_id) {
        this.trace_column_id = trace_column_id;
    }

    public String getSubclass_name() {
        return subclass_name;
    }

    public void setSubclass_name(String subclass_name) {
        this.subclass_name = subclass_name == null ? null : subclass_name.trim();
    }

    public Short getSubclass_value() {
        return subclass_value;
    }

    public void setSubclass_value(Short subclass_value) {
        this.subclass_value = subclass_value;
    }
}