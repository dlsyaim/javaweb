package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsMemoryBrokers;

public interface DmOsMemoryBrokersMapper {
    int insert(DmOsMemoryBrokers record);

    int insertSelective(DmOsMemoryBrokers record);
}