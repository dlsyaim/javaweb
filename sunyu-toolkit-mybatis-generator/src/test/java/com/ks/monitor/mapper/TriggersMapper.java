package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Triggers;

public interface TriggersMapper {
    int insert(Triggers record);

    int insertSelective(Triggers record);
}