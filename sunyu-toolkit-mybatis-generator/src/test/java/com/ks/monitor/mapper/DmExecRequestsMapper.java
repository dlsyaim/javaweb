package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecRequestsWithBLOBs;

public interface DmExecRequestsMapper {
    int insert(DmExecRequestsWithBLOBs record);

    int insertSelective(DmExecRequestsWithBLOBs record);
}