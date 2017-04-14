package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmReplTraninfoWithBLOBs;

public interface DmReplTraninfoMapper {
    int insert(DmReplTraninfoWithBLOBs record);

    int insertSelective(DmReplTraninfoWithBLOBs record);
}