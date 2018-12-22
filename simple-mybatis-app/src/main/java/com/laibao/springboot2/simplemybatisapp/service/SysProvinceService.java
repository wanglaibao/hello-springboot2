package com.laibao.springboot2.simplemybatisapp.service;


import com.laibao.springboot2.simplemybatisapp.domain.SysProvince;

public interface SysProvinceService {
    SysProvince selectByPrimaryKey(String provinceId);
}
