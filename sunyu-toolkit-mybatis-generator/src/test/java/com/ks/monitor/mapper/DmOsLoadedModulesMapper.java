package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsLoadedModules;

public interface DmOsLoadedModulesMapper {
    int insert(DmOsLoadedModules record);

    int insertSelective(DmOsLoadedModules record);
}