package com.ks.monitor.pojo;

public class DmResourceGovernorConfiguration {
    private Integer classifier_function_id;

    private Byte is_reconfiguration_pending;

    public Integer getClassifier_function_id() {
        return classifier_function_id;
    }

    public void setClassifier_function_id(Integer classifier_function_id) {
        this.classifier_function_id = classifier_function_id;
    }

    public Byte getIs_reconfiguration_pending() {
        return is_reconfiguration_pending;
    }

    public void setIs_reconfiguration_pending(Byte is_reconfiguration_pending) {
        this.is_reconfiguration_pending = is_reconfiguration_pending;
    }
}