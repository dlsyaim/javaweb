package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SymmetricKeys;

public interface SymmetricKeysMapper {
    int insert(SymmetricKeys record);

    int insertSelective(SymmetricKeys record);
}