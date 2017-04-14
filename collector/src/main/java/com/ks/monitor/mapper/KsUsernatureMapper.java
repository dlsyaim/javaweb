package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsUsernature;

public interface KsUsernatureMapper {
    int deleteByPrimaryKey(Long userID);

    int insert(KsUsernature record);

    int insertSelective(KsUsernature record);

    KsUsernature selectByPrimaryKey(Long userID);

    int updateByPrimaryKeySelective(KsUsernature record);

    int updateByPrimaryKey(KsUsernature record);
}