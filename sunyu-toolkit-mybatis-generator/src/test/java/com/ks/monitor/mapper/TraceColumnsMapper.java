package com.ks.monitor.mapper;

import com.ks.monitor.pojo.TraceColumns;

public interface TraceColumnsMapper {
    int insert(TraceColumns record);

    int insertSelective(TraceColumns record);
}