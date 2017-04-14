package com.ks.monitor.pojo;

public class DmOsWaitStats {
    private String wait_type;

    private Long waiting_tasks_count;

    private Long wait_time_ms;

    private Long max_wait_time_ms;

    private Long signal_wait_time_ms;

    public String getWait_type() {
        return wait_type;
    }

    public void setWait_type(String wait_type) {
        this.wait_type = wait_type == null ? null : wait_type.trim();
    }

    public Long getWaiting_tasks_count() {
        return waiting_tasks_count;
    }

    public void setWaiting_tasks_count(Long waiting_tasks_count) {
        this.waiting_tasks_count = waiting_tasks_count;
    }

    public Long getWait_time_ms() {
        return wait_time_ms;
    }

    public void setWait_time_ms(Long wait_time_ms) {
        this.wait_time_ms = wait_time_ms;
    }

    public Long getMax_wait_time_ms() {
        return max_wait_time_ms;
    }

    public void setMax_wait_time_ms(Long max_wait_time_ms) {
        this.max_wait_time_ms = max_wait_time_ms;
    }

    public Long getSignal_wait_time_ms() {
        return signal_wait_time_ms;
    }

    public void setSignal_wait_time_ms(Long signal_wait_time_ms) {
        this.signal_wait_time_ms = signal_wait_time_ms;
    }
}