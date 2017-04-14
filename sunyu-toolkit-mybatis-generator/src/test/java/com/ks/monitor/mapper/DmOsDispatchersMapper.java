package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsDispatchersWithBLOBs;

public interface DmOsDispatchersMapper {
    int insert(DmOsDispatchersWithBLOBs record);

    int insertSelective(DmOsDispatchersWithBLOBs record);
}