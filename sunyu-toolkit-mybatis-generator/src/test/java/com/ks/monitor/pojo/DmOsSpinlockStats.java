package com.ks.monitor.pojo;

public class DmOsSpinlockStats {
    private String name;

    private Long collisions;

    private Long spins;

    private Float spins_per_collision;

    private Long sleep_time;

    private Integer backoffs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getCollisions() {
        return collisions;
    }

    public void setCollisions(Long collisions) {
        this.collisions = collisions;
    }

    public Long getSpins() {
        return spins;
    }

    public void setSpins(Long spins) {
        this.spins = spins;
    }

    public Float getSpins_per_collision() {
        return spins_per_collision;
    }

    public void setSpins_per_collision(Float spins_per_collision) {
        this.spins_per_collision = spins_per_collision;
    }

    public Long getSleep_time() {
        return sleep_time;
    }

    public void setSleep_time(Long sleep_time) {
        this.sleep_time = sleep_time;
    }

    public Integer getBackoffs() {
        return backoffs;
    }

    public void setBackoffs(Integer backoffs) {
        this.backoffs = backoffs;
    }
}