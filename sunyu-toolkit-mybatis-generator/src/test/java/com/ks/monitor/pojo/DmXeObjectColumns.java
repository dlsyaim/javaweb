package com.ks.monitor.pojo;

public class DmXeObjectColumns {
    private String name;

    private Integer column_id;

    private String object_name;

    private String object_package_guid;

    private String type_name;

    private String type_package_guid;

    private String column_type;

    private String column_value;

    private Integer capabilities;

    private String capabilities_desc;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getColumn_id() {
        return column_id;
    }

    public void setColumn_id(Integer column_id) {
        this.column_id = column_id;
    }

    public String getObject_name() {
        return object_name;
    }

    public void setObject_name(String object_name) {
        this.object_name = object_name == null ? null : object_name.trim();
    }

    public String getObject_package_guid() {
        return object_package_guid;
    }

    public void setObject_package_guid(String object_package_guid) {
        this.object_package_guid = object_package_guid == null ? null : object_package_guid.trim();
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

    public String getColumn_type() {
        return column_type;
    }

    public void setColumn_type(String column_type) {
        this.column_type = column_type == null ? null : column_type.trim();
    }

    public String getColumn_value() {
        return column_value;
    }

    public void setColumn_value(String column_value) {
        this.column_value = column_value == null ? null : column_value.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}