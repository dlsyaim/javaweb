package com.ks.monitor.pojo;

public class SyslockinfoWithBLOBs extends Syslockinfo {
    private byte[] rsc_bin;

    private byte[] rsc_valblk;

    public byte[] getRsc_bin() {
        return rsc_bin;
    }

    public void setRsc_bin(byte[] rsc_bin) {
        this.rsc_bin = rsc_bin;
    }

    public byte[] getRsc_valblk() {
        return rsc_valblk;
    }

    public void setRsc_valblk(byte[] rsc_valblk) {
        this.rsc_valblk = rsc_valblk;
    }
}