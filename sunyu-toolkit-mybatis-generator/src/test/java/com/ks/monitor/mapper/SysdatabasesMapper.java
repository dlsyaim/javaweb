package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysdatabases;

public interface SysdatabasesMapper {
    int insert(Sysdatabases record);

    int insertSelective(Sysdatabases record);
}