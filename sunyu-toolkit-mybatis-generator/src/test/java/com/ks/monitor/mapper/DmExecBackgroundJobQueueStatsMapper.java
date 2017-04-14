package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecBackgroundJobQueueStats;

public interface DmExecBackgroundJobQueueStatsMapper {
    int insert(DmExecBackgroundJobQueueStats record);

    int insertSelective(DmExecBackgroundJobQueueStats record);
}