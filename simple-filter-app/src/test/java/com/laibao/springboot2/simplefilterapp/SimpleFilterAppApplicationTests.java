package com.laibao.springboot2.simplefilterapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SimpleFilterAppApplication.class)
public class SimpleFilterAppApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("应用启动成功了");
	}

}

