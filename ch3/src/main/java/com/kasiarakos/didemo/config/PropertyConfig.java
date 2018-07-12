package com.kasiarakos.didemo.config;

import com.kasiarakos.didemo.examplebeans.FakeDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Autowired
    Environment env;
    @Value("${guru.username}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.url}")
    String url;

    @Bean
    public FakeDatasource fakeDatasource(){
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setPassword(password);
        fakeDatasource.setUrl(url);
        fakeDatasource.setUsername("username"); //this is overridden by the @component on the class
        fakeDatasource.setJavaHome(env.getProperty("JAVA_HOME"));
        return fakeDatasource;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer configure(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
