package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SysallocunitsWithBLOBs;

public interface SysallocunitsMapper {
    int insert(SysallocunitsWithBLOBs record);

    int insertSelective(SysallocunitsWithBLOBs record);
}