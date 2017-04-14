package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmFtsIndexPopulationWithBLOBs;

public interface DmFtsIndexPopulationMapper {
    int insert(DmFtsIndexPopulationWithBLOBs record);

    int insertSelective(DmFtsIndexPopulationWithBLOBs record);
}