package com.ks.monitor.pojo;

public class ServiceContractMessageUsages {
    private Integer service_contract_id;

    private Integer message_type_id;

    private Boolean is_sent_by_initiator;

    private Boolean is_sent_by_target;

    public Integer getService_contract_id() {
        return service_contract_id;
    }

    public void setService_contract_id(Integer service_contract_id) {
        this.service_contract_id = service_contract_id;
    }

    public Integer getMessage_type_id() {
        return message_type_id;
    }

    public void setMessage_type_id(Integer message_type_id) {
        this.message_type_id = message_type_id;
    }

    public Boolean getIs_sent_by_initiator() {
        return is_sent_by_initiator;
    }

    public void setIs_sent_by_initiator(Boolean is_sent_by_initiator) {
        this.is_sent_by_initiator = is_sent_by_initiator;
    }

    public Boolean getIs_sent_by_target() {
        return is_sent_by_target;
    }

    public void setIs_sent_by_target(Boolean is_sent_by_target) {
        this.is_sent_by_target = is_sent_by_target;
    }
}