package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerEventSessionActions;

public interface ServerEventSessionActionsMapper {
    int insert(ServerEventSessionActions record);

    int insertSelective(ServerEventSessionActions record);
}