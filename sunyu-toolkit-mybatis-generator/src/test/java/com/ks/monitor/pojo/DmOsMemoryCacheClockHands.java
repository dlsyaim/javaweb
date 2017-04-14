package com.ks.monitor.pojo;

public class DmOsMemoryCacheClockHands {
    private String name;

    private String type;

    private String clock_hand;

    private String clock_status;

    private Long rounds_count;

    private Long removed_all_rounds_count;

    private Long updated_last_round_count;

    private Long removed_last_round_count;

    private Long last_tick_time;

    private Long round_start_time;

    private Long last_round_start_time;

    private byte[] cache_address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getClock_hand() {
        return clock_hand;
    }

    public void setClock_hand(String clock_hand) {
        this.clock_hand = clock_hand == null ? null : clock_hand.trim();
    }

    public String getClock_status() {
        return clock_status;
    }

    public void setClock_status(String clock_status) {
        this.clock_status = clock_status == null ? null : clock_status.trim();
    }

    public Long getRounds_count() {
        return rounds_count;
    }

    public void setRounds_count(Long rounds_count) {
        this.rounds_count = rounds_count;
    }

    public Long getRemoved_all_rounds_count() {
        return removed_all_rounds_count;
    }

    public void setRemoved_all_rounds_count(Long removed_all_rounds_count) {
        this.removed_all_rounds_count = removed_all_rounds_count;
    }

    public Long getUpdated_last_round_count() {
        return updated_last_round_count;
    }

    public void setUpdated_last_round_count(Long updated_last_round_count) {
        this.updated_last_round_count = updated_last_round_count;
    }

    public Long getRemoved_last_round_count() {
        return removed_last_round_count;
    }

    public void setRemoved_last_round_count(Long removed_last_round_count) {
        this.removed_last_round_count = removed_last_round_count;
    }

    public Long getLast_tick_time() {
        return last_tick_time;
    }

    public void setLast_tick_time(Long last_tick_time) {
        this.last_tick_time = last_tick_time;
    }

    public Long getRound_start_time() {
        return round_start_time;
    }

    public void setRound_start_time(Long round_start_time) {
        this.round_start_time = round_start_time;
    }

    public Long getLast_round_start_time() {
        return last_round_start_time;
    }

    public void setLast_round_start_time(Long last_round_start_time) {
        this.last_round_start_time = last_round_start_time;
    }

    public byte[] getCache_address() {
        return cache_address;
    }

    public void setCache_address(byte[] cache_address) {
        this.cache_address = cache_address;
    }
}