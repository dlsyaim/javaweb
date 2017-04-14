package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DomainConstraints;

public interface DomainConstraintsMapper {
    int insert(DomainConstraints record);

    int insertSelective(DomainConstraints record);
}