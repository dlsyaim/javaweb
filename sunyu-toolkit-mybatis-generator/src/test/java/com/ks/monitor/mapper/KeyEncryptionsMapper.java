package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KeyEncryptionsWithBLOBs;

public interface KeyEncryptionsMapper {
    int insert(KeyEncryptionsWithBLOBs record);

    int insertSelective(KeyEncryptionsWithBLOBs record);
}