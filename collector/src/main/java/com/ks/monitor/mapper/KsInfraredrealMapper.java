package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsInfraredreal;

public interface KsInfraredrealMapper {
    int deleteByPrimaryKey(Long infraredRealID);

    int insert(KsInfraredreal record);

    int insertSelective(KsInfraredreal record);

    KsInfraredreal selectByPrimaryKey(Long infraredRealID);

    int updateByPrimaryKeySelective(KsInfraredreal record);

    int updateByPrimaryKey(KsInfraredreal record);
}