package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ColumnPrivileges;

public interface ColumnPrivilegesMapper {
    int insert(ColumnPrivileges record);

    int insertSelective(ColumnPrivileges record);
}