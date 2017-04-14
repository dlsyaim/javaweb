package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ModuleAssemblyUsages;

public interface ModuleAssemblyUsagesMapper {
    int insert(ModuleAssemblyUsages record);

    int insertSelective(ModuleAssemblyUsages record);
}