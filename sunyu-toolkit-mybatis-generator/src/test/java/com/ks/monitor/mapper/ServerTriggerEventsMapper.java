package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerTriggerEvents;

public interface ServerTriggerEventsMapper {
    int insert(ServerTriggerEvents record);

    int insertSelective(ServerTriggerEvents record);
}