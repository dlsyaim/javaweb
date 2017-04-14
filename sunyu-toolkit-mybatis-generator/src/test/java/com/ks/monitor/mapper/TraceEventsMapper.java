package com.ks.monitor.mapper;

import com.ks.monitor.pojo.TraceEvents;

public interface TraceEventsMapper {
    int insert(TraceEvents record);

    int insertSelective(TraceEvents record);
}