package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysobjects;

public interface SysobjectsMapper {
    int insert(Sysobjects record);

    int insertSelective(Sysobjects record);
}