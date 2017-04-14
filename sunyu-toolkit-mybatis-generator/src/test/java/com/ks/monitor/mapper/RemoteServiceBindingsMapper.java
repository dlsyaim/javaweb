package com.ks.monitor.mapper;

import com.ks.monitor.pojo.RemoteServiceBindings;

public interface RemoteServiceBindingsMapper {
    int insert(RemoteServiceBindings record);

    int insertSelective(RemoteServiceBindings record);
}