package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FulltextStopwords;

public interface FulltextStopwordsMapper {
    int insert(FulltextStopwords record);

    int insertSelective(FulltextStopwords record);
}