package com.kasiarakos.didemo;

import com.kasiarakos.didemo.controllers.ConsructorInjectedController;
import com.kasiarakos.didemo.controllers.MyController;
import com.kasiarakos.didemo.controllers.PropertyInjectedController;
import com.kasiarakos.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = context.getBean("myController", MyController.class);
        myController.hello();

        System.out.println(context.getBean(MyController.class).hello());
        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConsructorInjectedController.class).sayHello());
    }
}
