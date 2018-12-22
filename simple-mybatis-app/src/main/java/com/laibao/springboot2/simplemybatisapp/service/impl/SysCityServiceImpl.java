package com.laibao.springboot2.simplemybatisapp.service.impl;

import com.laibao.springboot2.simplemybatisapp.domain.SysCity;
import com.laibao.springboot2.simplemybatisapp.mapper.SysCityMapper;
import com.laibao.springboot2.simplemybatisapp.service.SysCityService;
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
