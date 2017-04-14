package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsMenu;

public interface KsMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KsMenu record);

    int insertSelective(KsMenu record);

    KsMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KsMenu record);

    int updateByPrimaryKey(KsMenu record);
}