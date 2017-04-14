package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDtu;

public interface KsDtuMapper {
    int deleteByPrimaryKey(Long dtuID);

    int insert(KsDtu record);

    int insertSelective(KsDtu record);

    KsDtu selectByPrimaryKey(Long dtuID);

    int updateByPrimaryKeySelective(KsDtu record);

    int updateByPrimaryKey(KsDtu record);
}