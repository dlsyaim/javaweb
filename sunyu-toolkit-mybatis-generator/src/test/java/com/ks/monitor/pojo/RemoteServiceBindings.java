package com.ks.monitor.pojo;

public class RemoteServiceBindings {
    private String name;

    private Integer remote_service_binding_id;

    private Integer principal_id;

    private String remote_service_name;

    private Integer service_contract_id;

    private Integer remote_principal_id;

    private Boolean is_anonymous_on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getRemote_service_binding_id() {
        return remote_service_binding_id;
    }

    public void setRemote_service_binding_id(Integer remote_service_binding_id) {
        this.remote_service_binding_id = remote_service_binding_id;
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }

    public String getRemote_service_name() {
        return remote_service_name;
    }

    public void setRemote_service_name(String remote_service_name) {
        this.remote_service_name = remote_service_name == null ? null : remote_service_name.trim();
    }

    public Integer getService_contract_id() {
        return service_contract_id;
    }

    public void setService_contract_id(Integer service_contract_id) {
        this.service_contract_id = service_contract_id;
    }

    public Integer getRemote_principal_id() {
        return remote_principal_id;
    }

    public void setRemote_principal_id(Integer remote_principal_id) {
        this.remote_principal_id = remote_principal_id;
    }

    public Boolean getIs_anonymous_on() {
        return is_anonymous_on;
    }

    public void setIs_anonymous_on(Boolean is_anonymous_on) {
        this.is_anonymous_on = is_anonymous_on;
    }
}