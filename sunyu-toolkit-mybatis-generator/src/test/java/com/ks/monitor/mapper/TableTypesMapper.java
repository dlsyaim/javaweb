package com.ks.monitor.mapper;

import com.ks.monitor.pojo.TableTypes;

public interface TableTypesMapper {
    int insert(TableTypes record);

    int insertSelective(TableTypes record);
}