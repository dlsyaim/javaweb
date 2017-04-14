package com.ks.monitor.pojo;

public class Partitions {
    private Long partition_id;

    private Integer object_id;

    private Integer index_id;

    private Integer partition_number;

    private Long hobt_id;

    private Long rows;

    private Short filestream_filegroup_id;

    private Byte data_compression;

    private String data_compression_desc;

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

    public Long getHobt_id() {
        return hobt_id;
    }

    public void setHobt_id(Long hobt_id) {
        this.hobt_id = hobt_id;
    }

    public Long getRows() {
        return rows;
    }

    public void setRows(Long rows) {
        this.rows = rows;
    }

    public Short getFilestream_filegroup_id() {
        return filestream_filegroup_id;
    }

    public void setFilestream_filegroup_id(Short filestream_filegroup_id) {
        this.filestream_filegroup_id = filestream_filegroup_id;
    }

    public Byte getData_compression() {
        return data_compression;
    }

    public void setData_compression(Byte data_compression) {
        this.data_compression = data_compression;
    }

    public String getData_compression_desc() {
        return data_compression_desc;
    }

    public void setData_compression_desc(String data_compression_desc) {
        this.data_compression_desc = data_compression_desc == null ? null : data_compression_desc.trim();
    }
}