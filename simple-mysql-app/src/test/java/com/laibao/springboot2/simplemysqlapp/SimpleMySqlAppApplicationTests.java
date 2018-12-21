package com.laibao.springboot2.simplemysqlapp;

import com.alibaba.fastjson.JSON;
import com.laibao.springboot2.simplemysqlapp.domain.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

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
		System.out.println("query result is : " + result.size());
		System.out.println("success");
		System.out.println();
		System.out.println(JSON.toJSONString(result));
	}


	@Test
	public void testMySqlForUpdate() {
		try {
			jdbcTemplate.execute("update sys_user set investor_id = 'aaaaa',user_name = 'user00100',phone = '123123123',email = '123123123@qq.com' where user_id = 'user001'");
			System.out.println("success");
		}catch (RuntimeException ex) {
			System.out.println("failure");
			throw ex;
		}
	}

	@Test
	public void testGetAllSysUsers() {
		String sql = "select * from sys_user";
		List<SysUser> userList = jdbcTemplate.query(sql, (ResultSet rs, int rowNum) -> {
						SysUser user = new SysUser();
						user.setUserId(rs.getString("user_id"));
						user.setInvestorId(rs.getString("investor_id"));
						user.setUserType(rs.getString("user_type"));
						user.setUserName(rs.getString("user_name"));
						user.setUserNickname(rs.getString("user_nickname"));
						user.setPassword(rs.getString("password"));
						user.setPhone(rs.getString("phone"));
						user.setEmail(rs.getString("email"));
						return user;
				});
		System.out.println("查询成功：");
		for (SysUser user : userList) {
			System.out.println(JSON.toJSONString(user));
		}
	}
}

