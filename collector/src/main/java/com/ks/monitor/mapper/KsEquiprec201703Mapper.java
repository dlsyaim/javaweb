package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsEquiprec201703;

public interface KsEquiprec201703Mapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsEquiprec201703 record);

    int insertSelective(KsEquiprec201703 record);

    KsEquiprec201703 selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsEquiprec201703 record);

    int updateByPrimaryKey(KsEquiprec201703 record);
}