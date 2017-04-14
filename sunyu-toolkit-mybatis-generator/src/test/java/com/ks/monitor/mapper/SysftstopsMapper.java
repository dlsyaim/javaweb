package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysftstops;

public interface SysftstopsMapper {
    int insert(Sysftstops record);

    int insertSelective(Sysftstops record);
}