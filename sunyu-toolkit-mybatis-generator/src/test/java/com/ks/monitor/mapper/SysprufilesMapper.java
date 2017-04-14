package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SysprufilesWithBLOBs;

public interface SysprufilesMapper {
    int insert(SysprufilesWithBLOBs record);

    int insertSelective(SysprufilesWithBLOBs record);
}