package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDbMissingIndexGroups;

public interface DmDbMissingIndexGroupsMapper {
    int insert(DmDbMissingIndexGroups record);

    int insertSelective(DmDbMissingIndexGroups record);
}