package com.ks.monitor.pojo;

public class Syscursors {
    private Integer cursor_handle;

    private String cursor_name;

    private Integer status;

    private Byte model;

    private Byte concurrency;

    private Byte scrollable;

    private Byte open_status;

    private Long cursor_rows;

    private Short fetch_status;

    private Short column_count;

    private Long row_count;

    private Byte last_operation;

    public Integer getCursor_handle() {
        return cursor_handle;
    }

    public void setCursor_handle(Integer cursor_handle) {
        this.cursor_handle = cursor_handle;
    }

    public String getCursor_name() {
        return cursor_name;
    }

    public void setCursor_name(String cursor_name) {
        this.cursor_name = cursor_name == null ? null : cursor_name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Byte getModel() {
        return model;
    }

    public void setModel(Byte model) {
        this.model = model;
    }

    public Byte getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(Byte concurrency) {
        this.concurrency = concurrency;
    }

    public Byte getScrollable() {
        return scrollable;
    }

    public void setScrollable(Byte scrollable) {
        this.scrollable = scrollable;
    }

    public Byte getOpen_status() {
        return open_status;
    }

    public void setOpen_status(Byte open_status) {
        this.open_status = open_status;
    }

    public Long getCursor_rows() {
        return cursor_rows;
    }

    public void setCursor_rows(Long cursor_rows) {
        this.cursor_rows = cursor_rows;
    }

    public Short getFetch_status() {
        return fetch_status;
    }

    public void setFetch_status(Short fetch_status) {
        this.fetch_status = fetch_status;
    }

    public Short getColumn_count() {
        return column_count;
    }

    public void setColumn_count(Short column_count) {
        this.column_count = column_count;
    }

    public Long getRow_count() {
        return row_count;
    }

    public void setRow_count(Long row_count) {
        this.row_count = row_count;
    }

    public Byte getLast_operation() {
        return last_operation;
    }

    public void setLast_operation(Byte last_operation) {
        this.last_operation = last_operation;
    }
}