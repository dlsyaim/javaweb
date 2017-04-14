package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsElectronicfencereal;

public interface KsElectronicfencerealMapper {
    int deleteByPrimaryKey(Long electronicFenceID);

    int insert(KsElectronicfencereal record);

    int insertSelective(KsElectronicfencereal record);

    KsElectronicfencereal selectByPrimaryKey(Long electronicFenceID);

    int updateByPrimaryKeySelective(KsElectronicfencereal record);

    int updateByPrimaryKey(KsElectronicfencereal record);
}