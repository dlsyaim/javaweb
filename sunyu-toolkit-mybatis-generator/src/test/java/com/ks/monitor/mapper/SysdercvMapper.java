package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SysdercvWithBLOBs;

public interface SysdercvMapper {
    int insert(SysdercvWithBLOBs record);

    int insertSelective(SysdercvWithBLOBs record);
}