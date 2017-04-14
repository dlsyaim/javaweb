package com.ks.monitor.mapper;

import com.ks.monitor.pojo.DatabaseMirroringWitnesses;

public interface DatabaseMirroringWitnessesMapper {
    int insert(DatabaseMirroringWitnesses record);

    int insertSelective(DatabaseMirroringWitnesses record);
}