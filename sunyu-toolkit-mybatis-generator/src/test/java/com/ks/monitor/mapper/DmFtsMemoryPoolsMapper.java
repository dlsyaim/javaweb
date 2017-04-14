package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmFtsMemoryPools;

public interface DmFtsMemoryPoolsMapper {
    int insert(DmFtsMemoryPools record);

    int insertSelective(DmFtsMemoryPools record);
}