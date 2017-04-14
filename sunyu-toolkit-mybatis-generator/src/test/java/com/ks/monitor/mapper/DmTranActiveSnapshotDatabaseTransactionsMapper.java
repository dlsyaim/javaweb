package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmTranActiveSnapshotDatabaseTransactions;

public interface DmTranActiveSnapshotDatabaseTransactionsMapper {
    int insert(DmTranActiveSnapshotDatabaseTransactions record);

    int insertSelective(DmTranActiveSnapshotDatabaseTransactions record);
}