package com.ks.monitor.pojo;

public class DmDbMirroringPastActions {
    private String mirroring_guid;

    private String state_machine_name;

    private String action_type;

    private String name;

    private String current_state;

    private Integer action_sequence;

    public String getMirroring_guid() {
        return mirroring_guid;
    }

    public void setMirroring_guid(String mirroring_guid) {
        this.mirroring_guid = mirroring_guid == null ? null : mirroring_guid.trim();
    }

    public String getState_machine_name() {
        return state_machine_name;
    }

    public void setState_machine_name(String state_machine_name) {
        this.state_machine_name = state_machine_name == null ? null : state_machine_name.trim();
    }

    public String getAction_type() {
        return action_type;
    }

    public void setAction_type(String action_type) {
        this.action_type = action_type == null ? null : action_type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCurrent_state() {
        return current_state;
    }

    public void setCurrent_state(String current_state) {
        this.current_state = current_state == null ? null : current_state.trim();
    }

    public Integer getAction_sequence() {
        return action_sequence;
    }

    public void setAction_sequence(Integer action_sequence) {
        this.action_sequence = action_sequence;
    }
}