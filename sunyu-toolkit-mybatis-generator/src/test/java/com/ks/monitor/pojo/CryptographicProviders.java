package com.ks.monitor.pojo;

public class CryptographicProviders {
    private Integer provider_id;

    private String name;

    private String guid;

    private String version;

    private String dll_path;

    private Boolean is_enabled;

    public Integer getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(Integer provider_id) {
        this.provider_id = provider_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getDll_path() {
        return dll_path;
    }

    public void setDll_path(String dll_path) {
        this.dll_path = dll_path == null ? null : dll_path.trim();
    }

    public Boolean getIs_enabled() {
        return is_enabled;
    }

    public void setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
    }
}