package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SystemInternalsAllocationUnitsWithBLOBs;

public interface SystemInternalsAllocationUnitsMapper {
    int insert(SystemInternalsAllocationUnitsWithBLOBs record);

    int insertSelective(SystemInternalsAllocationUnitsWithBLOBs record);
}