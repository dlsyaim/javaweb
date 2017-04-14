package com.ks.monitor.pojo;

public class DmOsMemoryNodeAccessStats {
    private Integer local_node;

    private Integer remote_node;

    private String page_class;

    private Long read_count;

    private Long write_count;

    public Integer getLocal_node() {
        return local_node;
    }

    public void setLocal_node(Integer local_node) {
        this.local_node = local_node;
    }

    public Integer getRemote_node() {
        return remote_node;
    }

    public void setRemote_node(Integer remote_node) {
        this.remote_node = remote_node;
    }

    public String getPage_class() {
        return page_class;
    }

    public void setPage_class(String page_class) {
        this.page_class = page_class == null ? null : page_class.trim();
    }

    public Long getRead_count() {
        return read_count;
    }

    public void setRead_count(Long read_count) {
        this.read_count = read_count;
    }

    public Long getWrite_count() {
        return write_count;
    }

    public void setWrite_count(Long write_count) {
        this.write_count = write_count;
    }
}