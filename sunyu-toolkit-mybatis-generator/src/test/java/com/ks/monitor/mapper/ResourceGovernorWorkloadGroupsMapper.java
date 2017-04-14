package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ResourceGovernorWorkloadGroups;

public interface ResourceGovernorWorkloadGroupsMapper {
    int insert(ResourceGovernorWorkloadGroups record);

    int insertSelective(ResourceGovernorWorkloadGroups record);
}