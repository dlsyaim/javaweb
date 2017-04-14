package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsEquiprec201702;

public interface KsEquiprec201702Mapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsEquiprec201702 record);

    int insertSelective(KsEquiprec201702 record);

    KsEquiprec201702 selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsEquiprec201702 record);

    int updateByPrimaryKey(KsEquiprec201702 record);
}