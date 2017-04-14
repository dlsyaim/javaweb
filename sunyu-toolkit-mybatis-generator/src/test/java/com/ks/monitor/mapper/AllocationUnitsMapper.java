package com.ks.monitor.mapper;

import com.ks.monitor.pojo.AllocationUnits;

public interface AllocationUnitsMapper {
    int insert(AllocationUnits record);

    int insertSelective(AllocationUnits record);
}