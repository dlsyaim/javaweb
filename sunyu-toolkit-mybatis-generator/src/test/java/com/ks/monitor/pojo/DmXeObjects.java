package com.ks.monitor.pojo;

public class DmXeObjects {
    private String name;

    private String object_type;

    private String package_guid;

    private String description;

    private Integer capabilities;

    private String capabilities_desc;

    private String type_name;

    private String type_package_guid;

    private Integer type_size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type == null ? null : object_type.trim();
    }

    public String getPackage_guid() {
        return package_guid;
    }

    public void setPackage_guid(String package_guid) {
        this.package_guid = package_guid == null ? null : package_guid.trim();
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

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name == null ? null : type_name.trim();
    }

    public String getType_package_guid() {
        return type_package_guid;
    }

    public void setType_package_guid(String type_package_guid) {
        this.type_package_guid = type_package_guid == null ? null : type_package_guid.trim();
    }

    public Integer getType_size() {
        return type_size;
    }

    public void setType_size(Integer type_size) {
        this.type_size = type_size;
    }
}