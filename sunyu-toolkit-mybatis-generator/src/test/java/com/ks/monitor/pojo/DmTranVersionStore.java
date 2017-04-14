package com.ks.monitor.pojo;

public class DmTranVersionStore {
    private Long transaction_sequence_num;

    private Long version_sequence_num;

    private Short database_id;

    private Long rowset_id;

    private Byte status;

    private Short min_length_in_bytes;

    private Short record_length_first_part_in_bytes;

    private Short record_length_second_part_in_bytes;

    public Long getTransaction_sequence_num() {
        return transaction_sequence_num;
    }

    public void setTransaction_sequence_num(Long transaction_sequence_num) {
        this.transaction_sequence_num = transaction_sequence_num;
    }

    public Long getVersion_sequence_num() {
        return version_sequence_num;
    }

    public void setVersion_sequence_num(Long version_sequence_num) {
        this.version_sequence_num = version_sequence_num;
    }

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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Short getMin_length_in_bytes() {
        return min_length_in_bytes;
    }

    public void setMin_length_in_bytes(Short min_length_in_bytes) {
        this.min_length_in_bytes = min_length_in_bytes;
    }

    public Short getRecord_length_first_part_in_bytes() {
        return record_length_first_part_in_bytes;
    }

    public void setRecord_length_first_part_in_bytes(Short record_length_first_part_in_bytes) {
        this.record_length_first_part_in_bytes = record_length_first_part_in_bytes;
    }

    public Short getRecord_length_second_part_in_bytes() {
        return record_length_second_part_in_bytes;
    }

    public void setRecord_length_second_part_in_bytes(Short record_length_second_part_in_bytes) {
        this.record_length_second_part_in_bytes = record_length_second_part_in_bytes;
    }
}