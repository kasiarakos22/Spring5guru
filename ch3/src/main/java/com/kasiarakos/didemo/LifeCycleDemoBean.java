package com.kasiarakos.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## Constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("set Bean factory "+beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("set Application Context "+applicationContext);
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("post Construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("pre Destroy");
    }


    public void afterInit() {
        System.out.println("after Init");
    }


    public void beforeInit() {
        System.out.println("before Init");
    }
}
