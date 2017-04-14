package com.ks.monitor.mapper;

import com.ks.monitor.pojo.AssemblyReferences;

public interface AssemblyReferencesMapper {
    int insert(AssemblyReferences record);

    int insertSelective(AssemblyReferences record);
}