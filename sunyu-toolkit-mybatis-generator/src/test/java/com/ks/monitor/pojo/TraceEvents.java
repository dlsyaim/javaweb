package com.ks.monitor.pojo;

public class TraceEvents {
    private Short trace_event_id;

    private Short category_id;

    private String name;

    public Short getTrace_event_id() {
        return trace_event_id;
    }

    public void setTrace_event_id(Short trace_event_id) {
        this.trace_event_id = trace_event_id;
    }

    public Short getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Short category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}