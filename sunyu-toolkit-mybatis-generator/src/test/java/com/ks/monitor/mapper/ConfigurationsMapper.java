package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Configurations;

public interface ConfigurationsMapper {
    int insert(Configurations record);

    int insertSelective(Configurations record);
}