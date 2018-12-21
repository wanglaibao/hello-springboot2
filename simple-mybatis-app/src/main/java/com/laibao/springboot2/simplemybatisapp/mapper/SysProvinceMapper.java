package com.laibao.springboot2.simplemybatisapp.mapper;

import com.laibao.springboot2.simplemybatisapp.domain.SysProvince;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysProvinceMapper {
    int deleteByPrimaryKey(String provinceId);

    int insert(SysProvince sysProvince);

    int insertSelective(SysProvince sysProvince);

    SysProvince selectByPrimaryKey(String provinceId);

    int updateByPrimaryKeySelective(SysProvince sysProvince);

    int updateByPrimaryKey(SysProvince sysProvince);
}