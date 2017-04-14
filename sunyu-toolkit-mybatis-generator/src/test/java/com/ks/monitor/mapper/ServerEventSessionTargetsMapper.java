package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerEventSessionTargets;

public interface ServerEventSessionTargetsMapper {
    int insert(ServerEventSessionTargets record);

    int insertSelective(ServerEventSessionTargets record);
}