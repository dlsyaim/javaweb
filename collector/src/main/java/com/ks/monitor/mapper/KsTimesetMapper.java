package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsTimeset;

public interface KsTimesetMapper {
    int deleteByPrimaryKey(Long timeSetId);

    int insert(KsTimeset record);

    int insertSelective(KsTimeset record);

    KsTimeset selectByPrimaryKey(Long timeSetId);

    int updateByPrimaryKeySelective(KsTimeset record);

    int updateByPrimaryKey(KsTimeset record);
}