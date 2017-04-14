package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmBrokerConnections;

public interface DmBrokerConnectionsMapper {
    int insert(DmBrokerConnections record);

    int insertSelective(DmBrokerConnections record);
}