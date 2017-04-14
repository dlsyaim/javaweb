package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ZwProductsrealtest;

public interface ZwProductsrealtestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZwProductsrealtest record);

    int insertSelective(ZwProductsrealtest record);

    ZwProductsrealtest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZwProductsrealtest record);

    int updateByPrimaryKey(ZwProductsrealtest record);
}