package com.kasiarakos.didemo.controllers;

import com.kasiarakos.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConsructorInjectedController {
    private GreetingService greetingService;


    public ConsructorInjectedController( @Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
