package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServiceQueues;

public interface ServiceQueuesMapper {
    int insert(ServiceQueues record);

    int insertSelective(ServiceQueues record);
}