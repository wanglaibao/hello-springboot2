package com.laibao.springboot2.traditionalmybatisapp.mapper;

import com.laibao.springboot2.traditionalmybatisapp.annotation.MybatisMapper;
import com.laibao.springboot2.traditionalmybatisapp.domain.SysCity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MybatisMapper
public interface SysCityMapper {

    int deleteByPrimaryKey(SysCity key);

    int insert(SysCity record);

    int insertSelective(SysCity record);

    List<SysCity> selectByProvinceId(@Param("provinceId") String provinceId);

    SysCity selectByPrimaryKey(SysCity key);

    int updateByPrimaryKeySelective(SysCity record);

    int updateByPrimaryKey(SysCity record);
}