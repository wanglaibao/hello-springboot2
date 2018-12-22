package com.laibao.springboot2.traditionalmybatisapp.service;


import com.laibao.springboot2.traditionalmybatisapp.domain.SysDistrict;

import java.util.List;

public interface SysDistrictService {

    List<SysDistrict> selectByCityId(String cityId);

    SysDistrict selectByPrimaryKey(SysDistrict key);
}
