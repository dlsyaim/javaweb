package com.ks.monitor.pojo;

public class DmXeSessionTargetsWithBLOBs extends DmXeSessionTargets {
    private byte[] event_session_address;

    private String target_data;

    public byte[] getEvent_session_address() {
        return event_session_address;
    }

    public void setEvent_session_address(byte[] event_session_address) {
        this.event_session_address = event_session_address;
    }

    public String getTarget_data() {
        return target_data;
    }

    public void setTarget_data(String target_data) {
        this.target_data = target_data == null ? null : target_data.trim();
    }
}