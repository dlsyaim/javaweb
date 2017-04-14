package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmClrProperties;

public interface DmClrPropertiesMapper {
    int insert(DmClrProperties record);

    int insertSelective(DmClrProperties record);
}