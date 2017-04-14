package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsProvinces;

public interface KsProvincesMapper {
    int deleteByPrimaryKey(Long provinceID);

    int insert(KsProvinces record);

    int insertSelective(KsProvinces record);

    KsProvinces selectByPrimaryKey(Long provinceID);

    int updateByPrimaryKeySelective(KsProvinces record);

    int updateByPrimaryKey(KsProvinces record);
}