package com.ks.monitor.pojo;

public class DmDbScriptLevel {
    private Integer database_id;

    private Integer script_id;

    private String script_name;

    private Integer version;

    private Integer script_level;

    private Integer downgrade_start_level;

    private Integer downgrade_target_level;

    private Integer upgrade_start_level;

    private Integer upgrade_target_level;

    public Integer getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Integer database_id) {
        this.database_id = database_id;
    }

    public Integer getScript_id() {
        return script_id;
    }

    public void setScript_id(Integer script_id) {
        this.script_id = script_id;
    }

    public String getScript_name() {
        return script_name;
    }

    public void setScript_name(String script_name) {
        this.script_name = script_name == null ? null : script_name.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getScript_level() {
        return script_level;
    }

    public void setScript_level(Integer script_level) {
        this.script_level = script_level;
    }

    public Integer getDowngrade_start_level() {
        return downgrade_start_level;
    }

    public void setDowngrade_start_level(Integer downgrade_start_level) {
        this.downgrade_start_level = downgrade_start_level;
    }

    public Integer getDowngrade_target_level() {
        return downgrade_target_level;
    }

    public void setDowngrade_target_level(Integer downgrade_target_level) {
        this.downgrade_target_level = downgrade_target_level;
    }

    public Integer getUpgrade_start_level() {
        return upgrade_start_level;
    }

    public void setUpgrade_start_level(Integer upgrade_start_level) {
        this.upgrade_start_level = upgrade_start_level;
    }

    public Integer getUpgrade_target_level() {
        return upgrade_target_level;
    }

    public void setUpgrade_target_level(Integer upgrade_target_level) {
        this.upgrade_target_level = upgrade_target_level;
    }
}