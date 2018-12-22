package com.laibao.springboot2.javaconfigmybatisapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://locaohost:3306/test?useunicode=true&characterEncoding=utf8&useSSL=false&zeroDateTimeBehavior=convertToNull");
        dataSource.setUsername("root");
        dataSource.setPassword("1234567890");
        return dataSource;
    }
}
