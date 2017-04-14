package com.ks.monitor.mapper;

import com.ks.monitor.pojo.HisSensordatarecord;

public interface HisSensordatarecordMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(HisSensordatarecord record);

    int insertSelective(HisSensordatarecord record);

    HisSensordatarecord selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(HisSensordatarecord record);

    int updateByPrimaryKey(HisSensordatarecord record);
}