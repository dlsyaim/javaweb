package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Synonyms;

public interface SynonymsMapper {
    int insert(Synonyms record);

    int insertSelective(Synonyms record);
}