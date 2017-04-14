package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SysprocessesWithBLOBs;

public interface SysprocessesMapper {
    int insert(SysprocessesWithBLOBs record);

    int insertSelective(SysprocessesWithBLOBs record);
}