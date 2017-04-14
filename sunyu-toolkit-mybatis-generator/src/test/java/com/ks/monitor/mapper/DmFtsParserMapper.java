package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmFtsParser;

public interface DmFtsParserMapper {
    int insert(DmFtsParser record);

    int insertSelective(DmFtsParser record);
}