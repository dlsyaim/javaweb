package com.ks.monitor.pojo;

public class SpatialReferenceSystems {
    private Integer spatial_reference_id;

    private String authority_name;

    private Integer authorized_spatial_reference_id;

    private String well_known_text;

    private String unit_of_measure;

    private Double unit_conversion_factor;

    public Integer getSpatial_reference_id() {
        return spatial_reference_id;
    }

    public void setSpatial_reference_id(Integer spatial_reference_id) {
        this.spatial_reference_id = spatial_reference_id;
    }

    public String getAuthority_name() {
        return authority_name;
    }

    public void setAuthority_name(String authority_name) {
        this.authority_name = authority_name == null ? null : authority_name.trim();
    }

    public Integer getAuthorized_spatial_reference_id() {
        return authorized_spatial_reference_id;
    }

    public void setAuthorized_spatial_reference_id(Integer authorized_spatial_reference_id) {
        this.authorized_spatial_reference_id = authorized_spatial_reference_id;
    }

    public String getWell_known_text() {
        return well_known_text;
    }

    public void setWell_known_text(String well_known_text) {
        this.well_known_text = well_known_text == null ? null : well_known_text.trim();
    }

    public String getUnit_of_measure() {
        return unit_of_measure;
    }

    public void setUnit_of_measure(String unit_of_measure) {
        this.unit_of_measure = unit_of_measure == null ? null : unit_of_measure.trim();
    }

    public Double getUnit_conversion_factor() {
        return unit_conversion_factor;
    }

    public void setUnit_conversion_factor(Double unit_conversion_factor) {
        this.unit_conversion_factor = unit_conversion_factor;
    }
}