package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsTankreal;

public interface KsTankrealMapper {
    int deleteByPrimaryKey(Long tankRealID);

    int insert(KsTankreal record);

    int insertSelective(KsTankreal record);

    KsTankreal selectByPrimaryKey(Long tankRealID);

    int updateByPrimaryKeySelective(KsTankreal record);

    int updateByPrimaryKey(KsTankreal record);
}