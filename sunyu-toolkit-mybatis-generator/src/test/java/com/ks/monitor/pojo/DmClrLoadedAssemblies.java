package com.ks.monitor.pojo;

import java.util.Date;

public class DmClrLoadedAssemblies {
    private Integer assembly_id;

    private Date load_time;

    private byte[] appdomain_address;

    public Integer getAssembly_id() {
        return assembly_id;
    }

    public void setAssembly_id(Integer assembly_id) {
        this.assembly_id = assembly_id;
    }

    public Date getLoad_time() {
        return load_time;
    }

    public void setLoad_time(Date load_time) {
        this.load_time = load_time;
    }

    public byte[] getAppdomain_address() {
        return appdomain_address;
    }

    public void setAppdomain_address(byte[] appdomain_address) {
        this.appdomain_address = appdomain_address;
    }
}