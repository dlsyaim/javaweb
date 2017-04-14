package com.ks.monitor.mapper;

import com.ks.monitor.pojo.CheckConstraints;

public interface CheckConstraintsMapper {
    int insert(CheckConstraints record);

    int insertSelective(CheckConstraints record);
}