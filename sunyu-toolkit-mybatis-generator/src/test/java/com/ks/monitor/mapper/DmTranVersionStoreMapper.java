package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmTranVersionStoreWithBLOBs;

public interface DmTranVersionStoreMapper {
    int insert(DmTranVersionStoreWithBLOBs record);

    int insertSelective(DmTranVersionStoreWithBLOBs record);
}