package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerEvents;

public interface ServerEventsMapper {
    int insert(ServerEvents record);

    int insertSelective(ServerEvents record);
}