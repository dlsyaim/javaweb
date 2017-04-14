package com.ks.monitor.pojo;

public class DmXeSessionTargets {
    private String target_name;

    private String target_package_guid;

    private Long execution_count;

    private Long execution_duration_ms;

    public String getTarget_name() {
        return target_name;
    }

    public void setTarget_name(String target_name) {
        this.target_name = target_name == null ? null : target_name.trim();
    }

    public String getTarget_package_guid() {
        return target_package_guid;
    }

    public void setTarget_package_guid(String target_package_guid) {
        this.target_package_guid = target_package_guid == null ? null : target_package_guid.trim();
    }

    public Long getExecution_count() {
        return execution_count;
    }

    public void setExecution_count(Long execution_count) {
        this.execution_count = execution_count;
    }

    public Long getExecution_duration_ms() {
        return execution_duration_ms;
    }

    public void setExecution_duration_ms(Long execution_duration_ms) {
        this.execution_duration_ms = execution_duration_ms;
    }
}