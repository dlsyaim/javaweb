package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsMemoryPools;

public interface DmOsMemoryPoolsMapper {
    int insert(DmOsMemoryPools record);

    int insertSelective(DmOsMemoryPools record);
}