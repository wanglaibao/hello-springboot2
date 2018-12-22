package com.laibao.springboot2.simplemybatisapp.service;

import com.laibao.springboot2.simplemybatisapp.domain.SysDistrict;
import java.util.List;

public interface SysDistrictService {

    List<SysDistrict> selectByCityId(String cityId);

    SysDistrict selectByPrimaryKey(SysDistrict key);
}
