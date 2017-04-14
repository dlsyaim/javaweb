package com.ks.monitor.pojo;

public class XmlIndexes {
    private Integer object_id;

    private String name;

    private Integer index_id;

    private Byte type;

    private String type_desc;

    private Boolean is_unique;

    private Integer data_space_id;

    private Boolean ignore_dup_key;

    private Boolean is_primary_key;

    private Boolean is_unique_constraint;

    private Byte fill_factor;

    private Boolean is_padded;

    private Boolean is_disabled;

    private Boolean is_hypothetical;

    private Boolean allow_row_locks;

    private Boolean allow_page_locks;

    private Integer using_xml_index_id;

    private String secondary_type;

    private String secondary_type_desc;

    private Boolean has_filter;

    private String filter_definition;

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getIndex_id() {
        return index_id;
    }

    public void setIndex_id(Integer index_id) {
        this.index_id = index_id;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getType_desc() {
        return type_desc;
    }

    public void setType_desc(String type_desc) {
        this.type_desc = type_desc == null ? null : type_desc.trim();
    }

    public Boolean getIs_unique() {
        return is_unique;
    }

    public void setIs_unique(Boolean is_unique) {
        this.is_unique = is_unique;
    }

    public Integer getData_space_id() {
        return data_space_id;
    }

    public void setData_space_id(Integer data_space_id) {
        this.data_space_id = data_space_id;
    }

    public Boolean getIgnore_dup_key() {
        return ignore_dup_key;
    }

    public void setIgnore_dup_key(Boolean ignore_dup_key) {
        this.ignore_dup_key = ignore_dup_key;
    }

    public Boolean getIs_primary_key() {
        return is_primary_key;
    }

    public void setIs_primary_key(Boolean is_primary_key) {
        this.is_primary_key = is_primary_key;
    }

    public Boolean getIs_unique_constraint() {
        return is_unique_constraint;
    }

    public void setIs_unique_constraint(Boolean is_unique_constraint) {
        this.is_unique_constraint = is_unique_constraint;
    }

    public Byte getFill_factor() {
        return fill_factor;
    }

    public void setFill_factor(Byte fill_factor) {
        this.fill_factor = fill_factor;
    }

    public Boolean getIs_padded() {
        return is_padded;
    }

    public void setIs_padded(Boolean is_padded) {
        this.is_padded = is_padded;
    }

    public Boolean getIs_disabled() {
        return is_disabled;
    }

    public void setIs_disabled(Boolean is_disabled) {
        this.is_disabled = is_disabled;
    }

    public Boolean getIs_hypothetical() {
        return is_hypothetical;
    }

    public void setIs_hypothetical(Boolean is_hypothetical) {
        this.is_hypothetical = is_hypothetical;
    }

    public Boolean getAllow_row_locks() {
        return allow_row_locks;
    }

    public void setAllow_row_locks(Boolean allow_row_locks) {
        this.allow_row_locks = allow_row_locks;
    }

    public Boolean getAllow_page_locks() {
        return allow_page_locks;
    }

    public void setAllow_page_locks(Boolean allow_page_locks) {
        this.allow_page_locks = allow_page_locks;
    }

    public Integer getUsing_xml_index_id() {
        return using_xml_index_id;
    }

    public void setUsing_xml_index_id(Integer using_xml_index_id) {
        this.using_xml_index_id = using_xml_index_id;
    }

    public String getSecondary_type() {
        return secondary_type;
    }

    public void setSecondary_type(String secondary_type) {
        this.secondary_type = secondary_type == null ? null : secondary_type.trim();
    }

    public String getSecondary_type_desc() {
        return secondary_type_desc;
    }

    public void setSecondary_type_desc(String secondary_type_desc) {
        this.secondary_type_desc = secondary_type_desc == null ? null : secondary_type_desc.trim();
    }

    public Boolean getHas_filter() {
        return has_filter;
    }

    public void setHas_filter(Boolean has_filter) {
        this.has_filter = has_filter;
    }

    public String getFilter_definition() {
        return filter_definition;
    }

    public void setFilter_definition(String filter_definition) {
        this.filter_definition = filter_definition == null ? null : filter_definition.trim();
    }
}