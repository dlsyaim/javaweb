package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysservers;

public interface SysserversMapper {
    int insert(Sysservers record);

    int insertSelective(Sysservers record);
}