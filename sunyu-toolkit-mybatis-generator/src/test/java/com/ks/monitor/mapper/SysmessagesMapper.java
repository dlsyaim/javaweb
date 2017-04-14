package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysmessages;

public interface SysmessagesMapper {
    int insert(Sysmessages record);

    int insertSelective(Sysmessages record);
}