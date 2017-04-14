package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsWebsite;

public interface KsWebsiteMapper {
    int deleteByPrimaryKey(Long webSiteID);

    int insert(KsWebsite record);

    int insertSelective(KsWebsite record);

    KsWebsite selectByPrimaryKey(Long webSiteID);

    int updateByPrimaryKeySelective(KsWebsite record);

    int updateByPrimaryKey(KsWebsite record);
}