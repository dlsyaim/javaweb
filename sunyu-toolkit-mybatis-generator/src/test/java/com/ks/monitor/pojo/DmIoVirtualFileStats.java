package com.ks.monitor.pojo;

public class DmIoVirtualFileStats {
    private Short database_id;

    private Short file_id;

    private Integer sample_ms;

    private Long num_of_reads;

    private Long num_of_bytes_read;

    private Long io_stall_read_ms;

    private Long num_of_writes;

    private Long num_of_bytes_written;

    private Long io_stall_write_ms;

    private Long io_stall;

    private Long size_on_disk_bytes;

    private byte[] file_handle;

    public Short getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Short database_id) {
        this.database_id = database_id;
    }

    public Short getFile_id() {
        return file_id;
    }

    public void setFile_id(Short file_id) {
        this.file_id = file_id;
    }

    public Integer getSample_ms() {
        return sample_ms;
    }

    public void setSample_ms(Integer sample_ms) {
        this.sample_ms = sample_ms;
    }

    public Long getNum_of_reads() {
        return num_of_reads;
    }

    public void setNum_of_reads(Long num_of_reads) {
        this.num_of_reads = num_of_reads;
    }

    public Long getNum_of_bytes_read() {
        return num_of_bytes_read;
    }

    public void setNum_of_bytes_read(Long num_of_bytes_read) {
        this.num_of_bytes_read = num_of_bytes_read;
    }

    public Long getIo_stall_read_ms() {
        return io_stall_read_ms;
    }

    public void setIo_stall_read_ms(Long io_stall_read_ms) {
        this.io_stall_read_ms = io_stall_read_ms;
    }

    public Long getNum_of_writes() {
        return num_of_writes;
    }

    public void setNum_of_writes(Long num_of_writes) {
        this.num_of_writes = num_of_writes;
    }

    public Long getNum_of_bytes_written() {
        return num_of_bytes_written;
    }

    public void setNum_of_bytes_written(Long num_of_bytes_written) {
        this.num_of_bytes_written = num_of_bytes_written;
    }

    public Long getIo_stall_write_ms() {
        return io_stall_write_ms;
    }

    public void setIo_stall_write_ms(Long io_stall_write_ms) {
        this.io_stall_write_ms = io_stall_write_ms;
    }

    public Long getIo_stall() {
        return io_stall;
    }

    public void setIo_stall(Long io_stall) {
        this.io_stall = io_stall;
    }

    public Long getSize_on_disk_bytes() {
        return size_on_disk_bytes;
    }

    public void setSize_on_disk_bytes(Long size_on_disk_bytes) {
        this.size_on_disk_bytes = size_on_disk_bytes;
    }

    public byte[] getFile_handle() {
        return file_handle;
    }

    public void setFile_handle(byte[] file_handle) {
        this.file_handle = file_handle;
    }
}