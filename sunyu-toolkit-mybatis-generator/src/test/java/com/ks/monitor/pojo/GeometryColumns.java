package com.ks.monitor.pojo;

public class GeometryColumns extends GeometryColumnsKey {
    private Integer coord_dimension;

    private Integer srid;

    private String geometry_type;

    public Integer getCoord_dimension() {
        return coord_dimension;
    }

    public void setCoord_dimension(Integer coord_dimension) {
        this.coord_dimension = coord_dimension;
    }

    public Integer getSrid() {
        return srid;
    }

    public void setSrid(Integer srid) {
        this.srid = srid;
    }

    public String getGeometry_type() {
        return geometry_type;
    }

    public void setGeometry_type(String geometry_type) {
        this.geometry_type = geometry_type == null ? null : geometry_type.trim();
    }
}