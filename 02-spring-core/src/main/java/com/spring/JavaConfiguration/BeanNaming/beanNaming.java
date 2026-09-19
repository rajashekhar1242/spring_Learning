package com.spring.JavaConfiguration.BeanNaming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class beanNaming {
    public static void main(String[] args){
        //configure
        ApplicationContext context=new AnnotationConfigApplicationContext(configJava.class);

        Developer dev=(Developer) context.getBean("dev2");
        //or
        Developer dev2=context.getBean("dev1",Developer.class);
        dev.code();
        dev2.code();
    }
}
