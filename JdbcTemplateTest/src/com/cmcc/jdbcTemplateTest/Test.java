package com.cmcc.jdbcTemplateTest;

import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;

public class Test {

    @org.junit.Test
    public void jdbcTemplateTest() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/shiro");
        ds.setUsername("root");
        ds.setPassword("root");
        
        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
    }
}
