package com.ks.monitor.pojo;

public class StatsColumns {
    private Integer object_id;

    private Integer stats_id;

    private Integer stats_column_id;

    private Integer column_id;

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Integer getStats_id() {
        return stats_id;
    }

    public void setStats_id(Integer stats_id) {
        this.stats_id = stats_id;
    }

    public Integer getStats_column_id() {
        return stats_column_id;
    }

    public void setStats_column_id(Integer stats_column_id) {
        this.stats_column_id = stats_column_id;
    }

    public Integer getColumn_id() {
        return column_id;
    }

    public void setColumn_id(Integer column_id) {
        this.column_id = column_id;
    }
}