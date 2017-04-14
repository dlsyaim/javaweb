package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsBrand;

public interface KsBrandMapper {
    int deleteByPrimaryKey(Long brandID);

    int insert(KsBrand record);

    int insertSelective(KsBrand record);

    KsBrand selectByPrimaryKey(Long brandID);

    int updateByPrimaryKeySelective(KsBrand record);

    int updateByPrimaryKey(KsBrand record);
}