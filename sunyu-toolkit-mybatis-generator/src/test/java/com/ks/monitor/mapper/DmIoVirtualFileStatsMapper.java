package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmIoVirtualFileStats;

public interface DmIoVirtualFileStatsMapper {
    int insert(DmIoVirtualFileStats record);

    int insertSelective(DmIoVirtualFileStats record);
}