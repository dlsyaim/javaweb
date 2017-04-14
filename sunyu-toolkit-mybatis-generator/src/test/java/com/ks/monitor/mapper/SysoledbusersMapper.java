package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysoledbusers;

public interface SysoledbusersMapper {
    int insert(Sysoledbusers record);

    int insertSelective(Sysoledbusers record);
}