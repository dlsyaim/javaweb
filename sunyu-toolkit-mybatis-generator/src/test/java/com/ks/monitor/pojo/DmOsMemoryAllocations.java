package com.ks.monitor.pojo;

import java.util.Date;

public class DmOsMemoryAllocations {
    private Long size_in_bytes;

    private Date creation_time;

    private Short memory_node_id;

    private String source_file;

    private Integer line_num;

    private Integer sequence_num;

    private Integer tag;

    public Long getSize_in_bytes() {
        return size_in_bytes;
    }

    public void setSize_in_bytes(Long size_in_bytes) {
        this.size_in_bytes = size_in_bytes;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public Short getMemory_node_id() {
        return memory_node_id;
    }

    public void setMemory_node_id(Short memory_node_id) {
        this.memory_node_id = memory_node_id;
    }

    public String getSource_file() {
        return source_file;
    }

    public void setSource_file(String source_file) {
        this.source_file = source_file == null ? null : source_file.trim();
    }

    public Integer getLine_num() {
        return line_num;
    }

    public void setLine_num(Integer line_num) {
        this.line_num = line_num;
    }

    public Integer getSequence_num() {
        return sequence_num;
    }

    public void setSequence_num(Integer sequence_num) {
        this.sequence_num = sequence_num;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }
}