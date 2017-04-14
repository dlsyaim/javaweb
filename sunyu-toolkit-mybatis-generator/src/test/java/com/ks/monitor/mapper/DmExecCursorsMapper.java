package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmExecCursors;

public interface DmExecCursorsMapper {
    int insert(DmExecCursors record);

    int insertSelective(DmExecCursors record);
}