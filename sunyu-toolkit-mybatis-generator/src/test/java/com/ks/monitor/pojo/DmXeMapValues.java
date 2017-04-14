package com.ks.monitor.pojo;

public class DmXeMapValues {
    private String name;

    private String object_package_guid;

    private Integer map_key;

    private String map_value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getObject_package_guid() {
        return object_package_guid;
    }

    public void setObject_package_guid(String object_package_guid) {
        this.object_package_guid = object_package_guid == null ? null : object_package_guid.trim();
    }

    public Integer getMap_key() {
        return map_key;
    }

    public void setMap_key(Integer map_key) {
        this.map_key = map_key;
    }

    public String getMap_value() {
        return map_value;
    }

    public void setMap_value(String map_value) {
        this.map_value = map_value == null ? null : map_value.trim();
    }
}