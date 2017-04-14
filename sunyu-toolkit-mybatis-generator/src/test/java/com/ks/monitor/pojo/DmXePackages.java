package com.ks.monitor.pojo;

public class DmXePackages {
    private String name;

    private String guid;

    private String description;

    private Integer capabilities;

    private String capabilities_desc;

    private String module_guid;

    private byte[] module_address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Integer capabilities) {
        this.capabilities = capabilities;
    }

    public String getCapabilities_desc() {
        return capabilities_desc;
    }

    public void setCapabilities_desc(String capabilities_desc) {
        this.capabilities_desc = capabilities_desc == null ? null : capabilities_desc.trim();
    }

    public String getModule_guid() {
        return module_guid;
    }

    public void setModule_guid(String module_guid) {
        this.module_guid = module_guid == null ? null : module_guid.trim();
    }

    public byte[] getModule_address() {
        return module_address;
    }

    public void setModule_address(byte[] module_address) {
        this.module_address = module_address;
    }
}