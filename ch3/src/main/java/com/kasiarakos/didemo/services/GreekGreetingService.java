package com.kasiarakos.didemo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class GreekGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Γεια από την ελληνική υπηρεσία";
    }
}
