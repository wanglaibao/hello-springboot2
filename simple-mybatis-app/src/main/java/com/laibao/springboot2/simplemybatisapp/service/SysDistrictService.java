package com.laibao.springboot2.simplemybatisapp.service;

import com.laibao.springboot2.simplemybatisapp.domain.SysDistrict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysDistrictService {

    List<SysDistrict> selectByCityId(@Param("cityId") String cityId);

    SysDistrict selectByPrimaryKey(SysDistrict key);
}
