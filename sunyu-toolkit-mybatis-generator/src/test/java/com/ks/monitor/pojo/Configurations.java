package com.ks.monitor.pojo;

public class Configurations {
    private Integer configuration_id;

    private String name;

    private String value;

    private String minimum;

    private String maximum;

    private String value_in_use;

    private String description;

    private Boolean is_dynamic;

    private Boolean is_advanced;

    public Integer getConfiguration_id() {
        return configuration_id;
    }

    public void setConfiguration_id(Integer configuration_id) {
        this.configuration_id = configuration_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum == null ? null : minimum.trim();
    }

    public String getMaximum() {
        return maximum;
    }

    public void setMaximum(String maximum) {
        this.maximum = maximum == null ? null : maximum.trim();
    }

    public String getValue_in_use() {
        return value_in_use;
    }

    public void setValue_in_use(String value_in_use) {
        this.value_in_use = value_in_use == null ? null : value_in_use.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Boolean getIs_dynamic() {
        return is_dynamic;
    }

    public void setIs_dynamic(Boolean is_dynamic) {
        this.is_dynamic = is_dynamic;
    }

    public Boolean getIs_advanced() {
        return is_advanced;
    }

    public void setIs_advanced(Boolean is_advanced) {
        this.is_advanced = is_advanced;
    }
}