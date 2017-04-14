package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SyspermissionsWithBLOBs;

public interface SyspermissionsMapper {
    int insert(SyspermissionsWithBLOBs record);

    int insertSelective(SyspermissionsWithBLOBs record);
}