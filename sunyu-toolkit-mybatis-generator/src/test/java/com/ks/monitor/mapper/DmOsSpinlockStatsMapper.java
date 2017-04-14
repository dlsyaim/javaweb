package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsSpinlockStats;

public interface DmOsSpinlockStatsMapper {
    int insert(DmOsSpinlockStats record);

    int insertSelective(DmOsSpinlockStats record);
}