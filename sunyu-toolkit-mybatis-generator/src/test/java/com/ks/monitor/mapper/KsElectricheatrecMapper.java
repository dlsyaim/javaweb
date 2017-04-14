package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsElectricheatrec;

public interface KsElectricheatrecMapper {
    int deleteByPrimaryKey(Long electricHeatRealId);

    int insert(KsElectricheatrec record);

    int insertSelective(KsElectricheatrec record);

    KsElectricheatrec selectByPrimaryKey(Long electricHeatRealId);

    int updateByPrimaryKeySelective(KsElectricheatrec record);

    int updateByPrimaryKey(KsElectricheatrec record);
}