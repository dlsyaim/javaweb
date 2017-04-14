package com.ks.monitor.pojo;

public class DmOsDispatchers {
    private String state;

    private Long wait_duration;

    private Long current_item_duration;

    private Long items_processed;

    private Integer fade_end_time;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getWait_duration() {
        return wait_duration;
    }

    public void setWait_duration(Long wait_duration) {
        this.wait_duration = wait_duration;
    }

    public Long getCurrent_item_duration() {
        return current_item_duration;
    }

    public void setCurrent_item_duration(Long current_item_duration) {
        this.current_item_duration = current_item_duration;
    }

    public Long getItems_processed() {
        return items_processed;
    }

    public void setItems_processed(Long items_processed) {
        this.items_processed = items_processed;
    }

    public Integer getFade_end_time() {
        return fade_end_time;
    }

    public void setFade_end_time(Integer fade_end_time) {
        this.fade_end_time = fade_end_time;
    }
}