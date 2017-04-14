package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsXianAlarmlimit;

public interface KsXianAlarmlimitMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(KsXianAlarmlimit record);

    int insertSelective(KsXianAlarmlimit record);

    KsXianAlarmlimit selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(KsXianAlarmlimit record);

    int updateByPrimaryKey(KsXianAlarmlimit record);
}