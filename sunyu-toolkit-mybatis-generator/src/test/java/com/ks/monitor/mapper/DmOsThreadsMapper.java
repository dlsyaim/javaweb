package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsThreadsWithBLOBs;

public interface DmOsThreadsMapper {
    int insert(DmOsThreadsWithBLOBs record);

    int insertSelective(DmOsThreadsWithBLOBs record);
}