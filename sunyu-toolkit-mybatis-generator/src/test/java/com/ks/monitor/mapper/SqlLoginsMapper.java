package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SqlLoginsWithBLOBs;

public interface SqlLoginsMapper {
    int insert(SqlLoginsWithBLOBs record);

    int insertSelective(SqlLoginsWithBLOBs record);
}