package com.ks.monitor.pojo;

public class FulltextCatalogs {
    private Integer fulltext_catalog_id;

    private String name;

    private String path;

    private Boolean is_default;

    private Boolean is_accent_sensitivity_on;

    private Integer data_space_id;

    private Integer file_id;

    private Integer principal_id;

    private Boolean is_importing;

    public Integer getFulltext_catalog_id() {
        return fulltext_catalog_id;
    }

    public void setFulltext_catalog_id(Integer fulltext_catalog_id) {
        this.fulltext_catalog_id = fulltext_catalog_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Boolean getIs_default() {
        return is_default;
    }

    public void setIs_default(Boolean is_default) {
        this.is_default = is_default;
    }

    public Boolean getIs_accent_sensitivity_on() {
        return is_accent_sensitivity_on;
    }

    public void setIs_accent_sensitivity_on(Boolean is_accent_sensitivity_on) {
        this.is_accent_sensitivity_on = is_accent_sensitivity_on;
    }

    public Integer getData_space_id() {
        return data_space_id;
    }

    public void setData_space_id(Integer data_space_id) {
        this.data_space_id = data_space_id;
    }

    public Integer getFile_id() {
        return file_id;
    }

    public void setFile_id(Integer file_id) {
        this.file_id = file_id;
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }

    public Boolean getIs_importing() {
        return is_importing;
    }

    public void setIs_importing(Boolean is_importing) {
        this.is_importing = is_importing;
    }
}