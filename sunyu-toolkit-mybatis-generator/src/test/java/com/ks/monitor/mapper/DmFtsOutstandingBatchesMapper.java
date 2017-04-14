package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmFtsOutstandingBatchesWithBLOBs;

public interface DmFtsOutstandingBatchesMapper {
    int insert(DmFtsOutstandingBatchesWithBLOBs record);

    int insertSelective(DmFtsOutstandingBatchesWithBLOBs record);
}