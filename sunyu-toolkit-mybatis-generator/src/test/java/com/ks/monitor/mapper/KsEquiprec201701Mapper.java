package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsEquiprec201701;

public interface KsEquiprec201701Mapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsEquiprec201701 record);

    int insertSelective(KsEquiprec201701 record);

    KsEquiprec201701 selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsEquiprec201701 record);

    int updateByPrimaryKey(KsEquiprec201701 record);
}