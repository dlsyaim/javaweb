package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SysftindsWithBLOBs;

public interface SysftindsMapper {
    int insert(SysftindsWithBLOBs record);

    int insertSelective(SysftindsWithBLOBs record);
}