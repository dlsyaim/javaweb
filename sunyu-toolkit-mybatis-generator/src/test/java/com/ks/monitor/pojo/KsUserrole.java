package com.ks.monitor.pojo;

import java.util.Date;

public class KsUserrole {
    private Long roleID;

    private Long roleParentID;

    private String roleName;

    private Long roleVal;

    private String addUser;

    private Date addTime;

    private Long dept;

    private Long orderBy;

    private Short status;

    public Long getRoleID() {
        return roleID;
    }

    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }

    public Long getRoleParentID() {
        return roleParentID;
    }

    public void setRoleParentID(Long roleParentID) {
        this.roleParentID = roleParentID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Long getRoleVal() {
        return roleVal;
    }

    public void setRoleVal(Long roleVal) {
        this.roleVal = roleVal;
    }

    public String getAddUser() {
        return addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser == null ? null : addUser.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Long getDept() {
        return dept;
    }

    public void setDept(Long dept) {
        this.dept = dept;
    }

    public Long getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Long orderBy) {
        this.orderBy = orderBy;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}