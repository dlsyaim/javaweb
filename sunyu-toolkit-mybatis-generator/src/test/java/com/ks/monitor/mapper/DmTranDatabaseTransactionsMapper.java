package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmTranDatabaseTransactions;

public interface DmTranDatabaseTransactionsMapper {
    int insert(DmTranDatabaseTransactions record);

    int insertSelective(DmTranDatabaseTransactions record);
}