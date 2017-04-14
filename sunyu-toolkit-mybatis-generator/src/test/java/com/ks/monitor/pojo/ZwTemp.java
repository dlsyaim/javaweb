package com.ks.monitor.pojo;

public class ZwTemp {
    private String badge;

    private String name;

    private String job;

    private Double KDA;

    private Integer match;

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge == null ? null : badge.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public Double getKDA() {
        return KDA;
    }

    public void setKDA(Double KDA) {
        this.KDA = KDA;
    }

    public Integer getMatch() {
        return match;
    }

    public void setMatch(Integer match) {
        this.match = match;
    }
}