package com.ks.monitor.mapper;

import com.ks.monitor.pojo.AssemblyFiles;

public interface AssemblyFilesMapper {
    int insert(AssemblyFiles record);

    int insertSelective(AssemblyFiles record);
}