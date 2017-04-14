package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ComputedColumns;

public interface ComputedColumnsMapper {
    int insert(ComputedColumns record);

    int insertSelective(ComputedColumns record);
}