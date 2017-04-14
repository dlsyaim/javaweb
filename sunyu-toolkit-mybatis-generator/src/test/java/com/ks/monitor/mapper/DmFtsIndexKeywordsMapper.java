package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmFtsIndexKeywords;

public interface DmFtsIndexKeywordsMapper {
    int insert(DmFtsIndexKeywords record);

    int insertSelective(DmFtsIndexKeywords record);
}