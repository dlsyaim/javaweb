package com.ks.monitor.pojo;

public class DmOsLoadedModules {
    private String file_version;

    private String product_version;

    private Boolean debug;

    private Boolean patched;

    private Boolean prerelease;

    private Boolean private_build;

    private Boolean special_build;

    private Integer language;

    private String company;

    private String description;

    private String name;

    private byte[] base_address;

    public String getFile_version() {
        return file_version;
    }

    public void setFile_version(String file_version) {
        this.file_version = file_version == null ? null : file_version.trim();
    }

    public String getProduct_version() {
        return product_version;
    }

    public void setProduct_version(String product_version) {
        this.product_version = product_version == null ? null : product_version.trim();
    }

    public Boolean getDebug() {
        return debug;
    }

    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    public Boolean getPatched() {
        return patched;
    }

    public void setPatched(Boolean patched) {
        this.patched = patched;
    }

    public Boolean getPrerelease() {
        return prerelease;
    }

    public void setPrerelease(Boolean prerelease) {
        this.prerelease = prerelease;
    }

    public Boolean getPrivate_build() {
        return private_build;
    }

    public void setPrivate_build(Boolean private_build) {
        this.private_build = private_build;
    }

    public Boolean getSpecial_build() {
        return special_build;
    }

    public void setSpecial_build(Boolean special_build) {
        this.special_build = special_build;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public byte[] getBase_address() {
        return base_address;
    }

    public void setBase_address(byte[] base_address) {
        this.base_address = base_address;
    }
}