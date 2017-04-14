package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmXeSessionTargetsWithBLOBs;

public interface DmXeSessionTargetsMapper {
    int insert(DmXeSessionTargetsWithBLOBs record);

    int insertSelective(DmXeSessionTargetsWithBLOBs record);
}