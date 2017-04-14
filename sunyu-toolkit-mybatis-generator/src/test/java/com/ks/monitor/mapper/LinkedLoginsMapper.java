package com.ks.monitor.mapper;

import com.ks.monitor.pojo.LinkedLogins;

public interface LinkedLoginsMapper {
    int insert(LinkedLogins record);

    int insertSelective(LinkedLogins record);
}