package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysforeignkeys;

public interface SysforeignkeysMapper {
    int insert(Sysforeignkeys record);

    int insertSelective(Sysforeignkeys record);
}