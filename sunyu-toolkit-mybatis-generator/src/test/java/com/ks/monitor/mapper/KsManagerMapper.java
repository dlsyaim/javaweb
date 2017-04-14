package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsManager;

public interface KsManagerMapper {
    int deleteByPrimaryKey(Long managerID);

    int insert(KsManager record);

    int insertSelective(KsManager record);

    KsManager selectByPrimaryKey(Long managerID);

    int updateByPrimaryKeySelective(KsManager record);

    int updateByPrimaryKey(KsManager record);
}