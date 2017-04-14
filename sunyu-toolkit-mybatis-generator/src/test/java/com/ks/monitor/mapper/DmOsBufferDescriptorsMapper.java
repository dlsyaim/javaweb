package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsBufferDescriptors;

public interface DmOsBufferDescriptorsMapper {
    int insert(DmOsBufferDescriptors record);

    int insertSelective(DmOsBufferDescriptors record);
}