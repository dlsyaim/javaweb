package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Filegroups;

public interface FilegroupsMapper {
    int insert(Filegroups record);

    int insertSelective(Filegroups record);
}