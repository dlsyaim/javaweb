package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsSysMemory;

public interface DmOsSysMemoryMapper {
    int insert(DmOsSysMemory record);

    int insertSelective(DmOsSysMemory record);
}