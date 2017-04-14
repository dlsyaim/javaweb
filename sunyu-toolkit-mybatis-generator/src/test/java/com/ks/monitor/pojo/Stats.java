package com.ks.monitor.pojo;

public class Stats {
    private Integer object_id;

    private String name;

    private Integer stats_id;

    private Boolean auto_created;

    private Boolean user_created;

    private Boolean no_recompute;

    private Boolean has_filter;

    private String filter_definition;

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStats_id() {
        return stats_id;
    }

    public void setStats_id(Integer stats_id) {
        this.stats_id = stats_id;
    }

    public Boolean getAuto_created() {
        return auto_created;
    }

    public void setAuto_created(Boolean auto_created) {
        this.auto_created = auto_created;
    }

    public Boolean getUser_created() {
        return user_created;
    }

    public void setUser_created(Boolean user_created) {
        this.user_created = user_created;
    }

    public Boolean getNo_recompute() {
        return no_recompute;
    }

    public void setNo_recompute(Boolean no_recompute) {
        this.no_recompute = no_recompute;
    }

    public Boolean getHas_filter() {
        return has_filter;
    }

    public void setHas_filter(Boolean has_filter) {
        this.has_filter = has_filter;
    }

    public String getFilter_definition() {
        return filter_definition;
    }

    public void setFilter_definition(String filter_definition) {
        this.filter_definition = filter_definition == null ? null : filter_definition.trim();
    }
}