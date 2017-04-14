package com.ks.monitor.pojo;

public class AssemblyFiles {
    private Integer assembly_id;

    private String name;

    private Integer file_id;

    private byte[] content;

    public Integer getAssembly_id() {
        return assembly_id;
    }

    public void setAssembly_id(Integer assembly_id) {
        this.assembly_id = assembly_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFile_id() {
        return file_id;
    }

    public void setFile_id(Integer file_id) {
        this.file_id = file_id;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}