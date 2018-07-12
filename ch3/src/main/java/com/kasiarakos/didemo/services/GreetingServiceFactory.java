package com.kasiarakos.didemo.services;

public class GreetingServiceFactory {


    public GreetingService createService(String lang){

        switch (lang){
            case "en":
                return new GreetingServiceImpl();
            case "el":
                return new GreekGreetingService();
            case "de":
                return new GermanGreetingService();
            default:
                 return new PrimaryGreetingService();
        }
    }
}
