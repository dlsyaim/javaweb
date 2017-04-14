package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SysindexesWithBLOBs;

public interface SysindexesMapper {
    int insert(SysindexesWithBLOBs record);

    int insertSelective(SysindexesWithBLOBs record);
}