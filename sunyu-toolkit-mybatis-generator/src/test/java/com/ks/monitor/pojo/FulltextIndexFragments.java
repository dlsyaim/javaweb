package com.ks.monitor.pojo;

public class FulltextIndexFragments {
    private Integer table_id;

    private Integer fragment_id;

    private Integer fragment_object_id;

    private Integer status;

    private Long data_size;

    private Long row_count;

    private byte[] timestamp;

    public Integer getTable_id() {
        return table_id;
    }

    public void setTable_id(Integer table_id) {
        this.table_id = table_id;
    }

    public Integer getFragment_id() {
        return fragment_id;
    }

    public void setFragment_id(Integer fragment_id) {
        this.fragment_id = fragment_id;
    }

    public Integer getFragment_object_id() {
        return fragment_object_id;
    }

    public void setFragment_object_id(Integer fragment_object_id) {
        this.fragment_object_id = fragment_object_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getData_size() {
        return data_size;
    }

    public void setData_size(Long data_size) {
        this.data_size = data_size;
    }

    public Long getRow_count() {
        return row_count;
    }

    public void setRow_count(Long row_count) {
        this.row_count = row_count;
    }

    public byte[] getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(byte[] timestamp) {
        this.timestamp = timestamp;
    }
}