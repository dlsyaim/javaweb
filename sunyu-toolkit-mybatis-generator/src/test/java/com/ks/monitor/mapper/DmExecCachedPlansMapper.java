package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecCachedPlansWithBLOBs;

public interface DmExecCachedPlansMapper {
    int insert(DmExecCachedPlansWithBLOBs record);

    int insertSelective(DmExecCachedPlansWithBLOBs record);
}