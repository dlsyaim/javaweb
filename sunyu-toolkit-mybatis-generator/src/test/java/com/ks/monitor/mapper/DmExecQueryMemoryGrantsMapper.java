package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecQueryMemoryGrantsWithBLOBs;

public interface DmExecQueryMemoryGrantsMapper {
    int insert(DmExecQueryMemoryGrantsWithBLOBs record);

    int insertSelective(DmExecQueryMemoryGrantsWithBLOBs record);
}