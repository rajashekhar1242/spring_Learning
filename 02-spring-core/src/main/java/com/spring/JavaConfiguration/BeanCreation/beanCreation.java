package com.spring.JavaConfiguration.BeanCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class beanCreation {
    public static void main(String[] args){
        //configure
        ApplicationContext context=new AnnotationConfigApplicationContext(configJava.class);

        Developer dev=context.getBean(Developer.class);
        dev.code();
    }
}
