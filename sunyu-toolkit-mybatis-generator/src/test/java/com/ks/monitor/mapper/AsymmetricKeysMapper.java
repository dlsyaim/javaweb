package com.ks.monitor.mapper;

import com.ks.monitor.pojo.AsymmetricKeysWithBLOBs;

public interface AsymmetricKeysMapper {
    int insert(AsymmetricKeysWithBLOBs record);

    int insertSelective(AsymmetricKeysWithBLOBs record);
}