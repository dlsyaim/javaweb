package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ResourceGovernorConfiguration;

public interface ResourceGovernorConfigurationMapper {
    int insert(ResourceGovernorConfiguration record);

    int insertSelective(ResourceGovernorConfiguration record);
}