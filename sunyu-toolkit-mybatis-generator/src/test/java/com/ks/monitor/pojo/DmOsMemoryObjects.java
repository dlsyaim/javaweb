package com.ks.monitor.pojo;

import java.util.Date;

public class DmOsMemoryObjects {
    private Integer pages_allocated_count;

    private Integer creation_options;

    private Long bytes_used;

    private String type;

    private String name;

    private Short memory_node_id;

    private Date creation_time;

    private Integer page_size_in_bytes;

    private Integer max_pages_allocated_count;

    private Integer sequence_num;

    public Integer getPages_allocated_count() {
        return pages_allocated_count;
    }

    public void setPages_allocated_count(Integer pages_allocated_count) {
        this.pages_allocated_count = pages_allocated_count;
    }

    public Integer getCreation_options() {
        return creation_options;
    }

    public void setCreation_options(Integer creation_options) {
        this.creation_options = creation_options;
    }

    public Long getBytes_used() {
        return bytes_used;
    }

    public void setBytes_used(Long bytes_used) {
        this.bytes_used = bytes_used;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getMemory_node_id() {
        return memory_node_id;
    }

    public void setMemory_node_id(Short memory_node_id) {
        this.memory_node_id = memory_node_id;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public Integer getPage_size_in_bytes() {
        return page_size_in_bytes;
    }

    public void setPage_size_in_bytes(Integer page_size_in_bytes) {
        this.page_size_in_bytes = page_size_in_bytes;
    }

    public Integer getMax_pages_allocated_count() {
        return max_pages_allocated_count;
    }

    public void setMax_pages_allocated_count(Integer max_pages_allocated_count) {
        this.max_pages_allocated_count = max_pages_allocated_count;
    }

    public Integer getSequence_num() {
        return sequence_num;
    }

    public void setSequence_num(Integer sequence_num) {
        this.sequence_num = sequence_num;
    }
}