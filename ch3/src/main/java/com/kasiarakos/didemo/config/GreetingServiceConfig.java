package com.kasiarakos.didemo.config;

import com.kasiarakos.didemo.services.GreetingService;
import com.kasiarakos.didemo.services.GreetingServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(){
        return new GreetingServiceFactory();
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    @Autowired
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    @Autowired
    GreetingService spanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createService("es");
    }

    @Bean
    @Primary
    @Profile("el")
    @Autowired
    GreetingService greekGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createService("el");
    }
}
