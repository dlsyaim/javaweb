package com.ks.monitor.pojo;

public class DmReplTraninfoWithBLOBs extends DmReplTraninfo {
    private byte[] comp_range_address;

    private byte[] textinfo_address;

    private byte[] fsinfo_address;

    private byte[] artcache_table_address;

    public byte[] getComp_range_address() {
        return comp_range_address;
    }

    public void setComp_range_address(byte[] comp_range_address) {
        this.comp_range_address = comp_range_address;
    }

    public byte[] getTextinfo_address() {
        return textinfo_address;
    }

    public void setTextinfo_address(byte[] textinfo_address) {
        this.textinfo_address = textinfo_address;
    }

    public byte[] getFsinfo_address() {
        return fsinfo_address;
    }

    public void setFsinfo_address(byte[] fsinfo_address) {
        this.fsinfo_address = fsinfo_address;
    }

    public byte[] getArtcache_table_address() {
        return artcache_table_address;
    }

    public void setArtcache_table_address(byte[] artcache_table_address) {
        this.artcache_table_address = artcache_table_address;
    }
}