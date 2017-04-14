package com.ks.monitor.pojo;

public class DmDbPartitionStats {
    private Long partition_id;

    private Integer object_id;

    private Integer index_id;

    private Integer partition_number;

    private Long in_row_data_page_count;

    private Long in_row_used_page_count;

    private Long in_row_reserved_page_count;

    private Long lob_used_page_count;

    private Long lob_reserved_page_count;

    private Long row_overflow_used_page_count;

    private Long row_overflow_reserved_page_count;

    private Long used_page_count;

    private Long reserved_page_count;

    private Long row_count;

    public Long getPartition_id() {
        return partition_id;
    }

    public void setPartition_id(Long partition_id) {
        this.partition_id = partition_id;
    }

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Integer getIndex_id() {
        return index_id;
    }

    public void setIndex_id(Integer index_id) {
        this.index_id = index_id;
    }

    public Integer getPartition_number() {
        return partition_number;
    }

    public void setPartition_number(Integer partition_number) {
        this.partition_number = partition_number;
    }

    public Long getIn_row_data_page_count() {
        return in_row_data_page_count;
    }

    public void setIn_row_data_page_count(Long in_row_data_page_count) {
        this.in_row_data_page_count = in_row_data_page_count;
    }

    public Long getIn_row_used_page_count() {
        return in_row_used_page_count;
    }

    public void setIn_row_used_page_count(Long in_row_used_page_count) {
        this.in_row_used_page_count = in_row_used_page_count;
    }

    public Long getIn_row_reserved_page_count() {
        return in_row_reserved_page_count;
    }

    public void setIn_row_reserved_page_count(Long in_row_reserved_page_count) {
        this.in_row_reserved_page_count = in_row_reserved_page_count;
    }

    public Long getLob_used_page_count() {
        return lob_used_page_count;
    }

    public void setLob_used_page_count(Long lob_used_page_count) {
        this.lob_used_page_count = lob_used_page_count;
    }

    public Long getLob_reserved_page_count() {
        return lob_reserved_page_count;
    }

    public void setLob_reserved_page_count(Long lob_reserved_page_count) {
        this.lob_reserved_page_count = lob_reserved_page_count;
    }

    public Long getRow_overflow_used_page_count() {
        return row_overflow_used_page_count;
    }

    public void setRow_overflow_used_page_count(Long row_overflow_used_page_count) {
        this.row_overflow_used_page_count = row_overflow_used_page_count;
    }

    public Long getRow_overflow_reserved_page_count() {
        return row_overflow_reserved_page_count;
    }

    public void setRow_overflow_reserved_page_count(Long row_overflow_reserved_page_count) {
        this.row_overflow_reserved_page_count = row_overflow_reserved_page_count;
    }

    public Long getUsed_page_count() {
        return used_page_count;
    }

    public void setUsed_page_count(Long used_page_count) {
        this.used_page_count = used_page_count;
    }

    public Long getReserved_page_count() {
        return reserved_page_count;
    }

    public void setReserved_page_count(Long reserved_page_count) {
        this.reserved_page_count = reserved_page_count;
    }

    public Long getRow_count() {
        return row_count;
    }

    public void setRow_count(Long row_count) {
        this.row_count = row_count;
    }
}