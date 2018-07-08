package com.kasiarakos.didemo.controllers;

import com.kasiarakos.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {

    private ConsructorInjectedController consructorInjectedController;

    @Before
    public void setUp(){
        this.consructorInjectedController = new ConsructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS, consructorInjectedController.sayHello());
    }


}
