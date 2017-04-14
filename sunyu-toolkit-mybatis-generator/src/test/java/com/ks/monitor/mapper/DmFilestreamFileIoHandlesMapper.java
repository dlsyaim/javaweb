package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmFilestreamFileIoHandlesWithBLOBs;

public interface DmFilestreamFileIoHandlesMapper {
    int insert(DmFilestreamFileIoHandlesWithBLOBs record);

    int insertSelective(DmFilestreamFileIoHandlesWithBLOBs record);
}