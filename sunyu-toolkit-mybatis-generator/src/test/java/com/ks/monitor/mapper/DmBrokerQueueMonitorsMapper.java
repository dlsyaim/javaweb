package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmBrokerQueueMonitors;

public interface DmBrokerQueueMonitorsMapper {
    int insert(DmBrokerQueueMonitors record);

    int insertSelective(DmBrokerQueueMonitors record);
}