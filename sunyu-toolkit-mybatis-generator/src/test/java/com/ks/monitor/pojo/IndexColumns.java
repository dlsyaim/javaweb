package com.ks.monitor.pojo;

public class IndexColumns {
    private Integer object_id;

    private Integer index_id;

    private Integer index_column_id;

    private Integer column_id;

    private Byte key_ordinal;

    private Byte partition_ordinal;

    private Boolean is_descending_key;

    private Boolean is_included_column;

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

    public Integer getIndex_column_id() {
        return index_column_id;
    }

    public void setIndex_column_id(Integer index_column_id) {
        this.index_column_id = index_column_id;
    }

    public Integer getColumn_id() {
        return column_id;
    }

    public void setColumn_id(Integer column_id) {
        this.column_id = column_id;
    }

    public Byte getKey_ordinal() {
        return key_ordinal;
    }

    public void setKey_ordinal(Byte key_ordinal) {
        this.key_ordinal = key_ordinal;
    }

    public Byte getPartition_ordinal() {
        return partition_ordinal;
    }

    public void setPartition_ordinal(Byte partition_ordinal) {
        this.partition_ordinal = partition_ordinal;
    }

    public Boolean getIs_descending_key() {
        return is_descending_key;
    }

    public void setIs_descending_key(Boolean is_descending_key) {
        this.is_descending_key = is_descending_key;
    }

    public Boolean getIs_included_column() {
        return is_included_column;
    }

    public void setIs_included_column(Boolean is_included_column) {
        this.is_included_column = is_included_column;
    }
}