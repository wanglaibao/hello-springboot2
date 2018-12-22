package com.laibao.springboot2.javaconfigmybatisapp.service;

import com.laibao.springboot2.javaconfigmybatisapp.domain.SysDistrict;

import java.util.List;

public interface SysDistrictService {

    List<SysDistrict> selectByCityId(String cityId);

    SysDistrict selectByPrimaryKey(SysDistrict key);
}
