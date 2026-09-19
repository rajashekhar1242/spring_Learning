package com.spring.JavaConfiguration.ScopeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeAnnotation {
    public static void main(String[] args){
        //configure
        ApplicationContext context=new AnnotationConfigApplicationContext(configJava.class);

        Developer dev=context.getBean(Developer.class);
        dev.code();

        //Different objects is created every time getBeans is called.
        Developer dev1=context.getBean(Developer.class);
        dev.code();
    }
}
