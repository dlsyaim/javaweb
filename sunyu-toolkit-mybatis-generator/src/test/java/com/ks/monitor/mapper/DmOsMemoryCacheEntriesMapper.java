package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsMemoryCacheEntriesWithBLOBs;

public interface DmOsMemoryCacheEntriesMapper {
    int insert(DmOsMemoryCacheEntriesWithBLOBs record);

    int insertSelective(DmOsMemoryCacheEntriesWithBLOBs record);
}