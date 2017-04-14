package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ColumnTypeUsages;

public interface ColumnTypeUsagesMapper {
    int insert(ColumnTypeUsages record);

    int insertSelective(ColumnTypeUsages record);
}