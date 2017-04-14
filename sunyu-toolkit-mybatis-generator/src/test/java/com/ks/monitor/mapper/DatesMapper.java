package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Dates;

public interface DatesMapper {
    int insert(Dates record);

    int insertSelective(Dates record);
}