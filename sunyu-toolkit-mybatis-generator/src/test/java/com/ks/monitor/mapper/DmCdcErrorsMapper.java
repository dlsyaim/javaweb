package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DmCdcErrors;

public interface DmCdcErrorsMapper {
    int insert(DmCdcErrors record);

    int insertSelective(DmCdcErrors record);
}