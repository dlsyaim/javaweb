package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsCitys;

public interface KsCitysMapper {
    int deleteByPrimaryKey(Long cityID);

    int insert(KsCitys record);

    int insertSelective(KsCitys record);

    KsCitys selectByPrimaryKey(Long cityID);

    int updateByPrimaryKeySelective(KsCitys record);

    int updateByPrimaryKey(KsCitys record);
}