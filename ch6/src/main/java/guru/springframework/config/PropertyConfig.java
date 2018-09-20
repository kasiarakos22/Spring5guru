package guru.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import guru.springframework.examplebeans.FakeDatasource;
import guru.springframework.examplebeans.FakeJmsBroker;

@Configuration
/*@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})*/
@PropertySources({
    @PropertySource("classpath:datasource.properties"),
    @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Value("${guru.username}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dburl}")
    String url;
    @Value("${java.home}")
    String javaHome;
    @Value("${guru.jms.username}")
    String jmsUsername;
    @Value("${guru.jms.password}")
    String jmsPassword;
    @Value("${guru.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDatasource fakeDatasource(){
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setPassword(password);
        fakeDatasource.setUrl(javaHome);
        fakeDatasource.setUser(user);
        return fakeDatasource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        fakeJmsBroker.setUsername(jmsUsername);
        return fakeJmsBroker;
    }

   /* @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }*/
}
