package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SyscharsetsWithBLOBs;

public interface SyscharsetsMapper {
    int insert(SyscharsetsWithBLOBs record);

    int insertSelective(SyscharsetsWithBLOBs record);
}