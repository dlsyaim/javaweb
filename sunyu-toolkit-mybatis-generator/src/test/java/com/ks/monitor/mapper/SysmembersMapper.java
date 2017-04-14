package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysmembers;

public interface SysmembersMapper {
    int insert(Sysmembers record);

    int insertSelective(Sysmembers record);
}