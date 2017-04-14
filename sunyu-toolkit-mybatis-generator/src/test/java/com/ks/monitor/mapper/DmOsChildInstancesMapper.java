package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsChildInstances;

public interface DmOsChildInstancesMapper {
    int insert(DmOsChildInstances record);

    int insertSelective(DmOsChildInstances record);
}