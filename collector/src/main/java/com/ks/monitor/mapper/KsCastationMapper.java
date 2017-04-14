package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsCastation;

public interface KsCastationMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsCastation record);

    int insertSelective(KsCastation record);

    KsCastation selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsCastation record);

    int updateByPrimaryKeyWithBLOBs(KsCastation record);

    int updateByPrimaryKey(KsCastation record);
}