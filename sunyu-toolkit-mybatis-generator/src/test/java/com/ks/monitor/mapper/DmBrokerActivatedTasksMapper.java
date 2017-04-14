package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmBrokerActivatedTasks;

public interface DmBrokerActivatedTasksMapper {
    int insert(DmBrokerActivatedTasks record);

    int insertSelective(DmBrokerActivatedTasks record);
}