package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysxprops;

public interface SysxpropsMapper {
    int insert(Sysxprops record);

    int insertSelective(Sysxprops record);
}