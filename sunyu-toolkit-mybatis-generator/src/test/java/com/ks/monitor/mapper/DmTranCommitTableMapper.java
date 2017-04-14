package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmTranCommitTable;

public interface DmTranCommitTableMapper {
    int insert(DmTranCommitTable record);

    int insertSelective(DmTranCommitTable record);
}