package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsPressureregulatorreal;

public interface KsPressureregulatorrealMapper {
    int deleteByPrimaryKey(Long pressureRegulatorRealId);

    int insert(KsPressureregulatorreal record);

    int insertSelective(KsPressureregulatorreal record);

    KsPressureregulatorreal selectByPrimaryKey(Long pressureRegulatorRealId);

    int updateByPrimaryKeySelective(KsPressureregulatorreal record);

    int updateByPrimaryKey(KsPressureregulatorreal record);
}