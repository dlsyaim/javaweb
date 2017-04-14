package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ExtendedProperties;

public interface ExtendedPropertiesMapper {
    int insert(ExtendedProperties record);

    int insertSelective(ExtendedProperties record);
}