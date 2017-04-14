package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsSchedulersWithBLOBs;

public interface DmOsSchedulersMapper {
    int insert(DmOsSchedulersWithBLOBs record);

    int insertSelective(DmOsSchedulersWithBLOBs record);
}