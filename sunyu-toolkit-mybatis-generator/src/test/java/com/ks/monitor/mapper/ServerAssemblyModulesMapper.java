package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerAssemblyModules;

public interface ServerAssemblyModulesMapper {
    int insert(ServerAssemblyModules record);

    int insertSelective(ServerAssemblyModules record);
}