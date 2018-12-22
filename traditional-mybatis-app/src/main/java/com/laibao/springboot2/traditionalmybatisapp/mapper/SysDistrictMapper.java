package com.laibao.springboot2.traditionalmybatisapp.mapper;

import com.laibao.springboot2.traditionalmybatisapp.domain.SysDistrict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysDistrictMapper {

    int deleteByPrimaryKey(SysDistrict key);

    int insert(SysDistrict sysDistrict);

    int insertSelective(SysDistrict sysDistrict);

    List<SysDistrict> selectByCityId(@Param("cityId") String cityId);

    SysDistrict selectByPrimaryKey(SysDistrict key);

    int updateByPrimaryKeySelective(SysDistrict sysDistrict);

    int updateByPrimaryKey(SysDistrict record);
}