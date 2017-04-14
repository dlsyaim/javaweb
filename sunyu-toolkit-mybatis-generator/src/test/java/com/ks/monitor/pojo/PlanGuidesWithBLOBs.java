package com.ks.monitor.pojo;

public class PlanGuidesWithBLOBs extends PlanGuides {
    private String query_text;

    private String scope_batch;

    private String parameters;

    private String hints;

    public String getQuery_text() {
        return query_text;
    }

    public void setQuery_text(String query_text) {
        this.query_text = query_text == null ? null : query_text.trim();
    }

    public String getScope_batch() {
        return scope_batch;
    }

    public void setScope_batch(String scope_batch) {
        this.scope_batch = scope_batch == null ? null : scope_batch.trim();
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters == null ? null : parameters.trim();
    }

    public String getHints() {
        return hints;
    }

    public void setHints(String hints) {
        this.hints = hints == null ? null : hints.trim();
    }
}