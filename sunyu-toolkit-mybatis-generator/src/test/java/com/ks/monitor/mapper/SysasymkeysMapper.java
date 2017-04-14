package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SysasymkeysWithBLOBs;

public interface SysasymkeysMapper {
    int insert(SysasymkeysWithBLOBs record);

    int insertSelective(SysasymkeysWithBLOBs record);
}