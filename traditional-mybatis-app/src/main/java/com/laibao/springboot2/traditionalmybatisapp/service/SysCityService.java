package com.laibao.springboot2.traditionalmybatisapp.service;


import com.laibao.springboot2.traditionalmybatisapp.domain.SysCity;

import java.util.List;

public interface SysCityService {

    List<SysCity> selectByProvinceId(String provinceId);

    SysCity selectByPrimaryKey(SysCity key);
}
