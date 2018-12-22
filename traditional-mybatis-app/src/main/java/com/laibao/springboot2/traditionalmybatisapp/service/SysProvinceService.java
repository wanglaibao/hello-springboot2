package com.laibao.springboot2.traditionalmybatisapp.service;


import com.laibao.springboot2.traditionalmybatisapp.domain.SysProvince;

public interface SysProvinceService {
    SysProvince selectByPrimaryKey(String provinceId);
}
