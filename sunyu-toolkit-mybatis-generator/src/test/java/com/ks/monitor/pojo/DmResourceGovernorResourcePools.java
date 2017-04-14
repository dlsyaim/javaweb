package com.ks.monitor.pojo;

import java.util.Date;

public class DmResourceGovernorResourcePools {
    private Integer pool_id;

    private String name;

    private Date statistics_start_time;

    private Long total_cpu_usage_ms;

    private Long cache_memory_kb;

    private Long compile_memory_kb;

    private Long used_memgrant_kb;

    private Long total_memgrant_count;

    private Long total_memgrant_timeout_count;

    private Integer active_memgrant_count;

    private Long active_memgrant_kb;

    private Integer memgrant_waiter_count;

    private Long max_memory_kb;

    private Long used_memory_kb;

    private Long target_memory_kb;

    private Long out_of_memory_count;

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

    public Date getStatistics_start_time() {
        return statistics_start_time;
    }

    public void setStatistics_start_time(Date statistics_start_time) {
        this.statistics_start_time = statistics_start_time;
    }

    public Long getTotal_cpu_usage_ms() {
        return total_cpu_usage_ms;
    }

    public void setTotal_cpu_usage_ms(Long total_cpu_usage_ms) {
        this.total_cpu_usage_ms = total_cpu_usage_ms;
    }

    public Long getCache_memory_kb() {
        return cache_memory_kb;
    }

    public void setCache_memory_kb(Long cache_memory_kb) {
        this.cache_memory_kb = cache_memory_kb;
    }

    public Long getCompile_memory_kb() {
        return compile_memory_kb;
    }

    public void setCompile_memory_kb(Long compile_memory_kb) {
        this.compile_memory_kb = compile_memory_kb;
    }

    public Long getUsed_memgrant_kb() {
        return used_memgrant_kb;
    }

    public void setUsed_memgrant_kb(Long used_memgrant_kb) {
        this.used_memgrant_kb = used_memgrant_kb;
    }

    public Long getTotal_memgrant_count() {
        return total_memgrant_count;
    }

    public void setTotal_memgrant_count(Long total_memgrant_count) {
        this.total_memgrant_count = total_memgrant_count;
    }

    public Long getTotal_memgrant_timeout_count() {
        return total_memgrant_timeout_count;
    }

    public void setTotal_memgrant_timeout_count(Long total_memgrant_timeout_count) {
        this.total_memgrant_timeout_count = total_memgrant_timeout_count;
    }

    public Integer getActive_memgrant_count() {
        return active_memgrant_count;
    }

    public void setActive_memgrant_count(Integer active_memgrant_count) {
        this.active_memgrant_count = active_memgrant_count;
    }

    public Long getActive_memgrant_kb() {
        return active_memgrant_kb;
    }

    public void setActive_memgrant_kb(Long active_memgrant_kb) {
        this.active_memgrant_kb = active_memgrant_kb;
    }

    public Integer getMemgrant_waiter_count() {
        return memgrant_waiter_count;
    }

    public void setMemgrant_waiter_count(Integer memgrant_waiter_count) {
        this.memgrant_waiter_count = memgrant_waiter_count;
    }

    public Long getMax_memory_kb() {
        return max_memory_kb;
    }

    public void setMax_memory_kb(Long max_memory_kb) {
        this.max_memory_kb = max_memory_kb;
    }

    public Long getUsed_memory_kb() {
        return used_memory_kb;
    }

    public void setUsed_memory_kb(Long used_memory_kb) {
        this.used_memory_kb = used_memory_kb;
    }

    public Long getTarget_memory_kb() {
        return target_memory_kb;
    }

    public void setTarget_memory_kb(Long target_memory_kb) {
        this.target_memory_kb = target_memory_kb;
    }

    public Long getOut_of_memory_count() {
        return out_of_memory_count;
    }

    public void setOut_of_memory_count(Long out_of_memory_count) {
        this.out_of_memory_count = out_of_memory_count;
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