package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FulltextSystemStopwords;

public interface FulltextSystemStopwordsMapper {
    int insert(FulltextSystemStopwords record);

    int insertSelective(FulltextSystemStopwords record);
}