package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsVirtualAddressDump;

public interface DmOsVirtualAddressDumpMapper {
    int insert(DmOsVirtualAddressDump record);

    int insertSelective(DmOsVirtualAddressDump record);
}