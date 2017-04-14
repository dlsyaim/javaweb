package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsPressure;

public interface KsPressureMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsPressure record);

    int insertSelective(KsPressure record);

    KsPressure selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsPressure record);

    int updateByPrimaryKeyWithBLOBs(KsPressure record);

    int updateByPrimaryKey(KsPressure record);
}