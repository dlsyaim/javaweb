package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsClusterNodes;

public interface DmOsClusterNodesMapper {
    int insert(DmOsClusterNodes record);

    int insertSelective(DmOsClusterNodes record);
}