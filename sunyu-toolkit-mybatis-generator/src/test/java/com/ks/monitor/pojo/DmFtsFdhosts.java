package com.ks.monitor.pojo;

public class DmFtsFdhosts {
    private Integer fdhost_id;

    private String fdhost_name;

    private Integer fdhost_process_id;

    private String fdhost_type;

    private Integer max_thread;

    private Integer batch_count;

    public Integer getFdhost_id() {
        return fdhost_id;
    }

    public void setFdhost_id(Integer fdhost_id) {
        this.fdhost_id = fdhost_id;
    }

    public String getFdhost_name() {
        return fdhost_name;
    }

    public void setFdhost_name(String fdhost_name) {
        this.fdhost_name = fdhost_name == null ? null : fdhost_name.trim();
    }

    public Integer getFdhost_process_id() {
        return fdhost_process_id;
    }

    public void setFdhost_process_id(Integer fdhost_process_id) {
        this.fdhost_process_id = fdhost_process_id;
    }

    public String getFdhost_type() {
        return fdhost_type;
    }

    public void setFdhost_type(String fdhost_type) {
        this.fdhost_type = fdhost_type == null ? null : fdhost_type.trim();
    }

    public Integer getMax_thread() {
        return max_thread;
    }

    public void setMax_thread(Integer max_thread) {
        this.max_thread = max_thread;
    }

    public Integer getBatch_count() {
        return batch_count;
    }

    public void setBatch_count(Integer batch_count) {
        this.batch_count = batch_count;
    }
}