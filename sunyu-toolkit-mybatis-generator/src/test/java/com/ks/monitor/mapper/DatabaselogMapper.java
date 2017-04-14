package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DatabaselogWithBLOBs;

public interface DatabaselogMapper {
    int insert(DatabaselogWithBLOBs record);

    int insertSelective(DatabaselogWithBLOBs record);
}