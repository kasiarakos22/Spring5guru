package com.kasiarakos.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImple2 implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Kasiarakos GURU" ;
    }
}
