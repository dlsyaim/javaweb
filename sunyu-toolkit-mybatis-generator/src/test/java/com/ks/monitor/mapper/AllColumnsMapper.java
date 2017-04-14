package com.ks.monitor.mapper;

import com.ks.monitor.pojo.AllColumns;

public interface AllColumnsMapper {
    int insert(AllColumns record);

    int insertSelective(AllColumns record);
}