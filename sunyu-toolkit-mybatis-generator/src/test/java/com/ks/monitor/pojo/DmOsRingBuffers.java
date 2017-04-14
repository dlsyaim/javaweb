package com.ks.monitor.pojo;

public class DmOsRingBuffers {
    private String ring_buffer_type;

    private Long timestamp;

    private String record;

    private byte[] ring_buffer_address;

    public String getRing_buffer_type() {
        return ring_buffer_type;
    }

    public void setRing_buffer_type(String ring_buffer_type) {
        this.ring_buffer_type = ring_buffer_type == null ? null : ring_buffer_type.trim();
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public byte[] getRing_buffer_address() {
        return ring_buffer_address;
    }

    public void setRing_buffer_address(byte[] ring_buffer_address) {
        this.ring_buffer_address = ring_buffer_address;
    }
}