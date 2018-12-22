package com.laibao.springboot2.traditionalmybatisapp.mapper;

import com.laibao.springboot2.traditionalmybatisapp.annotation.MybatisMapper;
import com.laibao.springboot2.traditionalmybatisapp.domain.SysProvince;

@MybatisMapper
public interface SysProvinceMapper {
    int deleteByPrimaryKey(String provinceId);

    int insert(SysProvince sysProvince);

    int insertSelective(SysProvince sysProvince);

    SysProvince selectByPrimaryKey(String provinceId);

    int updateByPrimaryKeySelective(SysProvince sysProvince);

    int updateByPrimaryKey(SysProvince sysProvince);
}