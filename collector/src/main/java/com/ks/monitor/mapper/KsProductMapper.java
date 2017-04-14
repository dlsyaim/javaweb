package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsProduct;

public interface KsProductMapper {
    int deleteByPrimaryKey(Long productID);

    int insert(KsProduct record);

    int insertSelective(KsProduct record);

    KsProduct selectByPrimaryKey(Long productID);

    int updateByPrimaryKeySelective(KsProduct record);

    int updateByPrimaryKey(KsProduct record);
}