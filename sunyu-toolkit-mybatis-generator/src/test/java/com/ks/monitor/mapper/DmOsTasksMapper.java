package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsTasksWithBLOBs;

public interface DmOsTasksMapper {
    int insert(DmOsTasksWithBLOBs record);

    int insertSelective(DmOsTasksWithBLOBs record);
}