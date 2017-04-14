package com.ks.monitor.mapper;

import com.ks.monitor.pojo.TraceSubclassValues;

public interface TraceSubclassValuesMapper {
    int insert(TraceSubclassValues record);

    int insertSelective(TraceSubclassValues record);
}