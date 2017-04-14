package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysprivs;

public interface SysprivsMapper {
    int insert(Sysprivs record);

    int insertSelective(Sysprivs record);
}