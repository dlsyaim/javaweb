package com.ks.monitor.pojo;

public class SystemInternalsAllocationUnits {
    private Long allocation_unit_id;

    private Byte type;

    private String type_desc;

    private Long container_id;

    private Short filegroup_id;

    private Long total_pages;

    private Long used_pages;

    private Long data_pages;

    public Long getAllocation_unit_id() {
        return allocation_unit_id;
    }

    public void setAllocation_unit_id(Long allocation_unit_id) {
        this.allocation_unit_id = allocation_unit_id;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getType_desc() {
        return type_desc;
    }

    public void setType_desc(String type_desc) {
        this.type_desc = type_desc == null ? null : type_desc.trim();
    }

    public Long getContainer_id() {
        return container_id;
    }

    public void setContainer_id(Long container_id) {
        this.container_id = container_id;
    }

    public Short getFilegroup_id() {
        return filegroup_id;
    }

    public void setFilegroup_id(Short filegroup_id) {
        this.filegroup_id = filegroup_id;
    }

    public Long getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(Long total_pages) {
        this.total_pages = total_pages;
    }

    public Long getUsed_pages() {
        return used_pages;
    }

    public void setUsed_pages(Long used_pages) {
        this.used_pages = used_pages;
    }

    public Long getData_pages() {
        return data_pages;
    }

    public void setData_pages(Long data_pages) {
        this.data_pages = data_pages;
    }
}