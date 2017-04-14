package com.ks.monitor.pojo;

public class DatabaseMirroringWitnesses {
    private String database_name;

    private String principal_server_name;

    private String mirror_server_name;

    private Byte safety_level;

    private String safety_level_desc;

    private Integer safety_sequence_number;

    private Integer role_sequence_number;

    private String mirroring_guid;

    private String family_guid;

    private Boolean is_suspended;

    private Integer is_suspended_sequence_number;

    private Byte partner_sync_state;

    private String partner_sync_state_desc;

    public String getDatabase_name() {
        return database_name;
    }

    public void setDatabase_name(String database_name) {
        this.database_name = database_name == null ? null : database_name.trim();
    }

    public String getPrincipal_server_name() {
        return principal_server_name;
    }

    public void setPrincipal_server_name(String principal_server_name) {
        this.principal_server_name = principal_server_name == null ? null : principal_server_name.trim();
    }

    public String getMirror_server_name() {
        return mirror_server_name;
    }

    public void setMirror_server_name(String mirror_server_name) {
        this.mirror_server_name = mirror_server_name == null ? null : mirror_server_name.trim();
    }

    public Byte getSafety_level() {
        return safety_level;
    }

    public void setSafety_level(Byte safety_level) {
        this.safety_level = safety_level;
    }

    public String getSafety_level_desc() {
        return safety_level_desc;
    }

    public void setSafety_level_desc(String safety_level_desc) {
        this.safety_level_desc = safety_level_desc == null ? null : safety_level_desc.trim();
    }

    public Integer getSafety_sequence_number() {
        return safety_sequence_number;
    }

    public void setSafety_sequence_number(Integer safety_sequence_number) {
        this.safety_sequence_number = safety_sequence_number;
    }

    public Integer getRole_sequence_number() {
        return role_sequence_number;
    }

    public void setRole_sequence_number(Integer role_sequence_number) {
        this.role_sequence_number = role_sequence_number;
    }

    public String getMirroring_guid() {
        return mirroring_guid;
    }

    public void setMirroring_guid(String mirroring_guid) {
        this.mirroring_guid = mirroring_guid == null ? null : mirroring_guid.trim();
    }

    public String getFamily_guid() {
        return family_guid;
    }

    public void setFamily_guid(String family_guid) {
        this.family_guid = family_guid == null ? null : family_guid.trim();
    }

    public Boolean getIs_suspended() {
        return is_suspended;
    }

    public void setIs_suspended(Boolean is_suspended) {
        this.is_suspended = is_suspended;
    }

    public Integer getIs_suspended_sequence_number() {
        return is_suspended_sequence_number;
    }

    public void setIs_suspended_sequence_number(Integer is_suspended_sequence_number) {
        this.is_suspended_sequence_number = is_suspended_sequence_number;
    }

    public Byte getPartner_sync_state() {
        return partner_sync_state;
    }

    public void setPartner_sync_state(Byte partner_sync_state) {
        this.partner_sync_state = partner_sync_state;
    }

    public String getPartner_sync_state_desc() {
        return partner_sync_state_desc;
    }

    public void setPartner_sync_state_desc(String partner_sync_state_desc) {
        this.partner_sync_state_desc = partner_sync_state_desc == null ? null : partner_sync_state_desc.trim();
    }
}