package com.ks.monitor.pojo;

public class DmClrTasksWithBLOBs extends DmClrTasks {
    private byte[] task_address;

    private byte[] sos_task_address;

    private byte[] appdomain_address;

    public byte[] getTask_address() {
        return task_address;
    }

    public void setTask_address(byte[] task_address) {
        this.task_address = task_address;
    }

    public byte[] getSos_task_address() {
        return sos_task_address;
    }

    public void setSos_task_address(byte[] sos_task_address) {
        this.sos_task_address = sos_task_address;
    }

    public byte[] getAppdomain_address() {
        return appdomain_address;
    }

    public void setAppdomain_address(byte[] appdomain_address) {
        this.appdomain_address = appdomain_address;
    }
}