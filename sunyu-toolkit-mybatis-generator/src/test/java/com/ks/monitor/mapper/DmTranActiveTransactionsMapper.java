package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmTranActiveTransactions;

public interface DmTranActiveTransactionsMapper {
    int insert(DmTranActiveTransactions record);

    int insertSelective(DmTranActiveTransactions record);
}