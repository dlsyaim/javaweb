package com.ks.monitor.mapper;

import com.ks.monitor.pojo.TmpKsBrand;

public interface TmpKsBrandMapper {
    int deleteByPrimaryKey(Long brandID);

    int insert(TmpKsBrand record);

    int insertSelective(TmpKsBrand record);

    TmpKsBrand selectByPrimaryKey(Long brandID);

    int updateByPrimaryKeySelective(TmpKsBrand record);

    int updateByPrimaryKey(TmpKsBrand record);
}