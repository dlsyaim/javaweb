package com.ks.monitor.pojo;

public class ResourceGovernorResourcePools {
    private Integer pool_id;

    private String name;

    private Integer min_cpu_percent;

    private Integer max_cpu_percent;

    private Integer min_memory_percent;

    private Integer max_memory_percent;

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

    public Integer getMin_cpu_percent() {
        return min_cpu_percent;
    }

    public void setMin_cpu_percent(Integer min_cpu_percent) {
        this.min_cpu_percent = min_cpu_percent;
    }

    public Integer getMax_cpu_percent() {
        return max_cpu_percent;
    }

    public void setMax_cpu_percent(Integer max_cpu_percent) {
        this.max_cpu_percent = max_cpu_percent;
    }

    public Integer getMin_memory_percent() {
        return min_memory_percent;
    }

    public void setMin_memory_percent(Integer min_memory_percent) {
        this.min_memory_percent = min_memory_percent;
    }

    public Integer getMax_memory_percent() {
        return max_memory_percent;
    }

    public void setMax_memory_percent(Integer max_memory_percent) {
        this.max_memory_percent = max_memory_percent;
    }
}