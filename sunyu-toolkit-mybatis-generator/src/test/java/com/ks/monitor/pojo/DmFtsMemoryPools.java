package com.ks.monitor.pojo;

public class DmFtsMemoryPools {
    private Integer pool_id;

    private Integer buffer_size;

    private Integer min_buffer_limit;

    private Integer max_buffer_limit;

    private Integer buffer_count;

    public Integer getPool_id() {
        return pool_id;
    }

    public void setPool_id(Integer pool_id) {
        this.pool_id = pool_id;
    }

    public Integer getBuffer_size() {
        return buffer_size;
    }

    public void setBuffer_size(Integer buffer_size) {
        this.buffer_size = buffer_size;
    }

    public Integer getMin_buffer_limit() {
        return min_buffer_limit;
    }

    public void setMin_buffer_limit(Integer min_buffer_limit) {
        this.min_buffer_limit = min_buffer_limit;
    }

    public Integer getMax_buffer_limit() {
        return max_buffer_limit;
    }

    public void setMax_buffer_limit(Integer max_buffer_limit) {
        this.max_buffer_limit = max_buffer_limit;
    }

    public Integer getBuffer_count() {
        return buffer_count;
    }

    public void setBuffer_count(Integer buffer_count) {
        this.buffer_count = buffer_count;
    }
}