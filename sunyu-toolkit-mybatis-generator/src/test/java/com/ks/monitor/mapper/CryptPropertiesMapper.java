package com.ks.monitor.mapper;

import com.ks.monitor.pojo.CryptPropertiesWithBLOBs;

public interface CryptPropertiesMapper {
    int insert(CryptPropertiesWithBLOBs record);

    int insertSelective(CryptPropertiesWithBLOBs record);
}