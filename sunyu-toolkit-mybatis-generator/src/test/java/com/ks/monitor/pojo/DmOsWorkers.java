package com.ks.monitor.pojo;

public class DmOsWorkers {
    private Integer status;

    private Boolean is_preemptive;

    private Boolean is_fiber;

    private Boolean is_sick;

    private Boolean is_in_cc_exception;

    private Boolean is_fatal_exception;

    private Boolean is_inside_catch;

    private Boolean is_in_polling_io_completion_routine;

    private Integer context_switch_count;

    private Integer pending_io_count;

    private Long pending_io_byte_count;

    private Integer pending_io_byte_average;

    private Long wait_started_ms_ticks;

    private Long wait_resumed_ms_ticks;

    private Long task_bound_ms_ticks;

    private Long worker_created_ms_ticks;

    private Integer exception_num;

    private Integer exception_severity;

    private Integer locale;

    private Long affinity;

    private String state;

    private Long start_quantum;

    private Long end_quantum;

    private String last_wait_type;

    private Integer return_code;

    private Long quantum_used;

    private Long max_quantum;

    private Integer boost_count;

    private Integer tasks_processed_count;

    private Short processor_group;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIs_preemptive() {
        return is_preemptive;
    }

    public void setIs_preemptive(Boolean is_preemptive) {
        this.is_preemptive = is_preemptive;
    }

    public Boolean getIs_fiber() {
        return is_fiber;
    }

    public void setIs_fiber(Boolean is_fiber) {
        this.is_fiber = is_fiber;
    }

    public Boolean getIs_sick() {
        return is_sick;
    }

    public void setIs_sick(Boolean is_sick) {
        this.is_sick = is_sick;
    }

    public Boolean getIs_in_cc_exception() {
        return is_in_cc_exception;
    }

    public void setIs_in_cc_exception(Boolean is_in_cc_exception) {
        this.is_in_cc_exception = is_in_cc_exception;
    }

    public Boolean getIs_fatal_exception() {
        return is_fatal_exception;
    }

    public void setIs_fatal_exception(Boolean is_fatal_exception) {
        this.is_fatal_exception = is_fatal_exception;
    }

    public Boolean getIs_inside_catch() {
        return is_inside_catch;
    }

    public void setIs_inside_catch(Boolean is_inside_catch) {
        this.is_inside_catch = is_inside_catch;
    }

    public Boolean getIs_in_polling_io_completion_routine() {
        return is_in_polling_io_completion_routine;
    }

    public void setIs_in_polling_io_completion_routine(Boolean is_in_polling_io_completion_routine) {
        this.is_in_polling_io_completion_routine = is_in_polling_io_completion_routine;
    }

    public Integer getContext_switch_count() {
        return context_switch_count;
    }

    public void setContext_switch_count(Integer context_switch_count) {
        this.context_switch_count = context_switch_count;
    }

    public Integer getPending_io_count() {
        return pending_io_count;
    }

    public void setPending_io_count(Integer pending_io_count) {
        this.pending_io_count = pending_io_count;
    }

    public Long getPending_io_byte_count() {
        return pending_io_byte_count;
    }

    public void setPending_io_byte_count(Long pending_io_byte_count) {
        this.pending_io_byte_count = pending_io_byte_count;
    }

    public Integer getPending_io_byte_average() {
        return pending_io_byte_average;
    }

    public void setPending_io_byte_average(Integer pending_io_byte_average) {
        this.pending_io_byte_average = pending_io_byte_average;
    }

    public Long getWait_started_ms_ticks() {
        return wait_started_ms_ticks;
    }

    public void setWait_started_ms_ticks(Long wait_started_ms_ticks) {
        this.wait_started_ms_ticks = wait_started_ms_ticks;
    }

    public Long getWait_resumed_ms_ticks() {
        return wait_resumed_ms_ticks;
    }

    public void setWait_resumed_ms_ticks(Long wait_resumed_ms_ticks) {
        this.wait_resumed_ms_ticks = wait_resumed_ms_ticks;
    }

    public Long getTask_bound_ms_ticks() {
        return task_bound_ms_ticks;
    }

    public void setTask_bound_ms_ticks(Long task_bound_ms_ticks) {
        this.task_bound_ms_ticks = task_bound_ms_ticks;
    }

    public Long getWorker_created_ms_ticks() {
        return worker_created_ms_ticks;
    }

    public void setWorker_created_ms_ticks(Long worker_created_ms_ticks) {
        this.worker_created_ms_ticks = worker_created_ms_ticks;
    }

    public Integer getException_num() {
        return exception_num;
    }

    public void setException_num(Integer exception_num) {
        this.exception_num = exception_num;
    }

    public Integer getException_severity() {
        return exception_severity;
    }

    public void setException_severity(Integer exception_severity) {
        this.exception_severity = exception_severity;
    }

    public Integer getLocale() {
        return locale;
    }

    public void setLocale(Integer locale) {
        this.locale = locale;
    }

    public Long getAffinity() {
        return affinity;
    }

    public void setAffinity(Long affinity) {
        this.affinity = affinity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getStart_quantum() {
        return start_quantum;
    }

    public void setStart_quantum(Long start_quantum) {
        this.start_quantum = start_quantum;
    }

    public Long getEnd_quantum() {
        return end_quantum;
    }

    public void setEnd_quantum(Long end_quantum) {
        this.end_quantum = end_quantum;
    }

    public String getLast_wait_type() {
        return last_wait_type;
    }

    public void setLast_wait_type(String last_wait_type) {
        this.last_wait_type = last_wait_type == null ? null : last_wait_type.trim();
    }

    public Integer getReturn_code() {
        return return_code;
    }

    public void setReturn_code(Integer return_code) {
        this.return_code = return_code;
    }

    public Long getQuantum_used() {
        return quantum_used;
    }

    public void setQuantum_used(Long quantum_used) {
        this.quantum_used = quantum_used;
    }

    public Long getMax_quantum() {
        return max_quantum;
    }

    public void setMax_quantum(Long max_quantum) {
        this.max_quantum = max_quantum;
    }

    public Integer getBoost_count() {
        return boost_count;
    }

    public void setBoost_count(Integer boost_count) {
        this.boost_count = boost_count;
    }

    public Integer getTasks_processed_count() {
        return tasks_processed_count;
    }

    public void setTasks_processed_count(Integer tasks_processed_count) {
        this.tasks_processed_count = tasks_processed_count;
    }

    public Short getProcessor_group() {
        return processor_group;
    }

    public void setProcessor_group(Short processor_group) {
        this.processor_group = processor_group;
    }
}