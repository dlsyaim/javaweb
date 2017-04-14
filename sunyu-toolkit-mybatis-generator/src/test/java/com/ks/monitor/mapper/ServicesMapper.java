package com.ks.monitor.mapper;

import com.ks.monitor.pojo.Services;

public interface ServicesMapper {
    int insert(Services record);

    int insertSelective(Services record);
}