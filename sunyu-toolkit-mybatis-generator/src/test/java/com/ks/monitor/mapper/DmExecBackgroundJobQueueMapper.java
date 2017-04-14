package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecBackgroundJobQueue;

public interface DmExecBackgroundJobQueueMapper {
    int insert(DmExecBackgroundJobQueue record);

    int insertSelective(DmExecBackgroundJobQueue record);
}