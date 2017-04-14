package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsXastation;

public interface KsXastationMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsXastation record);

    int insertSelective(KsXastation record);

    KsXastation selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsXastation record);

    int updateByPrimaryKeyWithBLOBs(KsXastation record);

    int updateByPrimaryKey(KsXastation record);
}