package com.laibao.springboot2.simplemysqlapp;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

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
}

