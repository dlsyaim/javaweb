package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FulltextLanguages;

public interface FulltextLanguagesMapper {
    int insert(FulltextLanguages record);

    int insertSelective(FulltextLanguages record);
}