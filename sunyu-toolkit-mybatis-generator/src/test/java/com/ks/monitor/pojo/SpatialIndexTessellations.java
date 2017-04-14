package com.ks.monitor.pojo;

public class SpatialIndexTessellations {
    private Integer object_id;

    private Integer index_id;

    private String tessellation_scheme;

    private Double bounding_box_xmin;

    private Double bounding_box_ymin;

    private Double bounding_box_xmax;

    private Double bounding_box_ymax;

    private Short level_1_grid;

    private String level_1_grid_desc;

    private Short level_2_grid;

    private String level_2_grid_desc;

    private Short level_3_grid;

    private String level_3_grid_desc;

    private Short level_4_grid;

    private String level_4_grid_desc;

    private Integer cells_per_object;

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Integer getIndex_id() {
        return index_id;
    }

    public void setIndex_id(Integer index_id) {
        this.index_id = index_id;
    }

    public String getTessellation_scheme() {
        return tessellation_scheme;
    }

    public void setTessellation_scheme(String tessellation_scheme) {
        this.tessellation_scheme = tessellation_scheme == null ? null : tessellation_scheme.trim();
    }

    public Double getBounding_box_xmin() {
        return bounding_box_xmin;
    }

    public void setBounding_box_xmin(Double bounding_box_xmin) {
        this.bounding_box_xmin = bounding_box_xmin;
    }

    public Double getBounding_box_ymin() {
        return bounding_box_ymin;
    }

    public void setBounding_box_ymin(Double bounding_box_ymin) {
        this.bounding_box_ymin = bounding_box_ymin;
    }

    public Double getBounding_box_xmax() {
        return bounding_box_xmax;
    }

    public void setBounding_box_xmax(Double bounding_box_xmax) {
        this.bounding_box_xmax = bounding_box_xmax;
    }

    public Double getBounding_box_ymax() {
        return bounding_box_ymax;
    }

    public void setBounding_box_ymax(Double bounding_box_ymax) {
        this.bounding_box_ymax = bounding_box_ymax;
    }

    public Short getLevel_1_grid() {
        return level_1_grid;
    }

    public void setLevel_1_grid(Short level_1_grid) {
        this.level_1_grid = level_1_grid;
    }

    public String getLevel_1_grid_desc() {
        return level_1_grid_desc;
    }

    public void setLevel_1_grid_desc(String level_1_grid_desc) {
        this.level_1_grid_desc = level_1_grid_desc == null ? null : level_1_grid_desc.trim();
    }

    public Short getLevel_2_grid() {
        return level_2_grid;
    }

    public void setLevel_2_grid(Short level_2_grid) {
        this.level_2_grid = level_2_grid;
    }

    public String getLevel_2_grid_desc() {
        return level_2_grid_desc;
    }

    public void setLevel_2_grid_desc(String level_2_grid_desc) {
        this.level_2_grid_desc = level_2_grid_desc == null ? null : level_2_grid_desc.trim();
    }

    public Short getLevel_3_grid() {
        return level_3_grid;
    }

    public void setLevel_3_grid(Short level_3_grid) {
        this.level_3_grid = level_3_grid;
    }

    public String getLevel_3_grid_desc() {
        return level_3_grid_desc;
    }

    public void setLevel_3_grid_desc(String level_3_grid_desc) {
        this.level_3_grid_desc = level_3_grid_desc == null ? null : level_3_grid_desc.trim();
    }

    public Short getLevel_4_grid() {
        return level_4_grid;
    }

    public void setLevel_4_grid(Short level_4_grid) {
        this.level_4_grid = level_4_grid;
    }

    public String getLevel_4_grid_desc() {
        return level_4_grid_desc;
    }

    public void setLevel_4_grid_desc(String level_4_grid_desc) {
        this.level_4_grid_desc = level_4_grid_desc == null ? null : level_4_grid_desc.trim();
    }

    public Integer getCells_per_object() {
        return cells_per_object;
    }

    public void setCells_per_object(Integer cells_per_object) {
        this.cells_per_object = cells_per_object;
    }
}