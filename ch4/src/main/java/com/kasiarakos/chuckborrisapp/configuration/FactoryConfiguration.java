package com.kasiarakos.chuckborrisapp.configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryConfiguration {

    @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotes(){
        return  new ChuckNorrisQuotes();
    }
}
