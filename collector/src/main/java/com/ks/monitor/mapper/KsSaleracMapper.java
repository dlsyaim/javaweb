package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsSalerac;

public interface KsSaleracMapper {
    int deleteByPrimaryKey(Long saleID);

    int insert(KsSalerac record);

    int insertSelective(KsSalerac record);

    KsSalerac selectByPrimaryKey(Long saleID);

    int updateByPrimaryKeySelective(KsSalerac record);

    int updateByPrimaryKey(KsSalerac record);
}