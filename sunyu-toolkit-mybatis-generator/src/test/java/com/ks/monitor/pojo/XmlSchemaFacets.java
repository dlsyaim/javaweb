package com.ks.monitor.pojo;

public class XmlSchemaFacets {
    private Integer xml_component_id;

    private Integer facet_id;

    private String kind;

    private String kind_desc;

    private Boolean is_fixed;

    private String value;

    public Integer getXml_component_id() {
        return xml_component_id;
    }

    public void setXml_component_id(Integer xml_component_id) {
        this.xml_component_id = xml_component_id;
    }

    public Integer getFacet_id() {
        return facet_id;
    }

    public void setFacet_id(Integer facet_id) {
        this.facet_id = facet_id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public String getKind_desc() {
        return kind_desc;
    }

    public void setKind_desc(String kind_desc) {
        this.kind_desc = kind_desc == null ? null : kind_desc.trim();
    }

    public Boolean getIs_fixed() {
        return is_fixed;
    }

    public void setIs_fixed(Boolean is_fixed) {
        this.is_fixed = is_fixed;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}