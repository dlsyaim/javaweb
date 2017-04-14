package com.ks.monitor.pojo;

import java.util.Date;

public class DmOsChildInstances {
    private String owning_principal_name;

    private String owning_principal_sid;

    private String instance_name;

    private String instance_pipe_name;

    private Integer OS_process_id;

    private Date OS_process_creation_date;

    private String heart_beat;

    private byte[] owning_principal_sid_binary;

    public String getOwning_principal_name() {
        return owning_principal_name;
    }

    public void setOwning_principal_name(String owning_principal_name) {
        this.owning_principal_name = owning_principal_name == null ? null : owning_principal_name.trim();
    }

    public String getOwning_principal_sid() {
        return owning_principal_sid;
    }

    public void setOwning_principal_sid(String owning_principal_sid) {
        this.owning_principal_sid = owning_principal_sid == null ? null : owning_principal_sid.trim();
    }

    public String getInstance_name() {
        return instance_name;
    }

    public void setInstance_name(String instance_name) {
        this.instance_name = instance_name == null ? null : instance_name.trim();
    }

    public String getInstance_pipe_name() {
        return instance_pipe_name;
    }

    public void setInstance_pipe_name(String instance_pipe_name) {
        this.instance_pipe_name = instance_pipe_name == null ? null : instance_pipe_name.trim();
    }

    public Integer getOS_process_id() {
        return OS_process_id;
    }

    public void setOS_process_id(Integer OS_process_id) {
        this.OS_process_id = OS_process_id;
    }

    public Date getOS_process_creation_date() {
        return OS_process_creation_date;
    }

    public void setOS_process_creation_date(Date OS_process_creation_date) {
        this.OS_process_creation_date = OS_process_creation_date;
    }

    public String getHeart_beat() {
        return heart_beat;
    }

    public void setHeart_beat(String heart_beat) {
        this.heart_beat = heart_beat == null ? null : heart_beat.trim();
    }

    public byte[] getOwning_principal_sid_binary() {
        return owning_principal_sid_binary;
    }

    public void setOwning_principal_sid_binary(byte[] owning_principal_sid_binary) {
        this.owning_principal_sid_binary = owning_principal_sid_binary;
    }
}