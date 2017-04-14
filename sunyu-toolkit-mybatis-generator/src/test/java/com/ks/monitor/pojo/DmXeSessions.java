package com.ks.monitor.pojo;

import java.util.Date;

public class DmXeSessions {
    private String name;

    private Integer pending_buffers;

    private Integer total_regular_buffers;

    private Long regular_buffer_size;

    private Integer total_large_buffers;

    private Long large_buffer_size;

    private Long total_buffer_size;

    private Integer buffer_policy_flags;

    private String buffer_policy_desc;

    private Integer flags;

    private String flag_desc;

    private Integer dropped_event_count;

    private Integer dropped_buffer_count;

    private Integer blocked_event_fire_time;

    private Date create_time;

    private Integer largest_event_dropped_size;

    private byte[] address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPending_buffers() {
        return pending_buffers;
    }

    public void setPending_buffers(Integer pending_buffers) {
        this.pending_buffers = pending_buffers;
    }

    public Integer getTotal_regular_buffers() {
        return total_regular_buffers;
    }

    public void setTotal_regular_buffers(Integer total_regular_buffers) {
        this.total_regular_buffers = total_regular_buffers;
    }

    public Long getRegular_buffer_size() {
        return regular_buffer_size;
    }

    public void setRegular_buffer_size(Long regular_buffer_size) {
        this.regular_buffer_size = regular_buffer_size;
    }

    public Integer getTotal_large_buffers() {
        return total_large_buffers;
    }

    public void setTotal_large_buffers(Integer total_large_buffers) {
        this.total_large_buffers = total_large_buffers;
    }

    public Long getLarge_buffer_size() {
        return large_buffer_size;
    }

    public void setLarge_buffer_size(Long large_buffer_size) {
        this.large_buffer_size = large_buffer_size;
    }

    public Long getTotal_buffer_size() {
        return total_buffer_size;
    }

    public void setTotal_buffer_size(Long total_buffer_size) {
        this.total_buffer_size = total_buffer_size;
    }

    public Integer getBuffer_policy_flags() {
        return buffer_policy_flags;
    }

    public void setBuffer_policy_flags(Integer buffer_policy_flags) {
        this.buffer_policy_flags = buffer_policy_flags;
    }

    public String getBuffer_policy_desc() {
        return buffer_policy_desc;
    }

    public void setBuffer_policy_desc(String buffer_policy_desc) {
        this.buffer_policy_desc = buffer_policy_desc == null ? null : buffer_policy_desc.trim();
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public String getFlag_desc() {
        return flag_desc;
    }

    public void setFlag_desc(String flag_desc) {
        this.flag_desc = flag_desc == null ? null : flag_desc.trim();
    }

    public Integer getDropped_event_count() {
        return dropped_event_count;
    }

    public void setDropped_event_count(Integer dropped_event_count) {
        this.dropped_event_count = dropped_event_count;
    }

    public Integer getDropped_buffer_count() {
        return dropped_buffer_count;
    }

    public void setDropped_buffer_count(Integer dropped_buffer_count) {
        this.dropped_buffer_count = dropped_buffer_count;
    }

    public Integer getBlocked_event_fire_time() {
        return blocked_event_fire_time;
    }

    public void setBlocked_event_fire_time(Integer blocked_event_fire_time) {
        this.blocked_event_fire_time = blocked_event_fire_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getLargest_event_dropped_size() {
        return largest_event_dropped_size;
    }

    public void setLargest_event_dropped_size(Integer largest_event_dropped_size) {
        this.largest_event_dropped_size = largest_event_dropped_size;
    }

    public byte[] getAddress() {
        return address;
    }

    public void setAddress(byte[] address) {
        this.address = address;
    }
}