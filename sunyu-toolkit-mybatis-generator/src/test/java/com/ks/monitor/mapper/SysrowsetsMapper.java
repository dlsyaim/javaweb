package com.ks.monitor.mapper;

import com.ks.monitor.pojo.SysrowsetsWithBLOBs;

public interface SysrowsetsMapper {
    int insert(SysrowsetsWithBLOBs record);

    int insertSelective(SysrowsetsWithBLOBs record);
}