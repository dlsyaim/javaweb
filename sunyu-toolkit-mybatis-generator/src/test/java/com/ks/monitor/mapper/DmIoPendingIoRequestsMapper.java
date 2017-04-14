package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmIoPendingIoRequestsWithBLOBs;

public interface DmIoPendingIoRequestsMapper {
    int insert(DmIoPendingIoRequestsWithBLOBs record);

    int insertSelective(DmIoPendingIoRequestsWithBLOBs record);
}