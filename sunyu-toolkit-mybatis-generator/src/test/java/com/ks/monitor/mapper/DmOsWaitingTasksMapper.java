package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsWaitingTasksWithBLOBs;

public interface DmOsWaitingTasksMapper {
    int insert(DmOsWaitingTasksWithBLOBs record);

    int insertSelective(DmOsWaitingTasksWithBLOBs record);
}