package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmTranCurrentTransaction;

public interface DmTranCurrentTransactionMapper {
    int insert(DmTranCurrentTransaction record);

    int insertSelective(DmTranCurrentTransaction record);
}