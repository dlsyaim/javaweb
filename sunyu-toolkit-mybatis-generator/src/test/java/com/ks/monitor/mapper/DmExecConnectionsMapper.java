package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecConnections;

public interface DmExecConnectionsMapper {
    int insert(DmExecConnections record);

    int insertSelective(DmExecConnections record);
}