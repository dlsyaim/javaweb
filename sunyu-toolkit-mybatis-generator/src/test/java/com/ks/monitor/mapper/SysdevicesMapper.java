package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysdevices;

public interface SysdevicesMapper {
    int insert(Sysdevices record);

    int insertSelective(Sysdevices record);
}