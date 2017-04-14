package com.ks.monitor.pojo;

public class AssemblyReferences {
    private Integer assembly_id;

    private Integer referenced_assembly_id;

    public Integer getAssembly_id() {
        return assembly_id;
    }

    public void setAssembly_id(Integer assembly_id) {
        this.assembly_id = assembly_id;
    }

    public Integer getReferenced_assembly_id() {
        return referenced_assembly_id;
    }

    public void setReferenced_assembly_id(Integer referenced_assembly_id) {
        this.referenced_assembly_id = referenced_assembly_id;
    }
}