package com.ks.monitor.mapper;

import com.ks.monitor.pojo.AllViews;

public interface AllViewsMapper {
    int insert(AllViews record);

    int insertSelective(AllViews record);
}