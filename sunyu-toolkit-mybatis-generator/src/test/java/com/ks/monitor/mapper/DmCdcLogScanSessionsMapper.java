package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmCdcLogScanSessions;

public interface DmCdcLogScanSessionsMapper {
    int insert(DmCdcLogScanSessions record);

    int insertSelective(DmCdcLogScanSessions record);
}