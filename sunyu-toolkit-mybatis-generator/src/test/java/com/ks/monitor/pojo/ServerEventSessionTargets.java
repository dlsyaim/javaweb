package com.ks.monitor.pojo;

public class ServerEventSessionTargets {
    private Integer event_session_id;

    private Integer target_id;

    private String name;

    private String package;

    private String module;

    public Integer getEvent_session_id() {
        return event_session_id;
    }

    public void setEvent_session_id(Integer event_session_id) {
        this.event_session_id = event_session_id;
    }

    public Integer getTarget_id() {
        return target_id;
    }

    public void setTarget_id(Integer target_id) {
        this.target_id = target_id;
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