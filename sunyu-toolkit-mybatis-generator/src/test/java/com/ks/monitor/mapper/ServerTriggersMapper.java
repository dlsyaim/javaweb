package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerTriggers;

public interface ServerTriggersMapper {
    int insert(ServerTriggers record);

    int insertSelective(ServerTriggers record);
}