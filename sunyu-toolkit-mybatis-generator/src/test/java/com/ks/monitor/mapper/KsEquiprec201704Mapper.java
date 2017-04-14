package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsEquiprec201704;

public interface KsEquiprec201704Mapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsEquiprec201704 record);

    int insertSelective(KsEquiprec201704 record);

    KsEquiprec201704 selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsEquiprec201704 record);

    int updateByPrimaryKey(KsEquiprec201704 record);
}