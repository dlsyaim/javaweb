package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KsEquiprec201601;

public interface KsEquiprec201601Mapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(KsEquiprec201601 record);

    int insertSelective(KsEquiprec201601 record);

    KsEquiprec201601 selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(KsEquiprec201601 record);

    int updateByPrimaryKey(KsEquiprec201601 record);
}