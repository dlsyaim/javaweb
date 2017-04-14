package com.ks.monitor.pojo;

public class DmOsLatchStats {
    private String latch_class;

    private Long waiting_requests_count;

    private Long wait_time_ms;

    private Long max_wait_time_ms;

    public String getLatch_class() {
        return latch_class;
    }

    public void setLatch_class(String latch_class) {
        this.latch_class = latch_class == null ? null : latch_class.trim();
    }

    public Long getWaiting_requests_count() {
        return waiting_requests_count;
    }

    public void setWaiting_requests_count(Long waiting_requests_count) {
        this.waiting_requests_count = waiting_requests_count;
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
}