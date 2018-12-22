package com.laibao.springboot2.simplemybatisapp;

import com.alibaba.fastjson.JSON;
import com.laibao.springboot2.simplemybatisapp.domain.SysCity;
import com.laibao.springboot2.simplemybatisapp.domain.SysDistrict;
import com.laibao.springboot2.simplemybatisapp.domain.SysProvince;
import com.laibao.springboot2.simplemybatisapp.service.SysCityService;
import com.laibao.springboot2.simplemybatisapp.service.SysDistrictService;
import com.laibao.springboot2.simplemybatisapp.service.SysProvinceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SimpleMybatisAppApplication.class)
public class SimpleMybatisAppApplicationTests {

	@Autowired
	private SysCityService sysCityService;

	@Autowired
	private SysDistrictService sysDistrictService;

	@Autowired
	private SysProvinceService sysProvinceService;

	@Test
	public void contextLoads() {
		System.out.println("应用启动成功了");
	}

	@Test
	public void testGetProvinceById() {
		String provinceId= "340000";
		SysProvince sysProvince = sysProvinceService.selectByPrimaryKey(provinceId);
		System.out.println(JSON.toJSONString(sysProvince));
	}

	@Test
	public void testGetSysCityListByProvinceId() {
		String provinceId= "340000";
		List<SysCity> sysCityList =  sysCityService.selectByProvinceId(provinceId);
		sysCityList.forEach(sysCity -> System.out.println(JSON.toJSONString(sysCity)));
	}

	@Test
	public void testGetSysDistrictByPrimaryKey() {
		SysDistrict key = new SysDistrict();
		key.setDistrictId("340811");
		key.setCityId("340800");

		SysDistrict sysDistrict = sysDistrictService.selectByPrimaryKey(key);
		System.out.println(JSON.toJSONString(sysDistrict));
	}

	@Test
	public void testGetSysDistrictListByCityId() {
		String cityId = "340800";
		List<SysDistrict> sysDistrictList = sysDistrictService.selectByCityId(cityId);
		sysDistrictList.forEach(sysDistrict -> System.out.println(JSON.toJSONString(sysDistrict)));
	}
}

