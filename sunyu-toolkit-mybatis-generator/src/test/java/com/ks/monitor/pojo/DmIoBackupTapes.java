package com.ks.monitor.pojo;

import java.util.Date;

public class DmIoBackupTapes {
    private String physical_device_name;

    private String logical_device_name;

    private Integer status;

    private String status_desc;

    private Date mount_request_time;

    private Date mount_expiration_time;

    private String database_name;

    private Integer spid;

    private Integer command;

    private String command_desc;

    private Integer media_family_id;

    private String media_set_name;

    private String media_set_guid;

    private Integer media_sequence_number;

    private Integer tape_operation;

    private String tape_operation_desc;

    private Integer mount_request_type;

    private String mount_request_type_desc;

    public String getPhysical_device_name() {
        return physical_device_name;
    }

    public void setPhysical_device_name(String physical_device_name) {
        this.physical_device_name = physical_device_name == null ? null : physical_device_name.trim();
    }

    public String getLogical_device_name() {
        return logical_device_name;
    }

    public void setLogical_device_name(String logical_device_name) {
        this.logical_device_name = logical_device_name == null ? null : logical_device_name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatus_desc() {
        return status_desc;
    }

    public void setStatus_desc(String status_desc) {
        this.status_desc = status_desc == null ? null : status_desc.trim();
    }

    public Date getMount_request_time() {
        return mount_request_time;
    }

    public void setMount_request_time(Date mount_request_time) {
        this.mount_request_time = mount_request_time;
    }

    public Date getMount_expiration_time() {
        return mount_expiration_time;
    }

    public void setMount_expiration_time(Date mount_expiration_time) {
        this.mount_expiration_time = mount_expiration_time;
    }

    public String getDatabase_name() {
        return database_name;
    }

    public void setDatabase_name(String database_name) {
        this.database_name = database_name == null ? null : database_name.trim();
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public Integer getCommand() {
        return command;
    }

    public void setCommand(Integer command) {
        this.command = command;
    }

    public String getCommand_desc() {
        return command_desc;
    }

    public void setCommand_desc(String command_desc) {
        this.command_desc = command_desc == null ? null : command_desc.trim();
    }

    public Integer getMedia_family_id() {
        return media_family_id;
    }

    public void setMedia_family_id(Integer media_family_id) {
        this.media_family_id = media_family_id;
    }

    public String getMedia_set_name() {
        return media_set_name;
    }

    public void setMedia_set_name(String media_set_name) {
        this.media_set_name = media_set_name == null ? null : media_set_name.trim();
    }

    public String getMedia_set_guid() {
        return media_set_guid;
    }

    public void setMedia_set_guid(String media_set_guid) {
        this.media_set_guid = media_set_guid == null ? null : media_set_guid.trim();
    }

    public Integer getMedia_sequence_number() {
        return media_sequence_number;
    }

    public void setMedia_sequence_number(Integer media_sequence_number) {
        this.media_sequence_number = media_sequence_number;
    }

    public Integer getTape_operation() {
        return tape_operation;
    }

    public void setTape_operation(Integer tape_operation) {
        this.tape_operation = tape_operation;
    }

    public String getTape_operation_desc() {
        return tape_operation_desc;
    }

    public void setTape_operation_desc(String tape_operation_desc) {
        this.tape_operation_desc = tape_operation_desc == null ? null : tape_operation_desc.trim();
    }

    public Integer getMount_request_type() {
        return mount_request_type;
    }

    public void setMount_request_type(Integer mount_request_type) {
        this.mount_request_type = mount_request_type;
    }

    public String getMount_request_type_desc() {
        return mount_request_type_desc;
    }

    public void setMount_request_type_desc(String mount_request_type_desc) {
        this.mount_request_type_desc = mount_request_type_desc == null ? null : mount_request_type_desc.trim();
    }
}