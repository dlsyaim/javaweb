package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SysreferencesWithBLOBs;

public interface SysreferencesMapper {
    int insert(SysreferencesWithBLOBs record);

    int insertSelective(SysreferencesWithBLOBs record);
}