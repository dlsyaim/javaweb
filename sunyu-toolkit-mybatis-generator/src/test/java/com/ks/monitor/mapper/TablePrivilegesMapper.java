package com.ks.monitor.mapper;

import com.ks.monitor.pojo.TablePrivileges;

public interface TablePrivilegesMapper {
    int insert(TablePrivileges record);

    int insertSelective(TablePrivileges record);
}