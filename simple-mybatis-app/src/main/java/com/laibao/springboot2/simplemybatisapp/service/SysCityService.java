package com.laibao.springboot2.simplemybatisapp.service;
import com.laibao.springboot2.simplemybatisapp.domain.SysCity;

import java.util.List;

public interface SysCityService {

    List<SysCity> selectByProvinceId(String provinceId);

    SysCity selectByPrimaryKey(SysCity key);
}
