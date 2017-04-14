package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmReplArticlesWithBLOBs;

public interface DmReplArticlesMapper {
    int insert(DmReplArticlesWithBLOBs record);

    int insertSelective(DmReplArticlesWithBLOBs record);
}