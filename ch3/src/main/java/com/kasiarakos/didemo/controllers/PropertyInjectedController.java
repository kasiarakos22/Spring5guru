package com.kasiarakos.didemo.controllers;

import com.kasiarakos.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImple2")
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
