package com.laibao.springboot2.simplemybatisapp.service.impl;

import com.laibao.springboot2.simplemybatisapp.domain.SysDistrict;
import com.laibao.springboot2.simplemybatisapp.mapper.SysDistrictMapper;
import com.laibao.springboot2.simplemybatisapp.service.SysDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysDistrictService")
public class SysDistrictServiceImpl implements SysDistrictService {

    @Autowired
    private SysDistrictMapper sysDistrictMapper;


    @Override
    public List<SysDistrict> selectByCityId(String cityId) {
        return sysDistrictMapper.selectByCityId(cityId);
    }

    @Override
    public SysDistrict selectByPrimaryKey(SysDistrict key) {
        return sysDistrictMapper.selectByPrimaryKey(key);
    }
}
