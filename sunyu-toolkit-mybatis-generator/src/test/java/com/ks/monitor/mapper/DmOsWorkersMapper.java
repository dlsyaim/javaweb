package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsWorkersWithBLOBs;

public interface DmOsWorkersMapper {
    int insert(DmOsWorkersWithBLOBs record);

    int insertSelective(DmOsWorkersWithBLOBs record);
}