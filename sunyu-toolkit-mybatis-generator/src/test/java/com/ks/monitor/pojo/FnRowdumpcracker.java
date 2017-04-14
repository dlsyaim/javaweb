package com.ks.monitor.pojo;

public class FnRowdumpcracker {
    private Long partition_id;

    private String colName;

    private Boolean isInrow;

    private Boolean isSparse;

    private Boolean isRecordPrefixCompressed;

    private Boolean isSymbol;

    private Integer prefixBytes;

    private Integer inRowLength;

    public Long getPartition_id() {
        return partition_id;
    }

    public void setPartition_id(Long partition_id) {
        this.partition_id = partition_id;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName == null ? null : colName.trim();
    }

    public Boolean getIsInrow() {
        return isInrow;
    }

    public void setIsInrow(Boolean isInrow) {
        this.isInrow = isInrow;
    }

    public Boolean getIsSparse() {
        return isSparse;
    }

    public void setIsSparse(Boolean isSparse) {
        this.isSparse = isSparse;
    }

    public Boolean getIsRecordPrefixCompressed() {
        return isRecordPrefixCompressed;
    }

    public void setIsRecordPrefixCompressed(Boolean isRecordPrefixCompressed) {
        this.isRecordPrefixCompressed = isRecordPrefixCompressed;
    }

    public Boolean getIsSymbol() {
        return isSymbol;
    }

    public void setIsSymbol(Boolean isSymbol) {
        this.isSymbol = isSymbol;
    }

    public Integer getPrefixBytes() {
        return prefixBytes;
    }

    public void setPrefixBytes(Integer prefixBytes) {
        this.prefixBytes = prefixBytes;
    }

    public Integer getInRowLength() {
        return inRowLength;
    }

    public void setInRowLength(Integer inRowLength) {
        this.inRowLength = inRowLength;
    }
}