package com.ks.monitor.mapper;

import com.ks.monitor.pojo.MasterKeyPasswords;

public interface MasterKeyPasswordsMapper {
    int insert(MasterKeyPasswords record);

    int insertSelective(MasterKeyPasswords record);
}