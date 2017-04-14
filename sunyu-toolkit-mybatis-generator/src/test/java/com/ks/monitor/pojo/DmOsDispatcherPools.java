package com.ks.monitor.pojo;

public class DmOsDispatcherPools {
    private String type;

    private String name;

    private Integer dispatcher_count;

    private Integer dispatcher_ideal_count;

    private Integer dispatcher_timeout_ms;

    private Integer dispatcher_waiting_count;

    private Integer queue_length;

    private byte[] dispatcher_pool_address;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDispatcher_count() {
        return dispatcher_count;
    }

    public void setDispatcher_count(Integer dispatcher_count) {
        this.dispatcher_count = dispatcher_count;
    }

    public Integer getDispatcher_ideal_count() {
        return dispatcher_ideal_count;
    }

    public void setDispatcher_ideal_count(Integer dispatcher_ideal_count) {
        this.dispatcher_ideal_count = dispatcher_ideal_count;
    }

    public Integer getDispatcher_timeout_ms() {
        return dispatcher_timeout_ms;
    }

    public void setDispatcher_timeout_ms(Integer dispatcher_timeout_ms) {
        this.dispatcher_timeout_ms = dispatcher_timeout_ms;
    }

    public Integer getDispatcher_waiting_count() {
        return dispatcher_waiting_count;
    }

    public void setDispatcher_waiting_count(Integer dispatcher_waiting_count) {
        this.dispatcher_waiting_count = dispatcher_waiting_count;
    }

    public Integer getQueue_length() {
        return queue_length;
    }

    public void setQueue_length(Integer queue_length) {
        this.queue_length = queue_length;
    }

    public byte[] getDispatcher_pool_address() {
        return dispatcher_pool_address;
    }

    public void setDispatcher_pool_address(byte[] dispatcher_pool_address) {
        this.dispatcher_pool_address = dispatcher_pool_address;
    }
}