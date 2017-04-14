package com.ks.monitor.pojo;

public class DmOsStacks {
    private Integer frame_index;

    private byte[] stack_address;

    private byte[] frame_address;

    public Integer getFrame_index() {
        return frame_index;
    }

    public void setFrame_index(Integer frame_index) {
        this.frame_index = frame_index;
    }

    public byte[] getStack_address() {
        return stack_address;
    }

    public void setStack_address(byte[] stack_address) {
        this.stack_address = stack_address;
    }

    public byte[] getFrame_address() {
        return frame_address;
    }

    public void setFrame_address(byte[] frame_address) {
        this.frame_address = frame_address;
    }
}