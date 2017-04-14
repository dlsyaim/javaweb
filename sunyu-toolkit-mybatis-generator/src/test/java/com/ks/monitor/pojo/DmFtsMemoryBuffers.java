package com.ks.monitor.pojo;

public class DmFtsMemoryBuffers {
    private Integer pool_id;

    private String name;

    private Boolean is_free;

    private Integer row_count;

    private Integer bytes_used;

    private Integer percent_used;

    private byte[] memory_address;

    public Integer getPool_id() {
        return pool_id;
    }

    public void setPool_id(Integer pool_id) {
        this.pool_id = pool_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getIs_free() {
        return is_free;
    }

    public void setIs_free(Boolean is_free) {
        this.is_free = is_free;
    }

    public Integer getRow_count() {
        return row_count;
    }

    public void setRow_count(Integer row_count) {
        this.row_count = row_count;
    }

    public Integer getBytes_used() {
        return bytes_used;
    }

    public void setBytes_used(Integer bytes_used) {
        this.bytes_used = bytes_used;
    }

    public Integer getPercent_used() {
        return percent_used;
    }

    public void setPercent_used(Integer percent_used) {
        this.percent_used = percent_used;
    }

    public byte[] getMemory_address() {
        return memory_address;
    }

    public void setMemory_address(byte[] memory_address) {
        this.memory_address = memory_address;
    }
}