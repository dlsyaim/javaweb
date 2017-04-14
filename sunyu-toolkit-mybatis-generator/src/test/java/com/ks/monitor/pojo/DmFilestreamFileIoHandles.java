package com.ks.monitor.pojo;

public class DmFilestreamFileIoHandles {
    private Integer creation_request_id;

    private Integer creation_irp_id;

    private Integer handle_id;

    private String access_type;

    private String logical_path;

    private String physical_path;

    public Integer getCreation_request_id() {
        return creation_request_id;
    }

    public void setCreation_request_id(Integer creation_request_id) {
        this.creation_request_id = creation_request_id;
    }

    public Integer getCreation_irp_id() {
        return creation_irp_id;
    }

    public void setCreation_irp_id(Integer creation_irp_id) {
        this.creation_irp_id = creation_irp_id;
    }

    public Integer getHandle_id() {
        return handle_id;
    }

    public void setHandle_id(Integer handle_id) {
        this.handle_id = handle_id;
    }

    public String getAccess_type() {
        return access_type;
    }

    public void setAccess_type(String access_type) {
        this.access_type = access_type == null ? null : access_type.trim();
    }

    public String getLogical_path() {
        return logical_path;
    }

    public void setLogical_path(String logical_path) {
        this.logical_path = logical_path == null ? null : logical_path.trim();
    }

    public String getPhysical_path() {
        return physical_path;
    }

    public void setPhysical_path(String physical_path) {
        this.physical_path = physical_path == null ? null : physical_path.trim();
    }
}