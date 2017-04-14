package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ForeignKeys;

public interface ForeignKeysMapper {
    int insert(ForeignKeys record);

    int insertSelective(ForeignKeys record);
}