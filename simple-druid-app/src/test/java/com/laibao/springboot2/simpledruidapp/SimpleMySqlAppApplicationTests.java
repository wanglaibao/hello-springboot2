package com.laibao.springboot2.simpledruidapp;

import com.alibaba.fastjson.JSON;
import com.laibao.springboot2.simpledruidapp.domain.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleMySqlAppApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("应用启动成功了");
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	public void testMySqlForQuery() {
		List<Map<String,Object>> result = jdbcTemplate.queryForList("select * from sys_user");
		System.out.println(JSON.toJSONString(result));
	}


	@Test
	public void testMySqlForUpdate() {
		try {
			jdbcTemplate.execute("update sys_user set investor_id = 'adaaaa',user_name = 'user001d00',phone = '123123123',email = '123123123@qq.com' where user_id = 'user001'");
			System.out.println("success");
		}catch (RuntimeException ex) {
			System.out.println("failure");
			throw ex;
		}
	}

	@Test
	public void testGetAllSysUsers() {
		String sql = "select * from sys_user";
		List<SysUser> userList = jdbcTemplate.query(sql,(ResultSet rs, int rowNum) -> convertToSysUser(rs,rowNum)).stream().filter(sysUser -> sysUser != null).collect(Collectors.toList());
		System.out.println("查询成功：");
		for (SysUser user : userList) {
			System.out.println(JSON.toJSONString(user));
		}
	}

	private SysUser convertToSysUser(ResultSet rs, int rowNum) {
		try {
			SysUser user = new SysUser();
			user.setUserId(rs.getString("user_id"));
			user.setInvestorId(rs.getString("investor_id"));
			user.setUserName(rs.getString("user_name"));
			user.setUserNickname(rs.getString("user_nickname"));
			user.setPassword(rs.getString("password"));
			user.setPhone(rs.getString("phone"));
			user.setEmail(rs.getString("email"));
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}

