package com.ks.monitor.pojo;

public class XmlSchemaComponentPlacements {
    private Integer xml_component_id;

    private Integer placement_id;

    private Integer placed_xml_component_id;

    private Boolean is_default_fixed;

    private Integer min_occurences;

    private Integer max_occurences;

    private String default_value;

    public Integer getXml_component_id() {
        return xml_component_id;
    }

    public void setXml_component_id(Integer xml_component_id) {
        this.xml_component_id = xml_component_id;
    }

    public Integer getPlacement_id() {
        return placement_id;
    }

    public void setPlacement_id(Integer placement_id) {
        this.placement_id = placement_id;
    }

    public Integer getPlaced_xml_component_id() {
        return placed_xml_component_id;
    }

    public void setPlaced_xml_component_id(Integer placed_xml_component_id) {
        this.placed_xml_component_id = placed_xml_component_id;
    }

    public Boolean getIs_default_fixed() {
        return is_default_fixed;
    }

    public void setIs_default_fixed(Boolean is_default_fixed) {
        this.is_default_fixed = is_default_fixed;
    }

    public Integer getMin_occurences() {
        return min_occurences;
    }

    public void setMin_occurences(Integer min_occurences) {
        this.min_occurences = min_occurences;
    }

    public Integer getMax_occurences() {
        return max_occurences;
    }

    public void setMax_occurences(Integer max_occurences) {
        this.max_occurences = max_occurences;
    }

    public String getDefault_value() {
        return default_value;
    }

    public void setDefault_value(String default_value) {
        this.default_value = default_value == null ? null : default_value.trim();
    }
}