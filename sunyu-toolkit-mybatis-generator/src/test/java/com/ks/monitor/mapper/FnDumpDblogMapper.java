package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FnDumpDblogWithBLOBs;

public interface FnDumpDblogMapper {
    int insert(FnDumpDblogWithBLOBs record);

    int insertSelective(FnDumpDblogWithBLOBs record);
}