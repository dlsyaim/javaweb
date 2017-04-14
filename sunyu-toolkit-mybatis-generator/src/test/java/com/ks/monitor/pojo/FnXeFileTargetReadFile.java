package com.ks.monitor.pojo;

public class FnXeFileTargetReadFile {
    private String module_guid;

    private String package_guid;

    private String object_name;

    private String file_name;

    private Long file_offset;

    private String event_data;

    public String getModule_guid() {
        return module_guid;
    }

    public void setModule_guid(String module_guid) {
        this.module_guid = module_guid == null ? null : module_guid.trim();
    }

    public String getPackage_guid() {
        return package_guid;
    }

    public void setPackage_guid(String package_guid) {
        this.package_guid = package_guid == null ? null : package_guid.trim();
    }

    public String getObject_name() {
        return object_name;
    }

    public void setObject_name(String object_name) {
        this.object_name = object_name == null ? null : object_name.trim();
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name == null ? null : file_name.trim();
    }

    public Long getFile_offset() {
        return file_offset;
    }

    public void setFile_offset(Long file_offset) {
        this.file_offset = file_offset;
    }

    public String getEvent_data() {
        return event_data;
    }

    public void setEvent_data(String event_data) {
        this.event_data = event_data == null ? null : event_data.trim();
    }
}