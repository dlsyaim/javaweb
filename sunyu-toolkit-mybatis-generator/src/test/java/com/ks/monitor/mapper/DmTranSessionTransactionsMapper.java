package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmTranSessionTransactions;

public interface DmTranSessionTransactionsMapper {
    int insert(DmTranSessionTransactions record);

    int insertSelective(DmTranSessionTransactions record);
}