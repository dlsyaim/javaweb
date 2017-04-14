package com.ks.monitor.pojo;

public class XmlSchemaAttributes {
    private Integer xml_component_id;

    private Integer xml_collection_id;

    private Integer xml_namespace_id;

    private Boolean is_qualified;

    private String name;

    private String symbol_space;

    private String symbol_space_desc;

    private String kind;

    private String kind_desc;

    private String derivation;

    private String derivation_desc;

    private Integer base_xml_component_id;

    private Integer scoping_xml_component_id;

    private Boolean is_default_fixed;

    private Boolean must_be_qualified;

    private String default_value;

    public Integer getXml_component_id() {
        return xml_component_id;
    }

    public void setXml_component_id(Integer xml_component_id) {
        this.xml_component_id = xml_component_id;
    }

    public Integer getXml_collection_id() {
        return xml_collection_id;
    }

    public void setXml_collection_id(Integer xml_collection_id) {
        this.xml_collection_id = xml_collection_id;
    }

    public Integer getXml_namespace_id() {
        return xml_namespace_id;
    }

    public void setXml_namespace_id(Integer xml_namespace_id) {
        this.xml_namespace_id = xml_namespace_id;
    }

    public Boolean getIs_qualified() {
        return is_qualified;
    }

    public void setIs_qualified(Boolean is_qualified) {
        this.is_qualified = is_qualified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSymbol_space() {
        return symbol_space;
    }

    public void setSymbol_space(String symbol_space) {
        this.symbol_space = symbol_space == null ? null : symbol_space.trim();
    }

    public String getSymbol_space_desc() {
        return symbol_space_desc;
    }

    public void setSymbol_space_desc(String symbol_space_desc) {
        this.symbol_space_desc = symbol_space_desc == null ? null : symbol_space_desc.trim();
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

    public String getDerivation() {
        return derivation;
    }

    public void setDerivation(String derivation) {
        this.derivation = derivation == null ? null : derivation.trim();
    }

    public String getDerivation_desc() {
        return derivation_desc;
    }

    public void setDerivation_desc(String derivation_desc) {
        this.derivation_desc = derivation_desc == null ? null : derivation_desc.trim();
    }

    public Integer getBase_xml_component_id() {
        return base_xml_component_id;
    }

    public void setBase_xml_component_id(Integer base_xml_component_id) {
        this.base_xml_component_id = base_xml_component_id;
    }

    public Integer getScoping_xml_component_id() {
        return scoping_xml_component_id;
    }

    public void setScoping_xml_component_id(Integer scoping_xml_component_id) {
        this.scoping_xml_component_id = scoping_xml_component_id;
    }

    public Boolean getIs_default_fixed() {
        return is_default_fixed;
    }

    public void setIs_default_fixed(Boolean is_default_fixed) {
        this.is_default_fixed = is_default_fixed;
    }

    public Boolean getMust_be_qualified() {
        return must_be_qualified;
    }

    public void setMust_be_qualified(Boolean must_be_qualified) {
        this.must_be_qualified = must_be_qualified;
    }

    public String getDefault_value() {
        return default_value;
    }

    public void setDefault_value(String default_value) {
        this.default_value = default_value == null ? null : default_value.trim();
    }
}