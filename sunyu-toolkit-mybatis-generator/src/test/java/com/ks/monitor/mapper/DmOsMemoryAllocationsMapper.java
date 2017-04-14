package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsMemoryAllocationsWithBLOBs;

public interface DmOsMemoryAllocationsMapper {
    int insert(DmOsMemoryAllocationsWithBLOBs record);

    int insertSelective(DmOsMemoryAllocationsWithBLOBs record);
}