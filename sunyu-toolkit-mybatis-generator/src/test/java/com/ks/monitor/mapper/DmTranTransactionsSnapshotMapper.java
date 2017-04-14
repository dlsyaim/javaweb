package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmTranTransactionsSnapshot;

public interface DmTranTransactionsSnapshotMapper {
    int insert(DmTranTransactionsSnapshot record);

    int insertSelective(DmTranTransactionsSnapshot record);
}