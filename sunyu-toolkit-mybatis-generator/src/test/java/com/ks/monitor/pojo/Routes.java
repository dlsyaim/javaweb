package com.ks.monitor.pojo;

import java.util.Date;

public class Routes {
    private String name;

    private Integer route_id;

    private Integer principal_id;

    private String remote_service_name;

    private String broker_instance;

    private Date lifetime;

    private String address;

    private String mirror_address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getRoute_id() {
        return route_id;
    }

    public void setRoute_id(Integer route_id) {
        this.route_id = route_id;
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

    public String getBroker_instance() {
        return broker_instance;
    }

    public void setBroker_instance(String broker_instance) {
        this.broker_instance = broker_instance == null ? null : broker_instance.trim();
    }

    public Date getLifetime() {
        return lifetime;
    }

    public void setLifetime(Date lifetime) {
        this.lifetime = lifetime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMirror_address() {
        return mirror_address;
    }

    public void setMirror_address(String mirror_address) {
        this.mirror_address = mirror_address == null ? null : mirror_address.trim();
    }
}