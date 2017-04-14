package com.ks.monitor.mapper;

import com.ks.monitor.pojo.ServerFileAudits;

public interface ServerFileAuditsMapper {
    int insert(ServerFileAudits record);

    int insertSelective(ServerFileAudits record);
}