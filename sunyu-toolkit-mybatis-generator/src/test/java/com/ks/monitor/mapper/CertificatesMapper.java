package com.ks.monitor.mapper;

import com.ks.monitor.pojo.CertificatesWithBLOBs;

public interface CertificatesMapper {
    int insert(CertificatesWithBLOBs record);

    int insertSelective(CertificatesWithBLOBs record);
}