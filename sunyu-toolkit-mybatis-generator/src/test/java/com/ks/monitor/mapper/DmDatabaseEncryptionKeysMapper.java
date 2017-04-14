package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmDatabaseEncryptionKeys;

public interface DmDatabaseEncryptionKeysMapper {
    int insert(DmDatabaseEncryptionKeys record);

    int insertSelective(DmDatabaseEncryptionKeys record);
}