package com.laibao.springboot2.javaconfigmybatisapp.service;

import com.laibao.springboot2.javaconfigmybatisapp.domain.SysCity;

import java.util.List;

public interface SysCityService {

    List<SysCity> selectByProvinceId(String provinceId);

    SysCity selectByPrimaryKey(SysCity key);
}
