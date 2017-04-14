package com.ks.monitor.mapper;

import com.ks.monitor.pojo.TransmissionQueue;

public interface TransmissionQueueMapper {
    int insert(TransmissionQueue record);

    int insertSelective(TransmissionQueue record);
}