package com.laibao.springboot2.javaconfigmybatisapp.service;


import com.laibao.springboot2.javaconfigmybatisapp.domain.SysProvince;

public interface SysProvinceService {
    SysProvince selectByPrimaryKey(String provinceId);
}
