package com.kasiarakos.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "de")
@Primary
public class GermanGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hallo Welt";
    }
}
