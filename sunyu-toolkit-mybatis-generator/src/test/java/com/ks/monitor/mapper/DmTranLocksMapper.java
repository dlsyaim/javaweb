package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmTranLocks;

public interface DmTranLocksMapper {
    int insert(DmTranLocks record);

    int insertSelective(DmTranLocks record);
}