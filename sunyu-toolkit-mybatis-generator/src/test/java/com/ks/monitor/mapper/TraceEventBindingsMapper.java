package com.ks.monitor.mapper;

import com.ks.monitor.pojo.TraceEventBindings;

public interface TraceEventBindingsMapper {
    int insert(TraceEventBindings record);

    int insertSelective(TraceEventBindings record);
}