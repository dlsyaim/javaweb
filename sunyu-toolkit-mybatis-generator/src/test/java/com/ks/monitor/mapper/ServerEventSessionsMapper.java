package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerEventSessions;

public interface ServerEventSessionsMapper {
    int insert(ServerEventSessions record);

    int insertSelective(ServerEventSessions record);
}