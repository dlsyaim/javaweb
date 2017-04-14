package com.ks.monitor.pojo;

public class FnVirtualfilestats {
    private Short dbId;

    private Short fileId;

    private Integer timeStamp;

    private Long numberReads;

    private Long bytesRead;

    private Long ioStallReadMS;

    private Long numberWrites;

    private Long bytesWritten;

    private Long ioStallWriteMS;

    private Long ioStallMS;

    private Long bytesOnDisk;

    private byte[] fileHandle;

    public Short getDbId() {
        return dbId;
    }

    public void setDbId(Short dbId) {
        this.dbId = dbId;
    }

    public Short getFileId() {
        return fileId;
    }

    public void setFileId(Short fileId) {
        this.fileId = fileId;
    }

    public Integer getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Integer timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getNumberReads() {
        return numberReads;
    }

    public void setNumberReads(Long numberReads) {
        this.numberReads = numberReads;
    }

    public Long getBytesRead() {
        return bytesRead;
    }

    public void setBytesRead(Long bytesRead) {
        this.bytesRead = bytesRead;
    }

    public Long getIoStallReadMS() {
        return ioStallReadMS;
    }

    public void setIoStallReadMS(Long ioStallReadMS) {
        this.ioStallReadMS = ioStallReadMS;
    }

    public Long getNumberWrites() {
        return numberWrites;
    }

    public void setNumberWrites(Long numberWrites) {
        this.numberWrites = numberWrites;
    }

    public Long getBytesWritten() {
        return bytesWritten;
    }

    public void setBytesWritten(Long bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    public Long getIoStallWriteMS() {
        return ioStallWriteMS;
    }

    public void setIoStallWriteMS(Long ioStallWriteMS) {
        this.ioStallWriteMS = ioStallWriteMS;
    }

    public Long getIoStallMS() {
        return ioStallMS;
    }

    public void setIoStallMS(Long ioStallMS) {
        this.ioStallMS = ioStallMS;
    }

    public Long getBytesOnDisk() {
        return bytesOnDisk;
    }

    public void setBytesOnDisk(Long bytesOnDisk) {
        this.bytesOnDisk = bytesOnDisk;
    }

    public byte[] getFileHandle() {
        return fileHandle;
    }

    public void setFileHandle(byte[] fileHandle) {
        this.fileHandle = fileHandle;
    }
}