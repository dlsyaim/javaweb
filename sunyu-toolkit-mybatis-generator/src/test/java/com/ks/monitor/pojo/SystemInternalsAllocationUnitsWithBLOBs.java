package com.ks.monitor.pojo;

public class SystemInternalsAllocationUnitsWithBLOBs extends SystemInternalsAllocationUnits {
    private byte[] first_page;

    private byte[] root_page;

    private byte[] first_iam_page;

    public byte[] getFirst_page() {
        return first_page;
    }

    public void setFirst_page(byte[] first_page) {
        this.first_page = first_page;
    }

    public byte[] getRoot_page() {
        return root_page;
    }

    public void setRoot_page(byte[] root_page) {
        this.root_page = root_page;
    }

    public byte[] getFirst_iam_page() {
        return first_iam_page;
    }

    public void setFirst_iam_page(byte[] first_iam_page) {
        this.first_iam_page = first_iam_page;
    }
}