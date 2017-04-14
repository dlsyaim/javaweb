package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmOsSysInfo;

public interface DmOsSysInfoMapper {
    int insert(DmOsSysInfo record);

    int insertSelective(DmOsSysInfo record);
}