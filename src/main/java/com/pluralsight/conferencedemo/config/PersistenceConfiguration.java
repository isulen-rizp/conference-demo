package com.pluralsight.conferencedemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
//    @Value("${DB_URL_CONFERENCE_APP}")
//    private String url;

    //Commented to make deployment on Heroku cloud deployment
//    @Bean
//    public DataSource dataSource(){
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.username("postgres")
//                .password("Welcome")
//                .url("jdbc:postgresql://192.168.99.100:5432/conference_app");
//        System.out.println("My custom datasource bean has been initialized and set |" );
//        return builder.build();
//    }
}
