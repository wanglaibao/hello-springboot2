package com.laibao.springboot2.traditionalmybatisapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = "classpath*:applicationContext.xml")
@SpringBootApplication
public class TraditionalMybatisAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(TraditionalMybatisAppApplication.class, args);
	}
}