package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecSqlText;

public interface DmExecSqlTextMapper {
    int insert(DmExecSqlText record);

    int insertSelective(DmExecSqlText record);
}