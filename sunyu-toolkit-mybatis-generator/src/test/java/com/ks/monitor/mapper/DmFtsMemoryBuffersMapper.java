package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmFtsMemoryBuffers;

public interface DmFtsMemoryBuffersMapper {
    int insert(DmFtsMemoryBuffers record);

    int insertSelective(DmFtsMemoryBuffers record);
}