package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsMemoryObjectsWithBLOBs;

public interface DmOsMemoryObjectsMapper {
    int insert(DmOsMemoryObjectsWithBLOBs record);

    int insertSelective(DmOsMemoryObjectsWithBLOBs record);
}