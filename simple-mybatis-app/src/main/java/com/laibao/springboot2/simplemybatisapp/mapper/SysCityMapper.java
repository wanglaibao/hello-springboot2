package com.laibao.springboot2.simplemybatisapp.mapper;

import com.laibao.springboot2.simplemybatisapp.domain.SysCity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysCityMapper {

    int deleteByPrimaryKey(SysCity key);

    int insert(SysCity record);

    int insertSelective(SysCity record);

    List<SysCity> selectByProvinceId(@Param("provinceId") String provinceId);

    SysCity selectByPrimaryKey(SysCity key);

    int updateByPrimaryKeySelective(SysCity record);

    int updateByPrimaryKey(SysCity record);
}