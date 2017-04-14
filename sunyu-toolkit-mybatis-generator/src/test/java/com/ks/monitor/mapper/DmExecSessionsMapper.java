package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecSessionsWithBLOBs;

public interface DmExecSessionsMapper {
    int insert(DmExecSessionsWithBLOBs record);

    int insertSelective(DmExecSessionsWithBLOBs record);
}