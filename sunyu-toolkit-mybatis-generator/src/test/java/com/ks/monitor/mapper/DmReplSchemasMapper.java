package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmReplSchemasWithBLOBs;

public interface DmReplSchemasMapper {
    int insert(DmReplSchemasWithBLOBs record);

    int insertSelective(DmReplSchemasWithBLOBs record);
}