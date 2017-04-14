package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbMirroringConnections;

public interface DmDbMirroringConnectionsMapper {
    int insert(DmDbMirroringConnections record);

    int insertSelective(DmDbMirroringConnections record);
}