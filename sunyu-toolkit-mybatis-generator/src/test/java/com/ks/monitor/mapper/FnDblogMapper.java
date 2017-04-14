package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FnDblogWithBLOBs;

public interface FnDblogMapper {
    int insert(FnDblogWithBLOBs record);

    int insertSelective(FnDblogWithBLOBs record);
}