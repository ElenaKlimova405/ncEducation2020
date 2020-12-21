package com.nc.autumn2020.lessons.lesson28;


import org.h2.jdbcx.JdbcDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class H2DB {
    @Bean
    public DataSource getDataSource(){
        JdbcDataSource h2dataSource = new JdbcDataSource();
        h2dataSource.setUser("User1");
        h2dataSource.setPassword("User1");
        h2dataSource.setURL("jdbc:h2:F:\\1");
        return h2dataSource;
    }
}
