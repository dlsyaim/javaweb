package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsNodesWithBLOBs;

public interface DmOsNodesMapper {
    int insert(DmOsNodesWithBLOBs record);

    int insertSelective(DmOsNodesWithBLOBs record);
}