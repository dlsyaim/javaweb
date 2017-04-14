package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Syspriorities;

public interface SysprioritiesMapper {
    int insert(Syspriorities record);

    int insertSelective(Syspriorities record);
}