package com.ks.monitor.pojo;

public class DmIoPendingIoRequests {
    private String io_type;

    private Long io_pending_ms_ticks;

    private Integer io_pending;

    private Long io_offset;

    public String getIo_type() {
        return io_type;
    }

    public void setIo_type(String io_type) {
        this.io_type = io_type == null ? null : io_type.trim();
    }

    public Long getIo_pending_ms_ticks() {
        return io_pending_ms_ticks;
    }

    public void setIo_pending_ms_ticks(Long io_pending_ms_ticks) {
        this.io_pending_ms_ticks = io_pending_ms_ticks;
    }

    public Integer getIo_pending() {
        return io_pending;
    }

    public void setIo_pending(Integer io_pending) {
        this.io_pending = io_pending;
    }

    public Long getIo_offset() {
        return io_offset;
    }

    public void setIo_offset(Long io_offset) {
        this.io_offset = io_offset;
    }
}