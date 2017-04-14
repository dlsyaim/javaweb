package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Routes;

public interface RoutesMapper {
    int insert(Routes record);

    int insertSelective(Routes record);
}