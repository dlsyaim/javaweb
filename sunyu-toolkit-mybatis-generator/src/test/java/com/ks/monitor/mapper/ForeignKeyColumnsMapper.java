package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ForeignKeyColumns;

public interface ForeignKeyColumnsMapper {
    int insert(ForeignKeyColumns record);

    int insertSelective(ForeignKeyColumns record);
}