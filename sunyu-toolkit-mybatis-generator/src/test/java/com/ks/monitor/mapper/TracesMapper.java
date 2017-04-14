package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Traces;

public interface TracesMapper {
    int insert(Traces record);

    int insertSelective(Traces record);
}