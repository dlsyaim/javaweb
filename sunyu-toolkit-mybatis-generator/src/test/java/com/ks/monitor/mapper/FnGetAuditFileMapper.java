package com.ks.monitor.mapper;

import com.ks.monitor.pojo.FnGetAuditFileWithBLOBs;

public interface FnGetAuditFileMapper {
    int insert(FnGetAuditFileWithBLOBs record);

    int insertSelective(FnGetAuditFileWithBLOBs record);
}