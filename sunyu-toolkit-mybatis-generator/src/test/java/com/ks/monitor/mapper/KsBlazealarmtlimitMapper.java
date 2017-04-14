package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsBlazealarmtlimit;

public interface KsBlazealarmtlimitMapper {
    int deleteByPrimaryKey(Long blaAlarmID);

    int insert(KsBlazealarmtlimit record);

    int insertSelective(KsBlazealarmtlimit record);

    KsBlazealarmtlimit selectByPrimaryKey(Long blaAlarmID);

    int updateByPrimaryKeySelective(KsBlazealarmtlimit record);

    int updateByPrimaryKey(KsBlazealarmtlimit record);
}