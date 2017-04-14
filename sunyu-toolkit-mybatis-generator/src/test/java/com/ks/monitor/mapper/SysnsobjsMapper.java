package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Sysnsobjs;

public interface SysnsobjsMapper {
    int insert(Sysnsobjs record);

    int insertSelective(Sysnsobjs record);
}