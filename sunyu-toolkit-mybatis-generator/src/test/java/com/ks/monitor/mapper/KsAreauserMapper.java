package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsAreauser;

public interface KsAreauserMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(KsAreauser record);

    int insertSelective(KsAreauser record);

    KsAreauser selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(KsAreauser record);

    int updateByPrimaryKey(KsAreauser record);
}