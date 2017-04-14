package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmFtsPopulationRangesWithBLOBs;

public interface DmFtsPopulationRangesMapper {
    int insert(DmFtsPopulationRangesWithBLOBs record);

    int insertSelective(DmFtsPopulationRangesWithBLOBs record);
}