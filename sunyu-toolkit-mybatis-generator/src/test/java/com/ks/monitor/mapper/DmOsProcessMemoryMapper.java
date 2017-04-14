package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsProcessMemory;

public interface DmOsProcessMemoryMapper {
    int insert(DmOsProcessMemory record);

    int insertSelective(DmOsProcessMemory record);
}