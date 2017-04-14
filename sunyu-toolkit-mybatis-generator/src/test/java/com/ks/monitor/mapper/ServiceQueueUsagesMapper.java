package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServiceQueueUsages;

public interface ServiceQueueUsagesMapper {
    int insert(ServiceQueueUsages record);

    int insertSelective(ServiceQueueUsages record);
}