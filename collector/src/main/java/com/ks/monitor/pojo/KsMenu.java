package com.ks.monitor.pojo;

public class KsMenu {
    private Integer id;

    private String menuPage;

    private String menuName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuPage() {
        return menuPage;
    }

    public void setMenuPage(String menuPage) {
        this.menuPage = menuPage == null ? null : menuPage.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }
}