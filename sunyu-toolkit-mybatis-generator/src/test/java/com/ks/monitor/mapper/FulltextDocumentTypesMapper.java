package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FulltextDocumentTypes;

public interface FulltextDocumentTypesMapper {
    int insert(FulltextDocumentTypes record);

    int insertSelective(FulltextDocumentTypes record);
}