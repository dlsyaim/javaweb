package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmTranCurrentSnapshot;

public interface DmTranCurrentSnapshotMapper {
    int insert(DmTranCurrentSnapshot record);

    int insertSelective(DmTranCurrentSnapshot record);
}