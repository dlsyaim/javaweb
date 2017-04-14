package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsDtuinterface;

public interface KsDtuinterfaceMapper {
    int deleteByPrimaryKey(Long interFaceID);

    int insert(KsDtuinterface record);

    int insertSelective(KsDtuinterface record);

    KsDtuinterface selectByPrimaryKey(Long interFaceID);

    int updateByPrimaryKeySelective(KsDtuinterface record);

    int updateByPrimaryKey(KsDtuinterface record);
}