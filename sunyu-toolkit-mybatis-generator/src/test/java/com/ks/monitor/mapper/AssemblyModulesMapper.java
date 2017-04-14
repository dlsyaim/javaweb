package com.ks.monitor.mapper;

import com.ks.monitor.pojo.AssemblyModules;

public interface AssemblyModulesMapper {
    int insert(AssemblyModules record);

    int insertSelective(AssemblyModules record);
}