package com.laibao.springboot2.traditionalmybatisapp.service.impl;

import com.laibao.springboot2.traditionalmybatisapp.domain.SysCity;
import com.laibao.springboot2.traditionalmybatisapp.mapper.SysCityMapper;
import com.laibao.springboot2.traditionalmybatisapp.service.SysCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysCityService")
public class SysCityServiceImpl implements SysCityService {

    @Autowired
    private SysCityMapper sysCityMapper;

    @Override
    public List<SysCity> selectByProvinceId(String provinceId) {
        return sysCityMapper.selectByProvinceId(provinceId);
    }

    @Override
    public SysCity selectByPrimaryKey(SysCity key) {
        return sysCityMapper.selectByPrimaryKey(key);
    }
}
