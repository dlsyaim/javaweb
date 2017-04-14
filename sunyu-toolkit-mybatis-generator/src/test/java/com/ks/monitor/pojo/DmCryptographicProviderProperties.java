package com.ks.monitor.pojo;

public class DmCryptographicProviderProperties {
    private Integer provider_id;

    private String guid;

    private String provider_version;

    private String sqlcrypt_version;

    private String friendly_name;

    private String authentication_type;

    private Byte symmetric_key_support;

    private Byte symmetric_key_persistance;

    private Byte symmetric_key_export;

    private Byte symmetric_key_import;

    private Byte asymmetric_key_support;

    private Byte asymmetric_key_persistance;

    private Byte asymmetric_key_export;

    private Byte asymmetric_key_import;

    public Integer getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(Integer provider_id) {
        this.provider_id = provider_id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getProvider_version() {
        return provider_version;
    }

    public void setProvider_version(String provider_version) {
        this.provider_version = provider_version == null ? null : provider_version.trim();
    }

    public String getSqlcrypt_version() {
        return sqlcrypt_version;
    }

    public void setSqlcrypt_version(String sqlcrypt_version) {
        this.sqlcrypt_version = sqlcrypt_version == null ? null : sqlcrypt_version.trim();
    }

    public String getFriendly_name() {
        return friendly_name;
    }

    public void setFriendly_name(String friendly_name) {
        this.friendly_name = friendly_name == null ? null : friendly_name.trim();
    }

    public String getAuthentication_type() {
        return authentication_type;
    }

    public void setAuthentication_type(String authentication_type) {
        this.authentication_type = authentication_type == null ? null : authentication_type.trim();
    }

    public Byte getSymmetric_key_support() {
        return symmetric_key_support;
    }

    public void setSymmetric_key_support(Byte symmetric_key_support) {
        this.symmetric_key_support = symmetric_key_support;
    }

    public Byte getSymmetric_key_persistance() {
        return symmetric_key_persistance;
    }

    public void setSymmetric_key_persistance(Byte symmetric_key_persistance) {
        this.symmetric_key_persistance = symmetric_key_persistance;
    }

    public Byte getSymmetric_key_export() {
        return symmetric_key_export;
    }

    public void setSymmetric_key_export(Byte symmetric_key_export) {
        this.symmetric_key_export = symmetric_key_export;
    }

    public Byte getSymmetric_key_import() {
        return symmetric_key_import;
    }

    public void setSymmetric_key_import(Byte symmetric_key_import) {
        this.symmetric_key_import = symmetric_key_import;
    }

    public Byte getAsymmetric_key_support() {
        return asymmetric_key_support;
    }

    public void setAsymmetric_key_support(Byte asymmetric_key_support) {
        this.asymmetric_key_support = asymmetric_key_support;
    }

    public Byte getAsymmetric_key_persistance() {
        return asymmetric_key_persistance;
    }

    public void setAsymmetric_key_persistance(Byte asymmetric_key_persistance) {
        this.asymmetric_key_persistance = asymmetric_key_persistance;
    }

    public Byte getAsymmetric_key_export() {
        return asymmetric_key_export;
    }

    public void setAsymmetric_key_export(Byte asymmetric_key_export) {
        this.asymmetric_key_export = asymmetric_key_export;
    }

    public Byte getAsymmetric_key_import() {
        return asymmetric_key_import;
    }

    public void setAsymmetric_key_import(Byte asymmetric_key_import) {
        this.asymmetric_key_import = asymmetric_key_import;
    }
}