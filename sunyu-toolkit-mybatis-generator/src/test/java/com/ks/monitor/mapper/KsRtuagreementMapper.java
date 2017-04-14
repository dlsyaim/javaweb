package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsRtuagreement;

public interface KsRtuagreementMapper {
    int deleteByPrimaryKey(Long agreeMentID);

    int insert(KsRtuagreement record);

    int insertSelective(KsRtuagreement record);

    KsRtuagreement selectByPrimaryKey(Long agreeMentID);

    int updateByPrimaryKeySelective(KsRtuagreement record);

    int updateByPrimaryKey(KsRtuagreement record);
}