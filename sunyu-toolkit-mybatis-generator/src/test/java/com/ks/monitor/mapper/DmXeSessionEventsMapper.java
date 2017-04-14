package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmXeSessionEvents;

public interface DmXeSessionEventsMapper {
    int insert(DmXeSessionEvents record);

    int insertSelective(DmXeSessionEvents record);
}