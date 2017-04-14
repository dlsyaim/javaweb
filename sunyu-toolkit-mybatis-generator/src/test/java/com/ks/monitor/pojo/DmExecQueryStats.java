package com.ks.monitor.pojo;

import java.util.Date;

public class DmExecQueryStats {
    private Integer statement_start_offset;

    private Integer statement_end_offset;

    private Long plan_generation_num;

    private Date creation_time;

    private Date last_execution_time;

    private Long execution_count;

    private Long total_worker_time;

    private Long last_worker_time;

    private Long min_worker_time;

    private Long max_worker_time;

    private Long total_physical_reads;

    private Long last_physical_reads;

    private Long min_physical_reads;

    private Long max_physical_reads;

    private Long total_logical_writes;

    private Long last_logical_writes;

    private Long min_logical_writes;

    private Long max_logical_writes;

    private Long total_logical_reads;

    private Long last_logical_reads;

    private Long min_logical_reads;

    private Long max_logical_reads;

    private Long total_clr_time;

    private Long last_clr_time;

    private Long min_clr_time;

    private Long max_clr_time;

    private Long total_elapsed_time;

    private Long last_elapsed_time;

    private Long min_elapsed_time;

    private Long max_elapsed_time;

    public Integer getStatement_start_offset() {
        return statement_start_offset;
    }

    public void setStatement_start_offset(Integer statement_start_offset) {
        this.statement_start_offset = statement_start_offset;
    }

    public Integer getStatement_end_offset() {
        return statement_end_offset;
    }

    public void setStatement_end_offset(Integer statement_end_offset) {
        this.statement_end_offset = statement_end_offset;
    }

    public Long getPlan_generation_num() {
        return plan_generation_num;
    }

    public void setPlan_generation_num(Long plan_generation_num) {
        this.plan_generation_num = plan_generation_num;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public Date getLast_execution_time() {
        return last_execution_time;
    }

    public void setLast_execution_time(Date last_execution_time) {
        this.last_execution_time = last_execution_time;
    }

    public Long getExecution_count() {
        return execution_count;
    }

    public void setExecution_count(Long execution_count) {
        this.execution_count = execution_count;
    }

    public Long getTotal_worker_time() {
        return total_worker_time;
    }

    public void setTotal_worker_time(Long total_worker_time) {
        this.total_worker_time = total_worker_time;
    }

    public Long getLast_worker_time() {
        return last_worker_time;
    }

    public void setLast_worker_time(Long last_worker_time) {
        this.last_worker_time = last_worker_time;
    }

    public Long getMin_worker_time() {
        return min_worker_time;
    }

    public void setMin_worker_time(Long min_worker_time) {
        this.min_worker_time = min_worker_time;
    }

    public Long getMax_worker_time() {
        return max_worker_time;
    }

    public void setMax_worker_time(Long max_worker_time) {
        this.max_worker_time = max_worker_time;
    }

    public Long getTotal_physical_reads() {
        return total_physical_reads;
    }

    public void setTotal_physical_reads(Long total_physical_reads) {
        this.total_physical_reads = total_physical_reads;
    }

    public Long getLast_physical_reads() {
        return last_physical_reads;
    }

    public void setLast_physical_reads(Long last_physical_reads) {
        this.last_physical_reads = last_physical_reads;
    }

    public Long getMin_physical_reads() {
        return min_physical_reads;
    }

    public void setMin_physical_reads(Long min_physical_reads) {
        this.min_physical_reads = min_physical_reads;
    }

    public Long getMax_physical_reads() {
        return max_physical_reads;
    }

    public void setMax_physical_reads(Long max_physical_reads) {
        this.max_physical_reads = max_physical_reads;
    }

    public Long getTotal_logical_writes() {
        return total_logical_writes;
    }

    public void setTotal_logical_writes(Long total_logical_writes) {
        this.total_logical_writes = total_logical_writes;
    }

    public Long getLast_logical_writes() {
        return last_logical_writes;
    }

    public void setLast_logical_writes(Long last_logical_writes) {
        this.last_logical_writes = last_logical_writes;
    }

    public Long getMin_logical_writes() {
        return min_logical_writes;
    }

    public void setMin_logical_writes(Long min_logical_writes) {
        this.min_logical_writes = min_logical_writes;
    }

    public Long getMax_logical_writes() {
        return max_logical_writes;
    }

    public void setMax_logical_writes(Long max_logical_writes) {
        this.max_logical_writes = max_logical_writes;
    }

    public Long getTotal_logical_reads() {
        return total_logical_reads;
    }

    public void setTotal_logical_reads(Long total_logical_reads) {
        this.total_logical_reads = total_logical_reads;
    }

    public Long getLast_logical_reads() {
        return last_logical_reads;
    }

    public void setLast_logical_reads(Long last_logical_reads) {
        this.last_logical_reads = last_logical_reads;
    }

    public Long getMin_logical_reads() {
        return min_logical_reads;
    }

    public void setMin_logical_reads(Long min_logical_reads) {
        this.min_logical_reads = min_logical_reads;
    }

    public Long getMax_logical_reads() {
        return max_logical_reads;
    }

    public void setMax_logical_reads(Long max_logical_reads) {
        this.max_logical_reads = max_logical_reads;
    }

    public Long getTotal_clr_time() {
        return total_clr_time;
    }

    public void setTotal_clr_time(Long total_clr_time) {
        this.total_clr_time = total_clr_time;
    }

    public Long getLast_clr_time() {
        return last_clr_time;
    }

    public void setLast_clr_time(Long last_clr_time) {
        this.last_clr_time = last_clr_time;
    }

    public Long getMin_clr_time() {
        return min_clr_time;
    }

    public void setMin_clr_time(Long min_clr_time) {
        this.min_clr_time = min_clr_time;
    }

    public Long getMax_clr_time() {
        return max_clr_time;
    }

    public void setMax_clr_time(Long max_clr_time) {
        this.max_clr_time = max_clr_time;
    }

    public Long getTotal_elapsed_time() {
        return total_elapsed_time;
    }

    public void setTotal_elapsed_time(Long total_elapsed_time) {
        this.total_elapsed_time = total_elapsed_time;
    }

    public Long getLast_elapsed_time() {
        return last_elapsed_time;
    }

    public void setLast_elapsed_time(Long last_elapsed_time) {
        this.last_elapsed_time = last_elapsed_time;
    }

    public Long getMin_elapsed_time() {
        return min_elapsed_time;
    }

    public void setMin_elapsed_time(Long min_elapsed_time) {
        this.min_elapsed_time = min_elapsed_time;
    }

    public Long getMax_elapsed_time() {
        return max_elapsed_time;
    }

    public void setMax_elapsed_time(Long max_elapsed_time) {
        this.max_elapsed_time = max_elapsed_time;
    }
}