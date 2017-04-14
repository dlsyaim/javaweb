package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Assemblies;

public interface AssembliesMapper {
    int insert(Assemblies record);

    int insertSelective(Assemblies record);
}