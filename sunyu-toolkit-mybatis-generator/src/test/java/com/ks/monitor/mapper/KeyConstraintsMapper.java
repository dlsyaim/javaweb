package com.ks.monitor.mapper;

import com.ks.monitor.pojo.KeyConstraints;

public interface KeyConstraintsMapper {
    int insert(KeyConstraints record);

    int insertSelective(KeyConstraints record);
}