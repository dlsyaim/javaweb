package com.ks.monitor.pojo;

public class ServiceContracts {
    private String name;

    private Integer service_contract_id;

    private Integer principal_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getService_contract_id() {
        return service_contract_id;
    }

    public void setService_contract_id(Integer service_contract_id) {
        this.service_contract_id = service_contract_id;
    }

    public Integer getPrincipal_id() {
        return principal_id;
    }

    public void setPrincipal_id(Integer principal_id) {
        this.principal_id = principal_id;
    }
}