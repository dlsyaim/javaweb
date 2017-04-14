package com.ks.monitor.pojo;

public class DmExecCachedPlanDependentObjects {
    private Integer usecounts;

    private String cacheobjtype;

    private byte[] memory_object_address;

    public Integer getUsecounts() {
        return usecounts;
    }

    public void setUsecounts(Integer usecounts) {
        this.usecounts = usecounts;
    }

    public String getCacheobjtype() {
        return cacheobjtype;
    }

    public void setCacheobjtype(String cacheobjtype) {
        this.cacheobjtype = cacheobjtype == null ? null : cacheobjtype.trim();
    }

    public byte[] getMemory_object_address() {
        return memory_object_address;
    }

    public void setMemory_object_address(byte[] memory_object_address) {
        this.memory_object_address = memory_object_address;
    }
}