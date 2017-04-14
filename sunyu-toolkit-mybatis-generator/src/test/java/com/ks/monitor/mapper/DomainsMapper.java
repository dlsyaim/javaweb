package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Domains;

public interface DomainsMapper {
    int insert(Domains record);

    int insertSelective(Domains record);
}