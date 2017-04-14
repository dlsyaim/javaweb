package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsMemoryCacheCounters;

public interface DmOsMemoryCacheCountersMapper {
    int insert(DmOsMemoryCacheCounters record);

    int insertSelective(DmOsMemoryCacheCounters record);
}