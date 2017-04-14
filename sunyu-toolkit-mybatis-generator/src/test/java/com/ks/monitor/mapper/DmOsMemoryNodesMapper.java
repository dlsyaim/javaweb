package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsMemoryNodes;

public interface DmOsMemoryNodesMapper {
    int insert(DmOsMemoryNodes record);

    int insertSelective(DmOsMemoryNodes record);
}