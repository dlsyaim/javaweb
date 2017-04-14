package com.ks.monitor.pojo;

public class DatabaselogWithBLOBs extends Databaselog {
    private String TSQL;

    private String xmlEvent;

    public String getTSQL() {
        return TSQL;
    }

    public void setTSQL(String TSQL) {
        this.TSQL = TSQL == null ? null : TSQL.trim();
    }

    public String getXmlEvent() {
        return xmlEvent;
    }

    public void setXmlEvent(String xmlEvent) {
        this.xmlEvent = xmlEvent == null ? null : xmlEvent.trim();
    }
}