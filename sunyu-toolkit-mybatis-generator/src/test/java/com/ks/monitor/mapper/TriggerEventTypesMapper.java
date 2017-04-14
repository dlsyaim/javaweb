package com.ks.monitor.mapper;

import com.ks.monitor.pojo.TriggerEventTypes;

public interface TriggerEventTypesMapper {
    int insert(TriggerEventTypes record);

    int insertSelective(TriggerEventTypes record);
}