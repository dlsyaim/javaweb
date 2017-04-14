package com.ks.monitor.mapper;

import com.ks.monitor.pojo.TriggerEvents;

public interface TriggerEventsMapper {
    int insert(TriggerEvents record);

    int insertSelective(TriggerEvents record);
}