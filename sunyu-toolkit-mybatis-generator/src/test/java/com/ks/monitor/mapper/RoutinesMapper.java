package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Routines;

public interface RoutinesMapper {
    int insert(Routines record);

    int insertSelective(Routines record);
}