package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DatabaseRecoveryStatus;

public interface DatabaseRecoveryStatusMapper {
    int insert(DatabaseRecoveryStatus record);

    int insertSelective(DatabaseRecoveryStatus record);
}