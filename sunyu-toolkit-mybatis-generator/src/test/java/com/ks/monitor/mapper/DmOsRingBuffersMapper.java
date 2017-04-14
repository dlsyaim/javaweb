package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsRingBuffers;

public interface DmOsRingBuffersMapper {
    int insert(DmOsRingBuffers record);

    int insertSelective(DmOsRingBuffers record);
}