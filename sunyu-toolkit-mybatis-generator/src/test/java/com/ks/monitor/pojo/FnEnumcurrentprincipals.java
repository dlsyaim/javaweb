package com.ks.monitor.pojo;

public class FnEnumcurrentprincipals {
    private String db_name;

    private String current_principal;

    private Integer mirroring_role;

    private Integer mirroring_state;

    public String getDb_name() {
        return db_name;
    }

    public void setDb_name(String db_name) {
        this.db_name = db_name == null ? null : db_name.trim();
    }

    public String getCurrent_principal() {
        return current_principal;
    }

    public void setCurrent_principal(String current_principal) {
        this.current_principal = current_principal == null ? null : current_principal.trim();
    }

    public Integer getMirroring_role() {
        return mirroring_role;
    }

    public void setMirroring_role(Integer mirroring_role) {
        this.mirroring_role = mirroring_role;
    }

    public Integer getMirroring_state() {
        return mirroring_state;
    }

    public void setMirroring_state(Integer mirroring_state) {
        this.mirroring_state = mirroring_state;
    }
}