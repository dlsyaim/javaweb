package com.ks.monitor.pojo;

public class Filegroups {
    private String name;

    private Integer data_space_id;

    private String type;

    private String type_desc;

    private Boolean is_default;

    private String filegroup_guid;

    private Integer log_filegroup_id;

    private Boolean is_read_only;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getData_space_id() {
        return data_space_id;
    }

    public void setData_space_id(Integer data_space_id) {
        this.data_space_id = data_space_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getType_desc() {
        return type_desc;
    }

    public void setType_desc(String type_desc) {
        this.type_desc = type_desc == null ? null : type_desc.trim();
    }

    public Boolean getIs_default() {
        return is_default;
    }

    public void setIs_default(Boolean is_default) {
        this.is_default = is_default;
    }

    public String getFilegroup_guid() {
        return filegroup_guid;
    }

    public void setFilegroup_guid(String filegroup_guid) {
        this.filegroup_guid = filegroup_guid == null ? null : filegroup_guid.trim();
    }

    public Integer getLog_filegroup_id() {
        return log_filegroup_id;
    }

    public void setLog_filegroup_id(Integer log_filegroup_id) {
        this.log_filegroup_id = log_filegroup_id;
    }

    public Boolean getIs_read_only() {
        return is_read_only;
    }

    public void setIs_read_only(Boolean is_read_only) {
        this.is_read_only = is_read_only;
    }
}