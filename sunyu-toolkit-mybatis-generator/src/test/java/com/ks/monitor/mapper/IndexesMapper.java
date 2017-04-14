package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Indexes;

public interface IndexesMapper {
    int insert(Indexes record);

    int insertSelective(Indexes record);
}