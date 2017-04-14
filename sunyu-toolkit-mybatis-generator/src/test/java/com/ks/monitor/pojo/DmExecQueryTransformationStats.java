package com.ks.monitor.pojo;

public class DmExecQueryTransformationStats {
    private String name;

    private Long promise_total;

    private Double promise_avg;

    private Long promised;

    private Long built_substitute;

    private Long succeeded;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPromise_total() {
        return promise_total;
    }

    public void setPromise_total(Long promise_total) {
        this.promise_total = promise_total;
    }

    public Double getPromise_avg() {
        return promise_avg;
    }

    public void setPromise_avg(Double promise_avg) {
        this.promise_avg = promise_avg;
    }

    public Long getPromised() {
        return promised;
    }

    public void setPromised(Long promised) {
        this.promised = promised;
    }

    public Long getBuilt_substitute() {
        return built_substitute;
    }

    public void setBuilt_substitute(Long built_substitute) {
        this.built_substitute = built_substitute;
    }

    public Long getSucceeded() {
        return succeeded;
    }

    public void setSucceeded(Long succeeded) {
        this.succeeded = succeeded;
    }
}