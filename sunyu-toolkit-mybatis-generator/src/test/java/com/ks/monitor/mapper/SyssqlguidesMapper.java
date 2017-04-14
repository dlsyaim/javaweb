package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SyssqlguidesWithBLOBs;

public interface SyssqlguidesMapper {
    int insert(SyssqlguidesWithBLOBs record);

    int insertSelective(SyssqlguidesWithBLOBs record);
}