package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Columns;

public interface ColumnsMapper {
    int insert(Columns record);

    int insertSelective(Columns record);
}