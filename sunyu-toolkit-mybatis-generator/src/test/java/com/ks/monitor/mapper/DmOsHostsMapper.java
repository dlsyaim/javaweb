package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsHostsWithBLOBs;

public interface DmOsHostsMapper {
    int insert(DmOsHostsWithBLOBs record);

    int insertSelective(DmOsHostsWithBLOBs record);
}