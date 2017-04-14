package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysaudacts;

public interface SysaudactsMapper {
    int insert(Sysaudacts record);

    int insertSelective(Sysaudacts record);
}