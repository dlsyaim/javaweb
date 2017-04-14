package com.ks.monitor.pojo;

public class ZwProductsrealtest {
    private Integer id;

    private String name;

    private Long pricDecimal;

    private Long quantDecimal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPricDecimal() {
        return pricDecimal;
    }

    public void setPricDecimal(Long pricDecimal) {
        this.pricDecimal = pricDecimal;
    }

    public Long getQuantDecimal() {
        return quantDecimal;
    }

    public void setQuantDecimal(Long quantDecimal) {
        this.quantDecimal = quantDecimal;
    }
}