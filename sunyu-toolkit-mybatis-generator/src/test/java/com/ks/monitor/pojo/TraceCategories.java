package com.ks.monitor.pojo;

public class TraceCategories {
    private Short category_id;

    private String name;

    private Byte type;

    public Short getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Short category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }
}