package com.kasiarakos.didemo.controllers;

import com.kasiarakos.didemo.services.GreetingService;

public class ConsructorInjectedController {
    private GreetingService greetingService;

    public ConsructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
