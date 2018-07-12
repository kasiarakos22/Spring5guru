package com.kasiarakos.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class GermanGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hallo Welt";
    }
}
