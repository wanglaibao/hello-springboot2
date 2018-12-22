package com.laibao.springboot2.traditionalmybatisapp.service.impl;

import com.laibao.springboot2.traditionalmybatisapp.domain.SysProvince;
import com.laibao.springboot2.traditionalmybatisapp.mapper.SysProvinceMapper;
import com.laibao.springboot2.traditionalmybatisapp.service.SysProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysProvinceService")
public class SysProvinceServiceImpl implements SysProvinceService {

    @Autowired
    private SysProvinceMapper sysProvinceMapper;

    @Override
    public SysProvince selectByPrimaryKey(String provinceId) {
        return sysProvinceMapper.selectByPrimaryKey(provinceId);
    }
}
