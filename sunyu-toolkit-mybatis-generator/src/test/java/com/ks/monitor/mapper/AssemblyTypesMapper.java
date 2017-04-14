package com.ks.monitor.mapper;

import com.ks.monitor.pojo.AssemblyTypes;

public interface AssemblyTypesMapper {
    int insert(AssemblyTypes record);

    int insertSelective(AssemblyTypes record);
}