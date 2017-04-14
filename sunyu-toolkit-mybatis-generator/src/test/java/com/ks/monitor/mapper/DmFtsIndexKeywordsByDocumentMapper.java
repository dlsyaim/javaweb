package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmFtsIndexKeywordsByDocument;

public interface DmFtsIndexKeywordsByDocumentMapper {
    int insert(DmFtsIndexKeywordsByDocument record);

    int insertSelective(DmFtsIndexKeywordsByDocument record);
}