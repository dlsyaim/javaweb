package com.ks.monitor.mapper;

import com.ks.monitor.pojo.TableConstraints;

public interface TableConstraintsMapper {
    int insert(TableConstraints record);

    int insertSelective(TableConstraints record);
}