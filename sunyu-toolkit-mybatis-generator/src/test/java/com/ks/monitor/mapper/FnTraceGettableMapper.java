package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FnTraceGettableWithBLOBs;

public interface FnTraceGettableMapper {
    int insert(FnTraceGettableWithBLOBs record);

    int insertSelective(FnTraceGettableWithBLOBs record);
}