package com.ks.monitor.pojo;

public class DmTranVersionStoreWithBLOBs extends DmTranVersionStore {
    private byte[] record_image_first_part;

    private byte[] record_image_second_part;

    public byte[] getRecord_image_first_part() {
        return record_image_first_part;
    }

    public void setRecord_image_first_part(byte[] record_image_first_part) {
        this.record_image_first_part = record_image_first_part;
    }

    public byte[] getRecord_image_second_part() {
        return record_image_second_part;
    }

    public void setRecord_image_second_part(byte[] record_image_second_part) {
        this.record_image_second_part = record_image_second_part;
    }
}