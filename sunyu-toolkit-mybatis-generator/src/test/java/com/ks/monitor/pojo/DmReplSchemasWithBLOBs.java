package com.ks.monitor.pojo;

public class DmReplSchemasWithBLOBs extends DmReplSchemas {
    private byte[] artcache_schema_address;

    private byte[] pcitee;

    public byte[] getArtcache_schema_address() {
        return artcache_schema_address;
    }

    public void setArtcache_schema_address(byte[] artcache_schema_address) {
        this.artcache_schema_address = artcache_schema_address;
    }

    public byte[] getPcitee() {
        return pcitee;
    }

    public void setPcitee(byte[] pcitee) {
        this.pcitee = pcitee;
    }
}