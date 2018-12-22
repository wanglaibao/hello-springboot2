package com.laibao.springboot2.javaconfigmybatisapp.service.impl;

import com.laibao.springboot2.javaconfigmybatisapp.domain.SysProvince;
import com.laibao.springboot2.javaconfigmybatisapp.mapper.SysProvinceMapper;
import com.laibao.springboot2.javaconfigmybatisapp.service.SysProvinceService;
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
