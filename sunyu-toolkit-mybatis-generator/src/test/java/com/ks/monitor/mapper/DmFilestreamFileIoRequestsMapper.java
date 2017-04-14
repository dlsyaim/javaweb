package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmFilestreamFileIoRequestsWithBLOBs;

public interface DmFilestreamFileIoRequestsMapper {
    int insert(DmFilestreamFileIoRequestsWithBLOBs record);

    int insertSelective(DmFilestreamFileIoRequestsWithBLOBs record);
}