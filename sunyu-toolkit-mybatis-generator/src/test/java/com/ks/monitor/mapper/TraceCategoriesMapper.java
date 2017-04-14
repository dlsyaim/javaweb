package com.ks.monitor.mapper;

import com.ks.monitor.pojo.TraceCategories;

public interface TraceCategoriesMapper {
    int insert(TraceCategories record);

    int insertSelective(TraceCategories record);
}