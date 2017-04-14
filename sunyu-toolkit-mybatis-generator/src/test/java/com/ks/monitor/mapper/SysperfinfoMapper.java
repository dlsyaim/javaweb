package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysperfinfo;

public interface SysperfinfoMapper {
    int insert(Sysperfinfo record);

    int insertSelective(Sysperfinfo record);
}