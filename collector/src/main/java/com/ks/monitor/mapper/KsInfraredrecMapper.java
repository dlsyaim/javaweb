package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsInfraredrec;

public interface KsInfraredrecMapper {
    int deleteByPrimaryKey(Long infraredRecID);

    int insert(KsInfraredrec record);

    int insertSelective(KsInfraredrec record);

    KsInfraredrec selectByPrimaryKey(Long infraredRecID);

    int updateByPrimaryKeySelective(KsInfraredrec record);

    int updateByPrimaryKey(KsInfraredrec record);
}