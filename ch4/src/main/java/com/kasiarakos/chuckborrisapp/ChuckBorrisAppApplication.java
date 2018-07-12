package com.kasiarakos.chuckborrisapp;

import com.kasiarakos.chuckborrisapp.services.JokeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class ChuckBorrisAppApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ChuckBorrisAppApplication.class, args);
    }
}
