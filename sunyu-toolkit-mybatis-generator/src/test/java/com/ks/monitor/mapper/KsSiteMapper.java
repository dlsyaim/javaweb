package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsSite;

public interface KsSiteMapper {
    int deleteByPrimaryKey(Long siteID);

    int insert(KsSite record);

    int insertSelective(KsSite record);

    KsSite selectByPrimaryKey(Long siteID);

    int updateByPrimaryKeySelective(KsSite record);

    int updateByPrimaryKey(KsSite record);
}