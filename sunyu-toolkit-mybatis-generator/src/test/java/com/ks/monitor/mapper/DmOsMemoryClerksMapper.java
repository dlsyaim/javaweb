package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsMemoryClerksWithBLOBs;

public interface DmOsMemoryClerksMapper {
    int insert(DmOsMemoryClerksWithBLOBs record);

    int insertSelective(DmOsMemoryClerksWithBLOBs record);
}