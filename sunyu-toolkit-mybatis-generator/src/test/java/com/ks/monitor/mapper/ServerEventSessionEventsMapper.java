package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerEventSessionEvents;

public interface ServerEventSessionEventsMapper {
    int insert(ServerEventSessionEvents record);

    int insertSelective(ServerEventSessionEvents record);
}