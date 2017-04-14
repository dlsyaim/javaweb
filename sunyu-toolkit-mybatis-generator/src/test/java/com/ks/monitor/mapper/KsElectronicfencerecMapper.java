package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsElectronicfencerec;

public interface KsElectronicfencerecMapper {
    int deleteByPrimaryKey(Long electronicFenceID);

    int insert(KsElectronicfencerec record);

    int insertSelective(KsElectronicfencerec record);

    KsElectronicfencerec selectByPrimaryKey(Long electronicFenceID);

    int updateByPrimaryKeySelective(KsElectronicfencerec record);

    int updateByPrimaryKey(KsElectronicfencerec record);
}