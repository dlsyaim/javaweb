package com.ks.monitor.mapper;

import com.ks.monitor.pojo.IndexColumns;

public interface IndexColumnsMapper {
    int insert(IndexColumns record);

    int insertSelective(IndexColumns record);
}