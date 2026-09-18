package com.spring.objectCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class twoSameObjects {
    public static void main(String[] args) {
        //create objects as configure file beans
        ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");

//        Developer dev=(Developer)context.getBean("devobj");
//        dev.code();
    }
}
