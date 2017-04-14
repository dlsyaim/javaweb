package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SystemViews;

public interface SystemViewsMapper {
    int insert(SystemViews record);

    int insertSelective(SystemViews record);
}