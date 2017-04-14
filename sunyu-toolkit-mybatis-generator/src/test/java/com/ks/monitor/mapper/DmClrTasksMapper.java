package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmClrTasksWithBLOBs;

public interface DmClrTasksMapper {
    int insert(DmClrTasksWithBLOBs record);

    int insertSelective(DmClrTasksWithBLOBs record);
}