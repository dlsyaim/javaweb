package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Syscurconfigs;

public interface SyscurconfigsMapper {
    int insert(Syscurconfigs record);

    int insertSelective(Syscurconfigs record);
}