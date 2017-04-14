package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysprotects;

public interface SysprotectsMapper {
    int insert(Sysprotects record);

    int insertSelective(Sysprotects record);
}