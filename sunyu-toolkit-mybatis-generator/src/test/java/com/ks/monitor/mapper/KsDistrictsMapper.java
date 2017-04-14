package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDistricts;

public interface KsDistrictsMapper {
    int deleteByPrimaryKey(Long districtID);

    int insert(KsDistricts record);

    int insertSelective(KsDistricts record);

    KsDistricts selectByPrimaryKey(Long districtID);

    int updateByPrimaryKeySelective(KsDistricts record);

    int updateByPrimaryKey(KsDistricts record);
}