package com.ks.monitor.pojo;

public class DmTranTopVersionGenerators {
    private Short database_id;

    private Long rowset_id;

    private Integer aggregated_record_length_in_bytes;

    public Short getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Short database_id) {
        this.database_id = database_id;
    }

    public Long getRowset_id() {
        return rowset_id;
    }

    public void setRowset_id(Long rowset_id) {
        this.rowset_id = rowset_id;
    }

    public Integer getAggregated_record_length_in_bytes() {
        return aggregated_record_length_in_bytes;
    }

    public void setAggregated_record_length_in_bytes(Integer aggregated_record_length_in_bytes) {
        this.aggregated_record_length_in_bytes = aggregated_record_length_in_bytes;
    }
}