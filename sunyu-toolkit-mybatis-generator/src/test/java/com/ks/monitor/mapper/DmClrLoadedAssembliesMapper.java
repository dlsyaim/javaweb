package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmClrLoadedAssemblies;

public interface DmClrLoadedAssembliesMapper {
    int insert(DmClrLoadedAssemblies record);

    int insertSelective(DmClrLoadedAssemblies record);
}