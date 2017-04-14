package com.ks.monitor.pojo;

public class ServerEventSessionActions {
    private Integer event_session_id;

    private Integer event_id;

    private String name;

    private String package;

    private String module;

    public Integer getEvent_session_id() {
        return event_session_id;
    }

    public void setEvent_session_id(Integer event_session_id) {
        this.event_session_id = event_session_id;
    }

    public Integer getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Integer event_id) {
        this.event_id = event_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPackage() {
        return package;
    }

    public void setPackage(String package) {
        this.package = package == null ? null : package.trim();
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }
}